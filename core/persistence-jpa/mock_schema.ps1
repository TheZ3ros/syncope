$files = @('AbstractJPAAnySearchDAOTestC1.java', 'AbstractJPAAnySearchDAOTestC2.java', 'AbstractJPAAnySearchDAOTestC3.java', 'AbstractJPAAnySearchDAOTestC4.java')
$mockCode = @"
            org.apache.syncope.core.persistence.api.entity.PlainSchema schema = mock(org.apache.syncope.core.persistence.api.entity.PlainSchema.class);
            lenient().when(plainSchemaDAO.find(anyString())).thenReturn(schema);
            lenient().when(schema.getKey()).thenReturn("username");
"@
foreach ($f in $files) {
    $p = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao\' + $f
    $content = Get-Content -Raw $p
    
    # We replace the end of the try block in setup
    $content = $content -replace '\} catch \(Exception e\) \{', ($mockCode + "`n        } catch (Exception e) {")
    
    Set-Content -Path $p -Value $content
}
