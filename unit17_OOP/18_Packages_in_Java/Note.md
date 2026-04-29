# 📘 OOP in Java — Packages

---

## 🔷 What is a Package?

A package in Java is:

> **A way to group related classes and interfaces together**


---

## 🔷 Why Use Packages?

✔ Organize code properly  
✔ Avoid naming conflicts  
✔ Improve code reusability  
✔ Make large projects manageable  

---

## 🔷 Real-Life Analogy 🧠

Think of a package like folders in your system:

- 📁 Documents → files related to documents  
- 📁 Images → pictures  
- 📁 Music → songs  

👉 Similarly in Java:
- Packages → groups of related classes  

---

## 🔷 Types of Packages

### 1️⃣ Built-in Packages

Provided by Java itself:

- `java.util` → Scanner, Collections  
- `java.io` → input/output handling  
- `java.lang` → String, Math, System  

---

### 2️⃣ User-defined Packages

Created by developers for their own programs.

---

## 🔷 Creating a Package

### Step 1: Declare package

~~~java
package mypack;
~~~

---

### Step 2: Create class inside package

~~~java
package mypack;

public class Student {
  public void show() {
    System.out.println("Hello from Student class");
  }
}
~~~

---

## 🔷 Using a Package

~~~java
import mypack.Student;

public class Main {
  public static void main(String[] args) {

    Student s = new Student();
    s.show();
  }
}
~~~

---

## 🔷 Output

~~~text
Hello from Student class
~~~

---

## 🔷 Important Keywords

### 🔹 `package`

Used to define a package

~~~java
package mypack;
~~~

---

### 🔹 `import`

Used to access classes from other packages

~~~java
import java.util.Scanner;
~~~

---

## 🔷 Default Package

If no package is declared:

👉 Class belongs to the **default package**

## 🧠 Interview Line

A package in Java is a namespace used to organize classes and interfaces into a structured format to avoid naming conflicts and improve code maintainability.

## 🔥 Final Insight

👉 Packages = **structured folders for Java code organization**
