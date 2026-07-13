$ErrorActionPreference = "Stop"

$basePath = "C:\Users\aless\OneDrive\Documents\Universita\Magistrale\Tor Vergata\1 anno\ISW2\Milestone4_Testing\syncope\core\persistence-jpa"
$targetFile = "$basePath\src\main\java\org\apache\syncope\core\persistence\jpa\dao\AbstractJPAAnySearchDAO.java"
$refactorPath = "$basePath\LLM refactoring"

$variants = @("C1", "C2", "C3", "C4")

foreach ($v in $variants) {
    Write-Host "Running SonarQube for $v..."
    $sourceFile = "$refactorPath\AbstractJPAAnySearchDAO_${v}.java"
    Copy-Item -Path $sourceFile -Destination $targetFile -Force

    $projectKey = "syncope-$($v.ToLower())"
    
    # Run Maven
    Set-Location $basePath
    $process = Start-Process -FilePath "mvn.cmd" -ArgumentList "clean", "verify", "sonar:sonar", "-DskipTests", "-Dcheckstyle.skip=true", "-Drat.skip=true", "-Dsonar.host.url=http://localhost:9000", "-Dsonar.login=squ_ed28199541fc08a5bf06f9c088006eb282d77bc5", "-Dsonar.projectKey=$projectKey" -Wait -NoNewWindow -PassThru
    
    if ($process.ExitCode -ne 0) {
        Write-Host "Maven failed for $v"
    } else {
        Write-Host "Maven succeeded for $v"
    }
}

Write-Host "Restoring C0..."
git restore "src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractJPAAnySearchDAO.java"
Write-Host "All done!"
