# 📘 OOP in Java — Copy Constructor (Deep Understanding)

---

## 🔷 What is a Copy Constructor?

A **copy constructor** is used to create a new object by copying values from an existing object of the same class.

👉 Simple meaning:
**“Create a new object using another object”**

---

## 🔷 Important Point ⚠️

- Java does NOT provide a built-in copy constructor  
- We must define it manually  

# 🔷 What is Happening Internally 🧠

## ❗ Important Concept

~~~text
this.marks = s1.marks;
~~~

👉 This does NOT copy values  
👉 It copies only the reference (memory address)

---

## 🔷 Result

Both objects share the same array:

~~~text
s1.marks ─────┐
              ├── Same array in memory
s2.marks ─────┘
~~~

So if:

~~~java
s1.marks[2] = 100;
~~~

👉 It also affects `s2.marks`

This is Called: **Shallow Copy**

## 🔷 Problem with Shallow Copy

- Changes in one object affect another  
- Shared memory for arrays/objects  
- Not fully independent objects  

# 🧠 Interview Line

A copy constructor creates a new object from an existing object, but by default it performs shallow copy unless deep copy is implemented manually.
