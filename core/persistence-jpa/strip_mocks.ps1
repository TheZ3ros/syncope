$files = @('AbstractJPAAnySearchDAOTestC1.java', 'AbstractJPAAnySearchDAOTestC2.java', 'AbstractJPAAnySearchDAOTestC3.java', 'AbstractJPAAnySearchDAOTestC4.java')
foreach ($f in $files) {
    $p = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao\' + $f
    $content = Get-Content -Raw $p
    
    # Strip AnyUtils mocks from methods
    $content = $content -replace '(?s)AnyUtils anyUtils = mock\(AnyUtils\.class\);\s*when\(anyUtilsFactory\.getInstance\(AnyTypeKind\.USER\)\)\.thenReturn\(anyUtils\);\s*when\(anyUtils\.getField\("username"\)\)\.thenReturn\(Optional\.empty\(\)\);\s*', ''
    
    Set-Content -Path $p -Value $content
}
