
public class OOPS {
  public static void main(String[] args) {
    // creating OBJECT
    Student s1 = new Student();
    s1.name = "Pawan";
    s1.roll = 456;
    s1.password = "abcd";

    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;
    
    // creating NEW OBJECT (a copy of s1)
    Student s2 = new Student(s1);
    s2.password = "xyz";

    s1.marks[2] = 100; // math marks changed again

    // print s2 marks
    for (int i = 0; i < 3; i++) {
      System.out.println(s2.marks[i]);
    }
  }
}

// Student class
class Student { 
  String name;
  int roll;
  String password;
  int marks[];

  // DEFAULT (NON-PARAMETERIZED) constructors
  Student() { 
    marks = new int[3];
    System.out.println(" Default constructor is called");
  }

  // // (shallow) COPY constructor
  // Student(Student s1) { // khud ka object khud as a parameter, khud ke constructor me a rha hai
  //   marks = new int[3];
  //   this.name = s1.name;
  //   this.roll = s1.roll;
  //   this.marks = s1.marks; // here not whole arraying being copied, only its reference would copy.
  // }

  // (deep) COPY constructor
  Student(Student s1) { // khud ka object khud as a parameter, khud ke constructor me a rha hai
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i = 0; i < 3; i++) {
      this.marks[i] = s1.marks[i]; // here not whole arraying being copied, only its reference would copy.
    }
  }
}
