# 📘 OOP in Java — `super` Keyword (with Example)

---

## 🔷 What is `super`?

The `super` keyword is:

> A reference used to access **immediate parent class members** (variables, methods, constructors)

👉 Simple meaning:  
**Access parent class from child class**

---

## 🔷 Key Idea

- `super` → refers to parent class  
- Used in inheritance  
- Helps resolve conflicts and access parent behavior  

---

## 🔷 Your Example Code

~~~java
public class OOPS {
  public static void main(String[] args) {
    Horse h = new Horse();
    System.out.println(h.color);
  }
}

class Animal {

  String color;

  Animal() {
    System.out.println("Animal constructor is called");
  }
}

class Horse extends Animal {

  Horse() {
    super.color = "brown"; // accessing parent variable
    System.out.println("Horse constructor is called");
  }
}
~~~

---

## 🔷 Output

~~~text
Animal constructor is called
Horse constructor is called
brown
~~~

---

## 🔷 Constructor Flow (IMPORTANT 🧠)

When object is created:

~~~java
Horse h = new Horse();
~~~

👉 Execution order:

~~~text
Animal constructor → Horse constructor
~~~

✔ Even if `super()` is not written, Java calls it automatically  

---

## 🔷 Important Concept ⚠️

### ❗ `super` is NOT always required

👉 In your example:

~~~java
super.color = "brown";
~~~

✔ Works fine  
❗ But unnecessary  

### ✅ Better:

~~~java
color = "brown";
~~~

👉 Because child class already inherits parent properties

---

## 🔷 When to Use `super`?

### ✔ 1. Variable name conflict

~~~java
class Animal {
  String color = "Brown";
}

class Horse extends Animal {
  String color = "Black";

  void printColor() {
    System.out.println(super.color); // parent
    System.out.println(this.color);  // child
  }
}
~~~

---

### ✔ 2. Call parent method

~~~java
super.eat();
~~~

---

### ✔ 3. Call parent constructor

~~~java
super();
~~~

👉 Must be first statement in constructor  

---

## 🔷 `super` vs `this`

| Feature | super | this |
|--------|------|------|
| Refers to | Parent class | Current class |
| Use | Access parent members | Access current members |
| Constructor call | super() | this() |

---

## 🔷 Key Rules ⚠️

✔ `super` refers to immediate parent  
✔ `super()` must be first statement in constructor  
✔ Automatically called if not written  
✔ Cannot be used in static context  

---

## 🔷 What You Learned from Example

✔ Constructor chaining (parent → child)  
✔ Accessing parent variable  
✔ When `super` is optional  
✔ Inheritance behavior  

---

## 🧠 Interview Line

The `super` keyword in Java is used to refer to the immediate parent class and is mainly used to access parent class variables, methods, and constructors when needed.

---

## 🔥 Final Insight

👉 `super` = **use only when accessing parent explicitly or resolving conflicts**

---