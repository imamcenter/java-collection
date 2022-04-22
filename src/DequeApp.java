import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>(2);
    stack.offerLast("imam");
    stack.offerLast("ahmad");
    stack.offerLast("fahrezi");

    System.out.println(stack.removeFirst());
    System.out.println(stack.removeFirst());
    System.out.println(stack.removeFirst());
    System.out.println(stack.removeFirst());

  }
}
