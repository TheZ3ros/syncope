$dest = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao'
$files = @(
    'AbstractJAPAnySearchDAOTest_C1.java',
    'AbstractJPAAnySearchDAOTest_C2.java',
    'AbstractJPAAnySearchDAOTest_C3.java',
    'AbstractJPAAnySearchDAOTest_C4.java'
)

for ($i = 0; $i -lt 4; $i++) {
    $src = "LLM refactoring\" + $files[$i]
    $num = $i + 1
    $content = Get-Content -Raw -Path $src
    $content = $content -replace 'class AbstractJ(?:PA|AP)AnySearchDAOTest(?:_C\d+)?\b', "class AbstractJPAAnySearchDAOTestC$num"
    Set-Content -Path "$dest\AbstractJPAAnySearchDAOTestC$num.java" -Value $content
}
