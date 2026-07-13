$files = @('AbstractJPAAnySearchDAOTestC1.java', 'AbstractJPAAnySearchDAOTestC2.java', 'AbstractJPAAnySearchDAOTestC3.java', 'AbstractJPAAnySearchDAOTestC4.java')
foreach ($f in $files) {
    $p = 'src\test\java\org\apache\syncope\core\persistence\jpa\dao\' + $f
    (Get-Content $p) -replace 'SearchCond\.getLeaf', 'SearchCond.of' -replace 'thenReturn\(Optional\.of\("username"\)\)', 'thenReturn(Optional.empty())' | Set-Content $p
}
