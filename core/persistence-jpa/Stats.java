import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Stats {
    public static void main(String[] args) throws Exception {
        File file = new File("target/pit-reports/mutations.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        NodeList nodes = doc.getElementsByTagName("mutation");
        
        Map<String, int[]> stats = new HashMap<>();

        for (int i = 0; i < nodes.getLength(); i++) {
            Element el = (Element) nodes.item(i);
            String method = el.getElementsByTagName("mutatedMethod").item(0).getTextContent();
            
            stats.putIfAbsent(method, new int[4]);
            int[] counts = stats.get(method);
            counts[0]++; // total
            
            String status = el.getAttribute("status");
            if ("SURVIVED".equals(status)) {
                counts[1]++;
            } else if ("KILLED".equals(status)) {
                counts[2]++;
            } else if ("NO_COVERAGE".equals(status)) {
                counts[3]++;
            }
        }
        
        for (Map.Entry<String, int[]> entry : stats.entrySet()) {
            int[] c = entry.getValue();
            System.out.println(String.format("Method: %s, Total: %d, Survived: %d, Killed: %d, NoCoverage: %d", 
                entry.getKey(), c[0], c[1], c[2], c[3]));
        }
    }
}
