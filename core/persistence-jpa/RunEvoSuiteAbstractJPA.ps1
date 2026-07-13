$ErrorActionPreference = 'Stop'

$className = "org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO"
$cp = Get-Content cp.txt
$fullCp = "target\classes;$cp"

# Use downloaded JDK 8
$jdkBinDir = Get-ChildItem -Path "tools\jdk8" -Directory | Select-Object -First 1
$javaExe = "$($jdkBinDir.FullName)\bin\java.exe"
$evosuiteJar = "tools\evosuite-1.0.6.jar"

$variants = @("C0", "C1", "C2", "C3", "C4")
$srcFile = "src\main\java\org\apache\syncope\core\persistence\jpa\dao\AbstractJPAAnySearchDAO.java"

foreach ($variant in $variants) {
    Write-Host "============================================="
    Write-Host "Running EvoSuite for AbstractJPAAnySearchDAO Variant $variant"
    Write-Host "============================================="

    if ($variant -eq "C0") {
        git checkout -- $srcFile
    } else {
        Copy-Item "LLM refactoring\AbstractJPAAnySearchDAO_$variant.java" -Destination $srcFile -Force
    }

    Write-Host "Compiling..."
    mvn clean compile | Out-Null
    
    if (-not (Test-Path "target\test-classes")) {
        New-Item -ItemType Directory -Path "target\test-classes" | Out-Null
    }

    Write-Host "Executing EvoSuite..."
    & $javaExe -jar $evosuiteJar -class $className -projectCP $fullCp -Dsearch_budget=120 -Dtest_dir="evosuite-tests-AbstractJPA-$variant"
    
    Write-Host "EvoSuite execution for $variant done."
}

git checkout -- $srcFile
Write-Host "Restored C0."
