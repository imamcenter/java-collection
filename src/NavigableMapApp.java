import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableMapApp {
  public static void main(String[] args) {
    NavigableMap<String, String> map = new TreeMap<>();
    map.put("eko", "Eko");
    map.put("imam", "imam");
    map.put("budi", "budi");
    map.put("ihab", "ihab");

    for (var key : map.keySet()
    ) {
      System.out.println(key);
    }

    System.out.println(map.lowerKey("imam"));
    System.out.println(map.higherKey("budi"));
  }
}
