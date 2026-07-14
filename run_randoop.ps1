$ErrorActionPreference = "Stop"
$randoopJar = "core\persistence-jpa\tools\randoop-all-4.3.3.jar"

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

Write-Host "Starting Randoop generation (10 runs per class, 30s limit)"

foreach ($cls in $classes) {
    Write-Host "Processing $($cls.name)"
    $cpDeps = Get-Content $cls.cpFile
    # Add target/classes to classpath
    $cp = "$cpDeps;$($cls.targetDir);$randoopJar"

    for ($i = 1; $i -le 10; $i++) {
        Write-Host "  Run $i/10 for $($cls.name)"
        $outputDir = "$($cls.module)\src\test\java\randoop\$i"
        if (-not (Test-Path $outputDir)) {
            New-Item -ItemType Directory -Path $outputDir | Out-Null
        }
        $logFile = "randoop_$($cls.name.Split('.')[-1])_$i.log"
        
        $cmd = "java -classpath `"$cp`" randoop.main.Main gentests --testclass=$($cls.name) --time-limit=30 --junit-output-dir=`"$outputDir`" --randomseed=$i"
        Invoke-Expression "$cmd > $logFile 2>&1"
    }
}
Write-Host "Randoop execution finished."
