# 📘 OOP in Java — Method Overriding

---

## 🔷 What is Method Overriding?

Method overriding means:

> **Same method name and same parameters in parent and child class, but different implementation**

👉 It is a type of **Runtime Polymorphism**

---

## 🔷 Key Idea

- Parent class defines a method  
- Child class **modifies (overrides)** that method  
- JVM decides at runtime which method to call  

---

## 🔷 Example Code

~~~java
public class OOPS {
  public static void main(String[] args) {

    Deer d = new Deer();
    d.eat(); // calls child class method
  }
}

// Parent class
class Animal {
  String color;

  void eat() {
    System.out.println("eats anything");
  }

  void breathe() {
    System.out.println("breathes");
  }
}

// Child class
class Deer extends Animal {

  @Override
  void eat() {
    System.out.println("eats grass");
  }
}
~~~

---

## 🔷 Output

~~~text
eats grass
~~~

---

## 🔷 How It Works 🧠

- `Deer` overrides `eat()` method of `Animal`
- When `d.eat()` is called:
  - JVM checks object type at runtime
  - Executes **child class method**

---

## 🔷 Key Rules of Overriding

✔ Method name must be same  
✔ Parameters must be same  
✔ Must be in inheritance relationship  
✔ Return type must be same (or compatible)  

## 🔷 Important Notes ⚠️

- Private methods cannot be overridden  
- Static methods are not overridden (they are hidden)  
- Constructors cannot be overridden  

---

## 🔷 Key Characteristics

✔ Same method signature  
✔ Requires inheritance  
✔ Runtime decision (JVM)  
✔ Child modifies parent behavior  

---

## 🧠 Interview Line

Method overriding is a feature in Java where a child class provides a specific implementation of a method already defined in its parent class, and the method call is resolved at runtime.

---

## 🔥 Final Insight

👉 Method Overriding = **same method, different behavior at runtime**

---