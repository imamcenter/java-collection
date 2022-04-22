import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("first", "imam");
    map.put("last", "fahrezi");
    map.put("middle", "ahmad");

    for (var key :
        map.keySet()) {
      System.out.println(key);
    }
  }
}
