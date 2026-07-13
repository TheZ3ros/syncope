$ErrorActionPreference = "Stop"

$basePath = "C:\Users\aless\OneDrive\Documents\Universita\Magistrale\Tor Vergata\1 anno\ISW2\Milestone4_Testing\syncope\core\persistence-jpa"
$targetFile = "$basePath\src\main\java\org\apache\syncope\core\persistence\jpa\dao\SearchSupport.java"
$refactorPath = "$basePath\LLM refactoring"
$cp = Get-Content "$basePath\cp.txt"
$classpath = "target\classes;target\test-classes;tools\randoop-all-4.3.3.jar;$cp"

$variants = @("C1", "C2", "C3", "C4")

foreach ($v in $variants) {
    Write-Host "Running Randoop for $v..."
    $sourceFile = "$refactorPath\SearchSupport_${v}.java"
    Copy-Item -Path $sourceFile -Destination $targetFile -Force

    # Compile the new variant
    Set-Location $basePath
    Start-Process -FilePath "mvn.cmd" -ArgumentList "clean", "test-compile", "-DskipTests", "-Dcheckstyle.skip=true" -Wait -NoNewWindow
    
    # Run Randoop
    $basename = "SearchSupportRandoopTest${v}"
    $args = @(
        "-classpath", $classpath,
        "randoop.main.Main", "gentests",
        "--testclass=org.apache.syncope.core.persistence.jpa.dao.SearchSupport",
        "--time-limit=30",
        "--junit-output-dir=src/test/java",
        "--junit-package-name=org.apache.syncope.core.persistence.jpa.dao",
        "--regression-test-basename=$basename"
    )
    Start-Process -FilePath "java.exe" -ArgumentList $args -Wait -NoNewWindow
}

Write-Host "Restoring C0..."
git checkout "src/main/java/org/apache/syncope/core/persistence/jpa/dao/SearchSupport.java"
Write-Host "Randoop execution done!"
