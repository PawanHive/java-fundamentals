

public class OOPS2 {
  public static void main(String[] args) {
    Person p = new Person();
    p.name = "Pawan";
    p.weight = 25;

    System.out.println(p.name + " weight is " + p.weight);
  }
}

class Person {
  String name;
  int weight;
}

class Student extends Person {
  int rollNumber;
  String schoolName;
}