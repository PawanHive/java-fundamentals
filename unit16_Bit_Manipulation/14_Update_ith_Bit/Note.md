# 🔄 Update i-th Bit in a Number (Bit Manipulation)

---

## 📌 Problem Statement
Given a number `n`, an index `i`, and a value `newBit` (0 or 1),  
**update the i-th bit to the given value**.

👉 Indexing starts from **0 (right to left)**.

---

## 🧠 Idea

To update a bit:
1. First **clear** the i-th bit (make it 0)
2. Then **set it** to the desired value (0 or 1)

---

## ⚙️ Algorithm

1. Clear i-th bit → `n = n & ~(1 << i)`
2. Set new value → `n = n | (newBit << i)`
3. Return `n`

---

## 💻 Java Code

```java
public class Main {

  public static int updateIthBit(int n, int i, int newBit) {

    // Step 1: clear i-th bit
    n = n & ~(1 << i);

    // Step 2: set new value
    int bitMask = newBit << i;

    return n | bitMask;
  }

  public static void main(String[] args) {
    System.out.println(updateIthBit(10, 2, 1));
    System.out.println(updateIthBit(10, 2, 0));
  }
}
```

---

## 🧠 Dry Run

### Example 1
```
n = 10 → 1010
i = 2
newBit = 1
```

```
Clear → 1010
Set   → 1110 → 14
```

---

### Example 2
```
n = 10 → 1010
i = 2
newBit = 0
```

```
Clear → 1010
Set   → 1010 → 10
```

---

## ⏱️ Time Complexity

- **O(1)** → constant time

---

## 📦 Space Complexity

- **O(1)** → no extra space

---

## ⚠️ Important Points

- `newBit` must be **0 or 1**
- Always clear before setting
- Works for both update cases
- Uses bitwise operations (`&`, `|`, `~`, `<<`)

---

## 🚀 Key Takeaways

- Update = **clear + set**
- Efficient constant time operation
- Core concept in bit manipulation 🔥
- Useful in many advanced problems

---

## ⚡ Bit Manipulation Summary

| Operation | Expression |
|----------|------------|
| Set bit | `n | (1 << i)` |
| Clear bit | `n & ~(1 << i)` |
| Update bit | `n = (n & ~(1 << i)) | (newBit << i)` |

---