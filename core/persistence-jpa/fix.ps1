$dest = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao'
foreach ($i in 1..4) {
    $file = "$dest\SearchSupportTestC$i.java"
    if (Test-Path $file) {
        (Get-Content $file) -replace 'extends SearchSupport implements SearchViewSupport', 'extends SearchViewSupport' | Set-Content $file
    }
}
