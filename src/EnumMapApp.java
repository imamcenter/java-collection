import java.util.EnumMap;
import java.util.Map;

enum Level{
  PREMIUM,VIP,STANDARD,
}
public class EnumMapApp {
  public static void main(String[] args) {
    Map<Level, String> map = new EnumMap<Level, String>(Level.class);
    map.put(Level.PREMIUM, "premium");
    map.put(Level.STANDARD, "standard");
    map.put(Level.VIP, "vip");

    for (var key :
        map.keySet()) {
      System.out.println(key);
    }
  }
}
