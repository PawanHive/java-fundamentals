# 📘 OOP in Java — Interfaces (Chess Example)

---

## 🔷 What is an Interface?

An interface is:

> A **blueprint (contract)** that defines *what a class must do*, but not *how it does it*

👉 Simple meaning:  
Interface = **rules that classes must follow**


**Note:** 
- **class** is blueprint of OBJECT
- **interface** is blueprint of CLASS

### Key Features:
- All methods are **public**, **abstract** & without **implementation**
- Used to achieve total **abstraction** ... (means all methods are abstracted)
- Variables in the interface are final, public and static

- To inherit **class** we use `extends` keyword
- but to inherit **interface** we use `implements` keyword

## 🔷 Key Idea

- Interface defines **methods (what to do)**
- Classes define **implementation (how to do it)**

## 🔷 Interface Syntax

~~~java
interface ChessPlayer {
  void moves();
}
~~~

## 🔷 Key Features of Interface

✔ Full abstraction (method has no body)  
✔ Multiple classes can implement same interface  
✔ Used with `implements` keyword  
✔ Cannot create object of interface  

---

## 🔷 Important Rules ⚠️

✔ Methods are public and abstract by default  
✔ Variables are public, static, final by default  
✔ A class can implement multiple interfaces  

## 🔷 Why Use Interfaces?

✔ Achieve full abstraction  
✔ Enable multiple inheritance (in Java way)  
✔ Improve flexibility  
✔ Support loose coupling  

---

## 🔷 Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|--------|----------|----------------|
| Methods | Only abstract (default) | Abstract + concrete |
| Variables | static final only | normal variables allowed |
| Inheritance | multiple allowed | single only |
| Keyword | implements | extends |

---

## 🧠 Interview Line

An interface in Java is a contract that defines methods which must be implemented by classes, enabling full abstraction and runtime polymorphism.

---

## 🔥 Final Insight

👉 Interface = **rule set + multiple implementations**

---