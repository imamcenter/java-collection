public class ReverseString {
  public static void main(String[] args) {
    String name = "imam";
    char[] nameChar = name.toCharArray();
    reverse(name);
  }

  static void reverse(String name) {
    char[] temp = name.toCharArray();
    int j;
    j = temp.length;
    for (int i = 0; i < temp.length; i++) {
     temp[i] = temp[j - 1];
      j--;
//      if (i == j) {
//        break;
//      }
    }

    for (int i = 0; i < temp.length; i++) {

      System.out.println(temp[i]);
    }
  }
}
