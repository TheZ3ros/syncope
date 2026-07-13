$variants = @("c0", "c1", "c2", "c3", "c4")
foreach ($v in $variants) {
    $content = Get-Content "${v}_issues.json" -Raw
    if ($content) {
        $count = ([regex]::Matches($content, '"status":"OPEN"')).Count
        Write-Host "Variant ${v}: $count smells"
        
        $json = $content | ConvertFrom-Json
        $json.issues | Group-Object rule | Select-Object Name, Count | Format-Table -AutoSize
    }
}
