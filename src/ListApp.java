import java.util.*;
import java.util.function.Consumer;

public class ListApp {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();

    arrayList.add("imam");
    arrayList.add("ahmad");
    arrayList.add("fahrezi");
    arrayList.addAll(List.of(
        "muhammad", "ihab", "kamil"
    ));
    System.out.println("ADD");
    for (var name :
        arrayList) {
      System.out.println(name);
    }
    arrayList.remove("ahmad  ");
    arrayList.removeAll(Arrays.asList("muhammad", "ihab", "kamil   "));
    System.out.println("REMOVE");
    for (var name :
        arrayList) {
      System.out.println(name);
    }


    List<String> linkedString = new LinkedList<>();
    linkedString.add("bandung");
    linkedString.addAll(List.of("jakarta", "madura", "jambi"));
    for (var kota :
        linkedString) {
      System.out.println(kota);
    }

    for (var kota :
        linkedString) {
      System.out.println(kota);
    }
  }
}
