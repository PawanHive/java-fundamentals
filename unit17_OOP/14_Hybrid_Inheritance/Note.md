# 📘 OOP in Java — Hybrid Inheritance

---

## 🔷 What is Hybrid Inheritance?

Hybrid inheritance means:

> **Combination of more than one type of inheritance in a single program**

👉 It is a mix of:
- Single inheritance  
- Multilevel inheritance  
- Hierarchical inheritance  

---

## 🔷 Important Note (Java Reality ⚠️)

👉 Java **does NOT support hybrid inheritance directly using classes**

Because:
- Java does NOT allow multiple inheritance with classes  
- To avoid ambiguity (Diamond problem)

---

## 🔷 So How is it Achieved in Java?

✔ Using **classes + interfaces** (later topic)  
✔ Or by combining:
  - Hierarchical inheritance  
  - Multilevel inheritance  

---

# 🔷 Structure (Your Example Concept)

~~~text
           Animal
        /    |     \
   Mammal   Fish   Bird
    /  \      \       \
Dog  Cat   Whale   Peacock
        \
       Human
~~~

## 🧠 Interview Line

Hybrid inheritance is a combination of multiple types of inheritance, but in Java it cannot be implemented directly using classes and is achieved using a combination of inheritance types or interfaces.
