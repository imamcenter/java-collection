import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
  public static void main(String[] args) {
    List<Integer> angka = new ArrayList<>(1000);

    for (int i = 1; i < 1000; i++) {
      angka.add(i);
    }

    System.out.println(Collections.binarySearch(angka, 500));

  }
}
