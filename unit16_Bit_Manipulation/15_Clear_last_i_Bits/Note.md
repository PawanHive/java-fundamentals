# 🧹 Clear Last i Bits (Bit Manipulation)

---

## 📌 Problem Statement
Given a number `n` and an integer `i`, **clear (set to 0) all bits from index 0 to (i-1)**.

👉 In simple terms: remove the **last i bits (rightmost bits)**.

---

## 🧠 Idea

We create a mask that has:
- `0` in the last `i` positions  
- `1` in all higher positions  

Then apply AND (`&`) to clear those bits.

---

## ⚙️ Algorithm

1. Create mask → `bitMask = (~0) << i`
2. Apply AND → `result = n & bitMask`
3. Return result

---

## 💻 Java Code

```java
public class Main {

  public static int clearLastIBits(int n, int i) {

    int bitMask = (~0) << i;
    return n & bitMask;
  }

  public static void main(String[] args) {
    System.out.println(clearLastIBits(15, 2));
  }
}
```

---

## 🧠 Dry Run Example

```
n = 15 → 1111
i = 2
```

Step 1:
```
~0       = 11111111
(~0)<<2  = 11111100
```

Step 2:
```
1111
&1100
------
1100 → 12
```

Output:
```
12
```

---

## ⏱️ Time Complexity

- **O(1)** → constant time

---

## 📦 Space Complexity

- **O(1)** → no extra space used

---

## ⚠️ Important Points

- Clears all bits from index `0` to `i-1`
- Uses left shift `<<`
- `~0` creates all 1s mask
- Different from clearing a single bit

---

## 🚀 Key Takeaways

- `(~0) << i` creates mask with trailing zeros
- `n & mask` clears last i bits
- Useful in range-based bit problems
- Important concept in advanced bit manipulation 🔥

---

## ⚡ Bit Manipulation Summary

| Operation | Expression |
|----------|------------|
| Get bit | `n & (1 << i)` |
| Set bit | `n | (1 << i)` |
| Clear bit | `n & ~(1 << i)` |
| Clear last i bits | `n & ((~0) << i)` |

---