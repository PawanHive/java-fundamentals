# 📘 OOP in Java — Method Overloading

---

## 🔷 What is Method Overloading?

Method overloading means:

> **Same method name, but different parameters**

👉 It is a type of **Compile-Time Polymorphism**

---

## 🔷 Key Idea

- Same method name reused for different tasks  
- Compiler decides which method to call based on arguments  

---

## 🔷 Rules of Method Overloading

✔ Method name must be same  
✔ Parameter list must be different  
✔ Can differ by:
  - Number of parameters  
  - Type of parameters  
  - Order of parameters  

❌ Return type alone cannot create overloading  

---

## 🔷 Example Code

~~~java
public class OOPS {
  public static void main(String[] args) {

    Calculator calc = new Calculator();

    System.out.println(calc.sum(1, 2));
    System.out.println(calc.sum(1.5f, 2.5f));
    System.out.println(calc.sum(1, 2, 3));
  }
}

class Calculator {

  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}
~~~

---

## 🔷 Output

~~~text
3
4.0
6
~~~

---

## 🔷 How It Works 🧠

When a method is called:

👉 Compiler checks:
- number of arguments  
- type of arguments  

👉 Then selects the correct method automatically

## 🧠 Interview Line

Method overloading is a feature in Java where multiple methods have the same name but different parameter lists, and the method call is resolved at compile time.


## 🔥 Final Insight

👉 Method Overloading = **same method name, different input behavior**
