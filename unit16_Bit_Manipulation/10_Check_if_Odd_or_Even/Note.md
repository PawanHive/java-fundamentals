# 🔢 Check Odd or Even using Bit Manipulation (DSA Notes)

---

## 📌 Problem Statement
Given an integer `n`, determine whether it is **odd or even** using bit manipulation.

---

## 🧠 Idea

Use the **Least Significant Bit (LSB)**:

- If last bit = `0` → number is **even**
- If last bit = `1` → number is **odd**

👉 We can check this using:
```
n & 1
```

---

## ⚙️ Algorithm

1. Take integer `n`
2. Perform bitwise AND with `1`:
   - `n & 1`
3. If result is `0` → even  
4. Else → odd  

---

## 💻 Java Code

```java
public class Main {

  public static void oddOrEven(int n) {

    if ((n & 1) == 0) {
      System.out.println(n + " number is even");
    } else {
      System.out.println(n + " number is odd");
    }
  }

  public static void main(String[] args) {
    oddOrEven(0);
    oddOrEven(11);
    oddOrEven(14);
  }
}
```

## ⏱️ Time Complexity

- **O(1)** → constant time

---

## 📦 Space Complexity

- **O(1)** → no extra space

---

## ⚠️ Important Points

- Faster than using `% 2`
- Works directly on binary representation
- Uses LSB (last bit)
- Very common in bit manipulation problems
