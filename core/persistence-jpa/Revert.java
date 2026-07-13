import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Revert {
    public static void main(String[] args) throws Exception {
        String path = "src/main/java/org/apache/syncope/core/persistence/jpa/dao/AbstractJPAAnySearchDAO.java";
        String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        
        content = content.replace(".append(IN_CLAUSE)", ".append(\" IN (\")");
        content = content.replace(".append(NOT_IN_CLAUSE)", ".append(\" NOT IN (\")");
            
        Files.write(Paths.get(path), content.getBytes(StandardCharsets.UTF_8));
        System.out.println("Revert completed successfully.");
    }
}
