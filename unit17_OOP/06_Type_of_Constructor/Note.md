# 📘 OOP in Java — Types of Constructors

---

## 🔷 What are Types of Constructors?

Constructors in Java are mainly classified based on **how they are used to initialize objects**.

👉 There are **3 main types**:

1. Default Constructor  
2. Parameterized Constructor  
3. Copy Constructor  

---

# 🔷 1. Default Constructor

## 🔹 What is it?

A constructor with **no parameters**.

👉 If no constructor is defined, Java automatically provides a default constructor.


# 🔷 2. Parameterized Constructor

## 🔹 What is it?

A constructor that **takes parameters** to initialize object values.


# 🔷 Constructor Overloading

👉 Multiple constructors in the same class with different parameters

---

## 🔹 Example

~~~java
class Student {

  String name;
  int age;

  Student() {
    name = "Unknown";
    age = 0;
  }

  Student(String n, int a) {
    name = n;
    age = a;
  }
}
~~~

---

# 🔷 Types Summary Table

| Type | Parameters | Purpose |
|------|-----------|---------|
| Default Constructor | No | Assign default values |
| Parameterized Constructor | Yes | Assign custom values |
| Copy Constructor | Object | Copy another object |


# 🧠 Interview Line

Constructors in Java are categorized into default, parameterized, and copy constructors based on how they initialize objects.


## code Snippet explained

```java 
public class OOPS {
  public static void main(String[] args) {
    // creating OBJECT
    Student s1 = new Student();        // calls Default constructor
    Student s2 = new Student("Pawan"); // calls Parameterized constructor (String)
    Student s3 = new Student(23);      // calls Parameterized constructor (int)
    // ^ CONSTRUCTOR OVERLOADING: same constructor name "Student" but different parameters
  }
}

// Student class
class Student { 
  String name;
  int roll;

  // ===================== CONSTRUCTOR OVERLOADING =====================
  // All three constructors have the SAME NAME "Student" but
  // differ in NUMBER or TYPE of parameters — this is Constructor Overloading.
  // Java decides which constructor to call based on the argument passed.
  // ==================================================================

  // Constructor 1 — DEFAULT (NON-PARAMETERIZED) constructor
  // Called when no argument is passed: new Student()
  Student() {
    System.out.println("Default constructor is called");
  }

  // Constructor 2 — PARAMETERIZED constructor (String type)
  // Called when a String argument is passed: new Student("Pawan")
  Student(String name) {
    this.name = name; // 'this.name' refers to instance variable, 'name' is the parameter
  }

  // Constructor 3 — PARAMETERIZED constructor (int type)
  // Called when an int argument is passed: new Student(23)
  Student(int roll) {
    this.roll = roll; // 'this.roll' refers to instance variable, 'roll' is the parameter
  }

  // COPY constructor : (we will see COPY constructor later)
}
```