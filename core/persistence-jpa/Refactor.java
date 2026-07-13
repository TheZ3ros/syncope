import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Refactor {
    public static void main(String[] args) throws Exception {
        String path = "src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractJPAAnySearchDAO.java";
        String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        
        content = content.replace(".append(\" IN (\")", ".append(IN_CLAUSE)");
        content = content.replace(".append(\" NOT IN (\")", ".append(NOT_IN_CLAUSE)");
        content = content.replace("protected static final String SELECT_COLS_FROM_VIEW", 
            "protected static final String IN_CLAUSE = \" IN (\";\n\n    protected static final String NOT_IN_CLAUSE = \" NOT IN (\";\n\n    protected static final String SELECT_COLS_FROM_VIEW");
            
        Files.write(Paths.get(path), content.getBytes(StandardCharsets.UTF_8));
        System.out.println("Refactoring completed successfully.");
    }
}
