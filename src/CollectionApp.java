import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    collection.add("imam");
    collection.add("ahmad");
    collection.add("fahrezi");
    collection.addAll(List.of(
        "muhammad", "ihab", "kamil"
    ));

    System.out.println("ADD");
    for (var name :
        collection) {
      System.out.println(name);
    }
    collection.remove("ahmad  ");
    collection.removeAll(Arrays.asList("muhammad", "ihab", "kamil   "));

    System.out.println("REMOVE");
    for (var name :
        collection) {
      System.out.println(name);
    }
  }
}
