import java.util.EnumSet;
import java.util.Set;
enum Gender{
  MALE, FEMALE, NOT_MENTION
}
public class EnumSetApp {
  public static void main(String[] args) {
//    Set<Gender> genders = Set.of(Gender.MALE, Gender.FEMALE);
    Set<Gender> genders = EnumSet.allOf(Gender.class);

    for (var gender :
        genders) {
      System.out.println(gender);
    }
  }
}
