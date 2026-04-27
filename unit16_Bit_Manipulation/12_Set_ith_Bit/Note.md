# 🔧 Set i-th Bit in a Number (Bit Manipulation)

---

## 📌 Problem Statement
Given a number `n` and an index `i`, set the **i-th bit to 1**.

👉 Indexing starts from **0 (right to left)**.

---

## 🧠 Idea

We use a **bit mask** to turn ON the i-th bit.

### Step:
- Create mask using:
```
1 << i
```

- Apply OR operation:
```
n | (1 << i)
```

---

## ⚙️ Algorithm

1. Create bit mask: `bitMask = 1 << i`
2. Perform OR operation: `n | bitMask`
3. Return the result

---

## 💻 Java Code

```java
public class Main {

  public static int setIthBit(int n, int i) {

    int bitMask = 1 << i;
    return n | bitMask;
  }

  public static void main(String[] args) {
    System.out.println(setIthBit(10, 2));
  }
}
```

---

## 🧠 Dry Run Example

```
n = 10 → 1010
i = 2 → 0100

1010
|0100
------
1110 → 14
```

Output:
```
14
```

---

## ⏱️ Time Complexity

- **O(1)** → constant time

---

## 📦 Space Complexity

- **O(1)** → no extra space used

---

## ⚠️ Important Points

- OR (`|`) sets bit to 1
- Even if bit is already 1 → remains 1
- Uses left shift `<<` to target specific bit
- Index starts from rightmost bit (0-based)
