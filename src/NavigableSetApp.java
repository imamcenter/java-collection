import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {
    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("imam", "ahmad", "fahrezi", "tentang", "tech"));

    NavigableSet<String> nameReverse = names.descendingSet();
    NavigableSet<String> sliceNames = names.headSet("fahrezi", true);

    for (var name :
        sliceNames) {
      System.out.println(name);
    }
  }
}
