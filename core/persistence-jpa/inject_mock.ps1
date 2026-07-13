$files = @('AbstractJPAAnySearchDAOTestC1.java', 'AbstractJPAAnySearchDAOTestC2.java', 'AbstractJPAAnySearchDAOTestC3.java', 'AbstractJPAAnySearchDAOTestC4.java')
$mockCode = @"
        try {
            AnyUtils anyUtils = mock(AnyUtils.class);
            lenient().when(anyUtilsFactory.getInstance(AnyTypeKind.USER)).thenReturn(anyUtils);
            java.lang.reflect.Field field = org.apache.syncope.core.persistence.jpa.entity.user.JPAUser.class.getDeclaredField("username");
            lenient().when(anyUtils.getField("username")).thenReturn(Optional.of(field));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
"@
foreach ($f in $files) {
    $p = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao\' + $f
    $content = Get-Content -Raw $p
    
    # We replace 'public void setUp() {' with 'public void setUp() { \n' + $mockCode
    $content = $content -replace 'public void setUp\(\) \{', ("public void setUp() {`n" + $mockCode)
    
    Set-Content -Path $p -Value $content
}
