# 📘 OOP in Java — Shallow Copy vs Deep Copy

---

## 🔷 What is Copying in Java?

When we copy an object, Java can do it in two ways:

👉 Shallow Copy  
👉 Deep Copy  

---

# 🔷 1. Shallow Copy

## 🔹 What is it?

A **shallow copy** creates a new object, but:

> Reference variables (like arrays or objects) are NOT fully copied. Only their reference (address) is copied.

## 🔷 Internal Working

~~~text
s1.marks  ─────┐
               ├── SAME ARRAY (shared memory)
s2.marks  ─────┘
~~~

## 🔴 Problem of Shallow Copy

~~~java
s1.marks[0] = 100;
~~~

👉 This change also reflects in `s2`

# 🔷 2. Deep Copy

## 🔹 What is it?

A **deep copy** creates a new object AND:

> Also creates a new copy of all reference data (arrays/objects)

## 🔷 Internal Working

~~~text
s1.marks  ─────┐
               │ (values copied)
s2.marks  ─────┘  DIFFERENT ARRAYS
~~~

# 🧠 Interview Line

Shallow copy copies references of objects, while deep copy creates completely independent copies of both objects and their referenced data.
