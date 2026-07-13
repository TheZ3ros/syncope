$dest = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao'
$files = @(
    'AbstractJAPAnySearchDAOTest_C1.java',
    'AbstractJPAAnySearchDAOTest_C2.java',
    'AbstractJPAAnySearchDAOTest_C3.java',
    'AbstractJPAAnySearchDAOTest_C4.java'
)

$skeleton = Get-Content -Raw -Path 'test_skeleton.txt'

for ($i = 0; $i -lt 4; $i++) {
    $src = "LLM refactoring\" + $files[$i]
    $num = $i + 1
    
    # Read the file
    $content = Get-Content -Raw -Path $src
    
    # Extract only the methods. We strip everything before the first @Test or @InjectMocks
    # Alternatively, we just extract all `@Test` methods using regex
    $methods = [regex]::Matches($content, '(?s)@Test.*?\}')
    $methodsStr = ""
    foreach ($m in $methods) {
        $methodsStr += "`n    " + $m.Value + "`n"
    }

    $finalContent = ($skeleton -replace '<NUM>', $num) + $methodsStr + "`n}`n"
    Set-Content -Path "$dest\AbstractJPAAnySearchDAOTestC$num.java" -Value $finalContent
}
