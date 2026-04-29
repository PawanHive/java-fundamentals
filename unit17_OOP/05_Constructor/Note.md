# 📘 OOP in Java — Constructor

---

## 🔷 What is a Constructor?

A constructor is a **special method used to initialize objects**.

👉 It is automatically called when an object is created using `new`.

---

## 🔷 Key Features of Constructor

- Same name as class  
- No return type (not even `void`)  
- Called automatically when object is created  
- Used to initialize object data  

---

## 🔷 Basic Example

~~~java
class Student {

  String name;
  int age;

  // constructor
  Student() {
    System.out.println("Constructor is called");
  }
}
~~~

---

## 🔷 Object Creation

~~~java
public class Main {
  public static void main(String[] args) {

    Student s1 = new Student(); // constructor automatically runs
  }
}
~~~

---

## 🔷 Why Constructor is Important?

Without constructor:
- You manually assign values every time

With constructor:
- Object gets initialized automatically

## 🔷 Real-Life Analogy 🧠

Think of a **mobile phone setup screen**:

- Constructor → initial setup (language, WiFi, etc.)
- Runs automatically when phone starts

## 🧠 Interview Line

A constructor is a special method used to initialize objects and is automatically called when an object is created.

## 🔥 Final Insight

👉 Constructor = automatic object initialization system in Java

---