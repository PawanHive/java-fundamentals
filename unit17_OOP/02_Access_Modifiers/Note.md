# 📘 OOP in Java — Access Modifiers

---

## 🔷 What are Access Modifiers?

Access modifiers define the **visibility (access level)** of:
- variables
- methods
- classes

👉 In simple words:  
**“Who can access this?”**

---

## 🔷 Types of Access Modifiers

| Modifier     | Same Class | Same Package | Subclass | Other Package |
|--------------|-----------|--------------|----------|---------------|
| `private`    | ✅        | ❌           | ❌       | ❌            |
| `default`    | ✅        | ✅           | ❌       | ❌            |
| `protected`  | ✅        | ✅           | ✅       | ❌*           |
| `public`     | ✅        | ✅           | ✅       | ✅            |

👉 `default` = no keyword written

---

## 🔷 1. `private` (Most Secure)

- Accessible **only inside the same class**

~~~java
class BankAccount {
  private String password;
}
~~~

❌ Not allowed:
~~~java
myAcc.password; // ERROR
~~~

---

## 🔷 2. `default` (Package-Level)

- Accessible **only within same package**

~~~java
class Student {
  int marks; // default access
}
~~~

---

## 🔷 3. `protected`

- Accessible:
  - same package ✅
  - subclasses (inheritance) ✅

~~~java
class Animal {
  protected void eat() {
    System.out.println("Eating...");
  }
}
~~~

---

## 🔷 4. `public` (Least Restricted)

- Accessible **from anywhere**

~~~java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
~~~

---

## 🔷 Real-Life Analogy 🧠

- `private` → Personal room  
- `default` → Family access  
- `protected` → Family + relatives  
- `public` → Open to everyone  

## 🔷 Best Practice ✅

- Variables → `private`  
- Methods → `public`  

👉 This ensures **Encapsulation + Security**

---

## 🔷 Key Points to Remember

- Access modifiers control visibility  
- `private` = most restricted  
- `public` = open access  
- `default` = package-level  
- `protected` = useful in inheritance  

---

## 🧠 Interview Line

Access modifiers are used to restrict the visibility of variables, methods, and classes in Java.

## 🔥 Golden Rule

👉 Never make variables public (unless necessary)


