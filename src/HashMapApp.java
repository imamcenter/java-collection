import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("name", "imam ahmad");
    map.put("live", "jakarta");
    map.put("last.name", "fahrezi");

    System.out.println(map.get("name"));
    System.out.println(map.get("live"));
    System.out.println(map.get("last.name"));
  }
}
