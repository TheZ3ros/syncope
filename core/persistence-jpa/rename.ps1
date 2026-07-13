$dest = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao'
foreach ($i in 1..4) {
    $content = Get-Content -Raw -Path "LLM refactoring\SearchSupportTest_C$i.java"
    $content = $content -replace "class SearchSupportTest\b", "class SearchSupportTestC$i"
    Set-Content -Path "$dest\SearchSupportTestC$i.java" -Value $content
}
