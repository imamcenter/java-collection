import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {

  public static void main(String[] args) {
    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    SortedMap<String, String> map = new TreeMap<>(comparator);
    map.put("first", "imam");
    map.put("last", "fahrezi");
    map.put("middle", "ahmad");

    for (var key :
        map.keySet()) {
      System.out.println(key);
    }
  }
}
