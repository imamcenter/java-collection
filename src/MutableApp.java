import data.Person;

import java.util.List;

class MutableApp{
  public static void main(String[] args) {
    Person person = new Person("imam");
    person.addHobbies("sepak bola");
    person.addHobbies("volly");

//    doSomethingWithHobbies(person.getHobbies());
    for (var hobby :
        person.getHobbies()) {
      System.out.println(hobby);
    }
  }

  static void doSomethingWithHobbies(List<String> hobbies){
    hobbies.add("lompat tinggi");
  }
}