# #1: Classes & Objects

**Objects**: `entities` in the real world
**Classes**: `group` of these entities

# --------------------------------------------------------------------------------------------------------

# #2: Access Modifiers

## 🔷 Types of Access Modifiers

| Access Modifier | Within Class | within Package | outside pacakage by Subclass only| ouside Package |
|--------------|-----------|--------------|----------|---------------|
| `private`    | ✅        | ❌           | ❌       | ❌            |
| `default`    | ✅        | ✅           | ❌       | ❌            |
| `protected`  | ✅        | ✅           | ✅       | ❌*           |
| `public`     | ✅        | ✅           | ✅       | ✅            |

👉 `default` = no keyword written

# --------------------------------------------------------------------------------------------------------

# #3: Getters & Setters

Getters and Setters are **methods used to access and update private variables** of a class.

- **Getter** → used to *read* data  
- **Setter** → used to *modify* data 

`this`: this keyword is used to refers to the **current object**

# --------------------------------------------------------------------------------------------------------

# #4: Encapsulation

**Encapsulatio is defined as the wrapping up of data(variables / properties) & methods(functions) under a single unit(class). It also implements data hiding.**
# --------------------------------------------------------------------------------------------------------


# #5: Constructor

## Definition:
Constructor is a special method which is **invoked automatically** at the time of **object creation**

## Remember: Key features
- Constructors have the same name as class or structure.
- Constructors don't have a return type. (Not even void).
- Constructors are only called once, at object creation.
- Memory allocation happens when contructor is called.

# --------------------------------------------------------------------------------------------------------

# #6: Type of Constructor

## 🔷 What are Types of Constructors?

Constructors in Java are mainly classified based on **how they are used to initialize objects**.

👉 There are **3 main types**:

1. Default Constructor  
2. Parameterized Constructor  
3. Copy Constructor  

---

# 🔷 1. Default Constructor

## 🔹 What is it?
A constructor with **no parameters**.
👉 If no constructor is defined, Java automatically provides a default constructor.


# 🔷 2. Parameterized Constructor

## 🔹 What is it?
A constructor that **takes parameters** to initialize object values.


# 🔷 Constructor Overloading
👉 Multiple constructors in the same class with different parameters


# --------------------------------------------------------------------------------------------------------

# #7: Copy Costructor

A **copy constructor** is used to create a new object by copying values from an existing object of the same class.

👉 Simple meaning:
**“Create a new object using another object”**
# --------------------------------------------------------------------------------------------------------

# #8: Shallow & Deep Copy

# 🔷 1. Shallow Copy

A **shallow copy** creates a new object, but:

> Reference variables (like arrays or objects) are NOT fully copied. Only their reference (address) is copied.

# 🔷 2. Deep Copy

A **deep copy** creates a new object AND:

> Also creates a new copy of all reference data (arrays/objects)

# --------------------------------------------------------------------------------------------------------

# #9: Destructors

Java does not support destructors; instead, it uses **garbage collection** to automatically manage memory and destroy unused objects.

# --------------------------------------------------------------------------------------------------------

# #10: Inheritance

Inheritance is when properties & methods of **base(parent) class** are passed on to a **derived(child) class.**

# --------------------------------------------------------------------------------------------------------

# #11: Single Level Inheritance

## 🔷 Structure

~~~text
BASE(parent) Class → DERIVED(child) Class
~~~

# --------------------------------------------------------------------------------------------------------

# #12: Multi Level Inheritance

## 🔷 Structure

~~~text
Grandparent → Parent → Child
~~~

# --------------------------------------------------------------------------------------------------------

# #13: Hierarchial Inheritance

## 🔷 Structure

~~~text
        Animal (Parent)
       /      |       \
   Mammal    Fish     Bird
~~~

# --------------------------------------------------------------------------------------------------------

# #14: Hybrid Inheritance

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

# --------------------------------------------------------------------------------------------------------

