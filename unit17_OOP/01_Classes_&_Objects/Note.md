# 📘 OOP in Java — Classes & Objects

## SIGMA NOTE: 

**Objects**: entities in the real world
**Classes**: group of these entities

---

## 🔷 What is a Class?

A **class** is a **blueprint (template)** used to create objects.

### 👉 It defines:
- Properties (variables)
- Behaviors (methods)

### 📌 Example:
~~~java
class Car {
  String color;
  int speed;

  void drive() {
    System.out.println("Car is running");
  }
}
~~~

---

## 🔷 What is an Object?

An **object** is an **instance of a class**.

👉 It represents a real-world entity created using a class.

---

## 🔷 Object Creation

~~~java
Car c1 = new Car();
~~~

### 🔍 Breakdown:
- `Car` → Class (data type)
- `c1` → Object reference
- `new` → Allocates memory in heap
- `Car()` → Constructor call

---

## 🔷 Accessing Object Properties & Methods

~~~java
c1.color = "Red";
c1.speed = 120;
c1.drive();
~~~

---

## 🔷 Memory Concept

- Class → No memory allocation  
- Object → Memory allocated in **Heap**  
- Reference variable → Stored in **Stack**

---

## 🔷 Multiple Objects

~~~java
Car c1 = new Car();
c1.color = "Red";

Car c2 = new Car();
c2.color = "Blue";
~~~

👉 Each object has its **own separate data**

---

# ⚠️ Important Concept: Encapsulation (Early Intro)

## ❌ Wrong Way (Direct Access)

~~~java
p1.color = "Yellow";
System.out.println(p1.color);
~~~

### Problems:
- No control over data  
- Invalid values can be assigned  


## ⚠️ Common Mistakes

### ❌ Direct Variable Access
~~~java
p1.color = "Red";   // avoid
~~~

## 🔷 Key Points to Remember

- Class = Blueprint  
- Object = Instance  
- One class → Many objects  
- Object stores actual data  
- Memory allocated only when object is created  
- Always prefer **Encapsulation**

---

## 🧠 Interview Line

Class is a blueprint, and object is an instance created using that blueprint.

---

## 🛠 Practice

1. Create a `Student` class:
   - name, marks
   - method `printDetails()`

2. Create multiple objects and print data

---
