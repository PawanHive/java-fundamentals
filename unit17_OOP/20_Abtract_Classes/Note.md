# 📘 OOP in Java — Abstract Class (Real Example + Constructor Flow)

---

## 🔷 What is an Abstract Class?

An abstract class is:

> A class that **cannot be instantiated** and may contain both **abstract methods (no body)** and **normal methods (with body)**.

👉 It is used to provide a **base structure** for other classes.

---

## Rules: 

- Cannot create and **instance** of abstract class ... **(instance means OBJECT)**
- Can have **abstract / Non-abstract** methods
- Can have constructors

## 🔷 Key Idea

✔ You cannot create an object of an abstract class  
✔ It is meant to be extended  
✔ Forces child classes to implement abstract methods  


## 🔷 Constructor Flow (VERY IMPORTANT 🧠)

When you create:

~~~java
Mustang myHorse = new Mustang();
~~~

👉 Java executes constructors in this order:

~~~text
Animal → Horse → Mustang
~~~

👉 Reason:
- Parent constructor is always called first
- Then child constructors execute

---

## 🔷 Inheritance Chain

~~~text
Animal (abstract)
   ↓
Horse
   ↓
Mustang
~~~

---

## 🔷 Abstract Method Rule

✔ Abstract method has no body  
✔ Must be implemented by child classes  

~~~java
abstract void walk();
~~~

---

## 🔷 Method Overriding Example

~~~java
void walk() {
  System.out.println("walks on 4 legs");
}
~~~

👉 Different classes define their own behavior

---

## 🔷 Why Abstract Class is Useful?

✔ Provides base structure  
✔ Forces method implementation  
✔ Supports code reusability  
✔ Enables runtime polymorphism  

---

## 🔷 Important Notes ⚠️

- You cannot create object of abstract class  
- Constructors of abstract class still run  
- Abstract methods must be implemented in child classes  

## 🧠 Interview Line

An abstract class in Java is a class that cannot be instantiated and is used to define a common structure for child classes, which must implement its abstract methods.

---

## 🔥 Final Insight

👉 Abstract class = **partial blueprint + enforced structure + reusable logic**

---