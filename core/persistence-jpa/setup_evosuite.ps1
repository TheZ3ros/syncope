$ErrorActionPreference = 'Stop'

$toolsDir = "tools"
if (-not (Test-Path $toolsDir)) {
    New-Item -ItemType Directory -Path $toolsDir | Out-Null
}

$evosuiteJar = "$toolsDir\evosuite-1.0.6.jar"
if (-not (Test-Path $evosuiteJar)) {
    Write-Host "Downloading EvoSuite 1.0.6..."
    curl.exe -L -o $evosuiteJar "https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"
}

$jdkZip = "$toolsDir\jdk8.zip"
$jdkDir = "$toolsDir\jdk8"

if (-not (Test-Path $jdkDir)) {
    Write-Host "Downloading Adoptium JDK 8..."
    curl.exe -L -o $jdkZip "https://api.adoptium.net/v3/binary/latest/8/ga/windows/x64/jdk/hotspot/normal/eclipse"
    
    Write-Host "Extracting JDK 8..."
    Expand-Archive -Path $jdkZip -DestinationPath $jdkDir -Force
    
    Remove-Item $jdkZip
}

$jdkBinDir = Get-ChildItem -Path $jdkDir -Directory | Select-Object -First 1
Write-Host "JDK 8 is available at: $($jdkBinDir.FullName)"
