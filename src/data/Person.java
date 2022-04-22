package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

  String name;
  List<String> hobbies;

  public Person(String name) {
    this.name = name;
    this.hobbies = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addHobbies(String hobby){
    this.hobbies.add(hobby);
  }

  public List<String> getHobbies() {
    return Collections.unmodifiableList(hobbies);
  }
}
