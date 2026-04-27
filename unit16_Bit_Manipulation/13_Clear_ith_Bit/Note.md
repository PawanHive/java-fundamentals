# 🧹 Clear i-th Bit in a Number (Bit Manipulation)

---

## 📌 Problem Statement
Given a number `n` and an index `i`, **clear (set to 0)** the i-th bit.

👉 Indexing starts from **0 (right to left)**.

---

## 🧠 Idea

We create a **bit mask** that has:
- `0` at i-th position  
- `1` at all other positions  

Then apply AND (`&`) to turn OFF that bit.

---

## ⚙️ Algorithm

1. Create mask: `bitMask = ~(1 << i)`
2. Apply AND: `result = n & bitMask`
3. Return result

---

## 💻 Java Code

```java
public class Main {

  public static int clearIthBit(int n, int i) {

    int bitMask = ~(1 << i);
    return n & bitMask;
  }

  public static void main(String[] args) {
    System.out.println(clearIthBit(10, 1));
  }
}
```

---

## 🧠 Dry Run Example

```
n = 10 → 1010
i = 1 → 0010

Step 1: 1 << i = 0010
Step 2: ~(0010) = 1101

Step 3:
1010
&1101
------
1000 → 8
```

Output:
```
8
```

---

## ⏱️ Time Complexity

- **O(1)** → constant time

---

## 📦 Space Complexity

- **O(1)** → no extra space used

---

## ⚠️ Important Points

- `~` (NOT) flips all bits
- AND (`&`) clears the targeted bit
- Only the i-th bit becomes 0, others remain unchanged
- Works for all integers

---

## 🚀 Key Takeaways

- `1 << i` targets the i-th bit
- `~(1 << i)` creates clearing mask
- `n & mask` clears the bit
- Core concept in bit manipulation 🔥

---

## ⚡ Bit Manipulation Summary

| Operation | Expression |
|----------|------------|
| Get bit | `n & (1 << i)` |
| Set bit | `n | (1 << i)` |
| Clear bit | `n & ~(1 << i)` |

---