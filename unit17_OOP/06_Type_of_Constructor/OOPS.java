
public class OOPS {
  public static void main(String[] args) {
    // creating OBJECT
    Student s1 = new Student();  // calls Default constructor
    Student s2 = new Student("Pawan"); // calls Parameterized constructor (String)
    Student s3 = new Student(23);  // calls Parameterized constructor (int)
    // CONSTRUCTOR OVERLOADING: we can have multiple constructors in the same class with different parameters.
  }
}

// Student class
class Student { 
  String name;
  int roll;

  // DEFAULT (NON-PARAMETERIZED) constructors
  Student() { // Note: here we don't pass parameters  // REMEMBER: having this constructor is IMPORTANT to run below connstructors
    System.out.println(" Default constructor is called");
  }

  // PARAMETERIZED constructor
  Student(String name) { // Note: here we pass parameters
    this.name = name;
  }

  Student(int roll) { // this is also PARAMETERIZED constructor
    this.roll = roll;
  }

  // COPY constructor : (we will see COPY constructor later)
}


// ===================== CONSTRUCTOR OVERLOADING =====================
  // All three constructors have the SAME NAME "Student" but
  // differ in NUMBER or TYPE of parameters — this is Constructor Overloading.
  // Java decides which constructor to call based on the argument passed.
  // ==================================================================