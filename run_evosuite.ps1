$ErrorActionPreference = "Stop"

$java8 = "C:\Users\aless\.jdks\corretto-1.8.0_492\bin\java.exe"
$evosuiteJar = "core\persistence-jpa\tools\evosuite-1.0.6.jar"

$classes = @(
    @{
        name = "org.apache.syncope.core.provisioning.java.DefaultMappingManager"
        cpFile = "core\provisioning-java\cp_java.txt"
        module = "core\provisioning-java"
        targetDir = "core\provisioning-java\target\classes"
    },
    @{
        name = "org.apache.syncope.core.provisioning.api.jexl.TemplateUtils"
        cpFile = "core\provisioning-api\cp_api.txt"
        module = "core\provisioning-api"
        targetDir = "core\provisioning-api\target\classes"
    }
)

Write-Host "Starting EvoSuite generation (60s budget per class)"

foreach ($cls in $classes) {
    Write-Host "Processing $($cls.name)"
    $cpDeps = Get-Content $cls.cpFile
    $cp = "$cpDeps;$($cls.targetDir)"

    $outputDir = "$($cls.module)\src\test\java\evosuite"
    if (-not (Test-Path $outputDir)) {
        New-Item -ItemType Directory -Path $outputDir | Out-Null
    }
    
    $cmd = "& `"$java8`" -jar `"$evosuiteJar`" -class $($cls.name) -projectCP `"$cp`" -Dsearch_budget=60 -Dtest_dir=`"$outputDir`""
    Write-Host "Executing: $cmd"
    Invoke-Expression $cmd
}
Write-Host "EvoSuite execution finished."
