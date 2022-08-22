package day39_inheritance.people;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
      // supe(); -> calls the parent constructor
        this.name = name;
        this.age = age;
    }
}
