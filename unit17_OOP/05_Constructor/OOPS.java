
public class OOPS {
  public static void main(String[] args) {
    // creating OBJECT
    Student s1 = new Student(); // CONSTRUCTOR runs automatically.  // here 'Student()' is know as COSNTRUCTOR
  }
}

// Student class
class Student { 
  String name;
  int age;

  // CONSTRUCTOR method
  Student() { // if method's name matches with class's name (means its is CONSTRUCTOR of this class.)
    System.out.println("Constructor is called");
  }
}


// public class OOPS {

//   public static void main(String[] args) {
//     //creating OBJECT
//     Student s1 = new Student("Pawan"); // we can passes arguments in CONSTUCTOR FUNCTION

//     System.out.println(s1.name);
//   }
// }

// // Student class
// class Student { 
//   String name;
//   int age;

//   // CONSTRUCTOR method
//   Student(String name) { // if method's name matches with class's name (means its is CONSTRUCTOR of this class.)
//     this.name = name;
//   }
// }