# ⚡ Check Power of Two (Bit Manipulation)

---

## 📌 Problem Statement
Given an integer `n`, check whether it is a **power of 2**.

👉 Examples:
```
1, 2, 4, 8, 16 → Power of 2 ✔️
3, 5, 6, 10    → Not Power of 2 ❌
```

---

## 🧠 Idea

A power of 2 number has **only one set bit (1)** in its binary form.

👉 Trick:
```
n & (n - 1)
```

- Removes the lowest set bit  
- If result = 0 → only one set bit existed  

---

## ⚙️ Algorithm

1. Check `n > 0`
2. Check `(n & (n - 1)) == 0`
3. If both true → return `true`
4. Else → return `false`

---

## 💻 Java Code

```java
public class Main {

  public static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }

  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(16));
    System.out.println(isPowerOfTwo(10));
    System.out.println(isPowerOfTwo(4));
    System.out.println(isPowerOfTwo(1));
    System.out.println(isPowerOfTwo(0));
  }
}
```

---

## 🧠 Dry Run Example

```
n = 8 → 1000
n-1 = 7 → 0111

1000
&0111
------
0000 → true ✔️
```

---

```
n = 10 → 1010
n-1 = 9 → 1001

1010
&1001
------
1000 → false ❌
```

---

## ⏱️ Time Complexity

- **O(1)** → constant time

---

## 📦 Space Complexity

- **O(1)** → no extra space

---

## ⚠️ Important Points

- Always check `n > 0`
- `0` is NOT a power of 2
- Works because power of 2 has only one set bit
- Very common interview trick 🔥

---

## 🚀 Key Takeaways

- `n & (n - 1)` removes lowest set bit
- If result is 0 → only one bit was set
- Fast and efficient check
- Core bit manipulation concept

---