# #15: Polymorphism

# 🔷 Types of Polymorphism in Java

1. **Compile Time Polymorphism** (Method Overloading)  
2. **Runtime Polymorphism** (Method Overriding)  


# --------------------------------------------------------------------------------------------------------

# #16: Method Overloading

- Multiple functions with the **same name** but **different parameters**

# --------------------------------------------------------------------------------------------------------

# #17: Method Overriding

- **Parent** and **child classes** both contain the **same function** with a **different definition.**

# --------------------------------------------------------------------------------------------------------

# #18 Packages in Java
 
- Package is a **group of** similar types of **classes**, **interfaces** and **sub-packages**.

### Types of Packages

 - 1️⃣ Built-in Packages
 - 2️⃣ User-defined Packages

# --------------------------------------------------------------------------------------------------------

# #19: Abtraction

- **Hiding** all the **unnecessary details** and showing only the **important parts** to the user.

### 🔷 Ways to Achieve Abstraction in Java

1. Abstract Classes  
2. Interfaces  

# --------------------------------------------------------------------------------------------------------

# #20: Abtract Classes

- Cannot create and **instance** of abstract class ... **(instance means OBJECT)**
- Can have **abstract / Non-abstract** methods
- Can have constructors

# --------------------------------------------------------------------------------------------------------

# #21: Interfaces

**Note:** 
- **class** is blueprint of OBJECT
- **interface** is blueprint of CLASS

### Key Features:
- All methods are **public**, **abstract** & without **implementation**
- Used to achieve total **abstraction** ... (means all methods are abstracted)
- Variables in the interface are final, public and static

- To inherit **class** we use `extends` keyword
- but to inherit **interface** we use `implements` keyword

# --------------------------------------------------------------------------------------------------------

# #22: Static Keyword

`static` keyword in java is used to share the **same variable or method** of a given class.
- **properties** can be static
- **Functions** can be static
- **Blocks** can be static
- **Nested** Classes can be static

# --------------------------------------------------------------------------------------------------------

# #23: Super Keyword

super keyword is used to refer immediate parent class object.

- to access parent's properties 
- to access parent's funtions
- to access parent's constructor

# --------------------------------------------------------------------------------------------------------

# #24: Solved Qs Pratice

## Questions 03:
- In java class can't be `protected` and `private`, after using this modifier class will be useless.

### Java Access Modifiers

| | private | default | protected | public |
|---|---|---|---|---|
| Class | No | Yes | No | Yes |
| Nested Class | Yes | Yes | Yes | Yes |
| Constructor | Yes | Yes | Yes | Yes |
| Method | Yes | Yes | Yes | Yes |
| Field | Yes | Yes | Yes | Yes |

# -----------------------------------------------

## Question 04

**Which of the following is a correct statement? (both classes in same package)**

```java
class Vehicle { }
class Car extends Vehicle { }
```

**Options:**

- a. `Car c = new Car();`
- b. `Vehicle v = new Vehicle();`
- c. `Vehicle v = new Car();`
- d. `Car c = new Vehicle();`

**Answer is:**

**a. `Car c = new Car();`**  
**b. `Vehicle v = new Vehicle();`**  
**c. `Vehicle v = new Car();`**

 A parent reference can hold a child object (Upcasting).  
 `Vehicle` is parent, `Car` is child — so `Vehicle v = new Car();` is valid.

# -----------------------------------------------

## Question 07

**Which of the following is NOT an OOPS component?**

- a. Inheritance
- b. Encapsulation
- c. Polymorphism
- d. Aggregation

**Answer:**

**d. Aggregation**

The 4 core OOPS components are:
1. Abstraction
2. Encapsulation
3. Inheritance
4. Polymorphism

 Aggregation is a **relationship concept** in OOP (HAS-A relationship), but it is **not** one of the 4 pillars of OOPS.





# --------------------------------------------------------------------------------------------------------
