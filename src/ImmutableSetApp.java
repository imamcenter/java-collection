import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
  public static void main(String[] args) {
    Set<String> empty = Collections.emptySet();

    Set<String> one = Collections.singleton("imam");

    Set<String> mutable = new HashSet<>();
    mutable.add("imam");
    mutable.add("ahmad");
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    Set<String> set = Set.of("imam", "ahmad");

    int[] nums = new int[]{
        2, 56, 2, 3, 3, 25, 46, 5, 76, 5674, 5
    };

    for (var num :
        nums) {

      System.out.print("sebelum sort: [" + num +"]\n");
    }
    Arrays.sort(nums);
    for (var num :
        nums) {
      System.out.print("setelah sort: [" + num + "]");
    }
  }
}
