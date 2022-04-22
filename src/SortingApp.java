import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.addAll(List.of("imam", "ahmad", "fahrezi", "tentang", "tech"));

    Collections.sort(stringList);
    for (var name :
        stringList) {
      System.out.println(name);
    }

  }
}
