import data.Person;
import data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
  public static void main(String[] args) {
    SortedSet<Person> names = new TreeSet<>(new PersonComparator());

    names.add(new Person("imam"));
    names.add(new Person("ahmad"));
    names.add(new Person("fahrezi"));

    for (var name :
        names) {
      System.out.println(name.getName());
    }

  }
}
