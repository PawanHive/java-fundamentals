# 📘 OOP in Java — Static Keyword (with Example)

---

## 🔷 What is `static`?

The `static` keyword means:

> **Belongs to the class, not to individual objects**

👉 Simple meaning:  
**One shared copy for all objects**

`static` keyword in java is used to share the **same variable or method** of a given class.
- **properties** can be static
- **Functions** can be static
- **Blocks** can be static
- **Nested** Classes can be static

## 🔷 Key Idea

- Normal variables → separate copy per object  
- Static variables → single shared copy  

---

## 🔷 Example Code

~~~java
public class OOPS {
  public static void main(String[] args) {

    Student.schoolName = "JMV";

    Student s1 = new Student();
    Student s2 = new Student();

    System.out.println(s2.schoolName);

    Student.schoolName = "ABC";

    System.out.println(s1.schoolName);
  }
}

class Student {

  String name;
  int roll;

  static String schoolName;

  static double percentage(int math, int phy, int chem) {
    return (math + phy + chem) / 3.0;
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
}
~~~

---

## 🔷 Output

~~~text
JMV
ABC
~~~

---

## 🔷 How It Works 🧠

- `schoolName` is static → shared by all objects  
- Changing it once → affects all objects  

~~~text
s1 → schoolName = JMV  
s2 → schoolName = JMV  

After update:

s1 → ABC  
s2 → ABC  
~~~

## 🔷 Static Method

✔ Belongs to class  
✔ No need to create object  
✔ Cannot use `this` keyword  

~~~java
Student.percentage(90, 80, 70);
~~~

---

## 🔷 Important Rules ⚠️

✔ Static members belong to class  
✔ Use class name to access static  
✔ Static methods cannot directly access non-static data  
✔ Static methods cannot use `this`  
-

## 🧠 Interview Line

The static keyword in Java is used to create class-level variables and methods that are shared among all objects of the class.

---

## 🔥 Final Insight

👉 `static` = **one shared copy for entire class**

---