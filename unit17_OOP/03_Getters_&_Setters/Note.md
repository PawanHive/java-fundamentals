# 📘 OOP in Java — Getters & Setters

---

## 🔷 What are Getters and Setters?

Getters and Setters are **methods used to access and update private variables** of a class.

- **Getter** → used to *read* data  
- **Setter** → used to *modify* data  

👉 They are mainly used with `private` variables to achieve **Encapsulation**

---

## 🔷 Why Do We Need Them?

If variables are `private`, they cannot be accessed directly:

~~~java
p1.color; // ❌ Error if color is private
~~~

👉 So we use:
- Getter → to access value
- Setter → to update value

## 🔷 Example Code (Pen Class)

~~~java
class Pen {
  private String color;
  private int tip;

  // GETTER methods
  public String getColor() {
    return this.color;
  }

  public int getTip() {
    return this.tip;
  }

  // SETTER methods
  public void setColor(String newColor) {
    this.color = newColor;
  }

  public void setTip(int newTip) {
    this.tip = newTip;
  }
}
~~~

---

## 🔷 Using the Class

~~~java
public class OOPS {
  public static void main(String[] args) {

    Pen p1 = new Pen();

    p1.setColor("Blue");
    System.out.println(p1.getColor());

    p1.setTip(5);
    System.out.println(p1.getTip());

    p1.setColor("Yellow");
    System.out.println(p1.getColor());
  }
}
~~~

---

## 🔷 Why Use `this` Keyword?

`this` refers to the **current object**

~~~java
this.color = newColor;
~~~

👉 Helps differentiate between:
- class variable (`color`)
- method parameter (`newColor`)

---

## 🔷 Best Practice Rules

✔ Variables → `private`  
✔ Methods → `public`  
✔ Always use getters/setters for access  

---

## 🔷 Benefits of Getters & Setters

- Data hiding (Encapsulation) 🔒  
- Controlled access to variables  
- Validation can be added  
- Better code security and flexibility  

## 🔷 Key Points

- Getter → returns value  
- Setter → updates value  
- Used with `private` variables  
- Core part of Encapsulation  

---

## 🧠 Interview Line

Getters and setters are methods used to access and modify private variables in a controlled way, helping implement encapsulation in Java.
