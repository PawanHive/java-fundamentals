# 🔢 Get i-th Bit in Number (Bit Manipulation)

---

## 📌 Problem Statement
Given a number `n` and index `i`, find the **value of the i-th bit** (0 or 1).

👉 Indexing starts from **0 (right to left)**.

---

## 🧠 Idea

We use a **bit mask** to isolate the i-th bit.

**“Bit mask is created by placing 1s at positions you want to operate on.”**

### Step:
- Create mask using:
```
1 << i
```

- Apply AND operation:
```
n & (1 << i)
```

---

## ⚙️ Algorithm

1. Create bit mask: `bitMask = 1 << i`
2. Perform AND: `n & bitMask`
3. If result is 0 → bit is OFF (0)
4. Else → bit is ON (1)
5. Return result

---

## 💻 Java Code

```java
public class Main {

  public static int getIthBit(int n, int i) {

    int bitMask = 1 << i;

    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(getIthBit(15, 2));
    System.out.println(getIthBit(10, 2));
  }
}
```

## ⏱️ Time Complexity

- **O(1)** → constant time operation

---

## 📦 Space Complexity

- **O(1)** → no extra space used
