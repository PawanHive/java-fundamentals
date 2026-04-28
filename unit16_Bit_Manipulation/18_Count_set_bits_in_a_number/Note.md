# 🔢 Count Set Bits in a Number (Bit Manipulation)

---

## 📌 Problem Statement
Given an integer `n`, count the number of **set bits (1s)** in its binary representation.

---

## 🧠 Idea

- Check the **Least Significant Bit (LSB)** using:
```
n & 1
```
- If it is `1` → increment count  
- Then **right shift** the number to check next bit  

---

## ⚙️ Algorithm

1. Initialize `count = 0`
2. While `n > 0`:
   - If `(n & 1) != 0` → `count++`
   - Right shift → `n = n >> 1`
3. Return `count`

---

## 💻 Java Code

```java
public class Main {

  public static int countSetBits(int n) {
    int count = 0;

    while (n > 0) {
      if ((n & 1) != 0) {
        count++;
      }
      n = n >> 1;
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(countSetBits(15));
    System.out.println(countSetBits(10));
  }
}
```

---

## 🧠 Dry Run

### Example 1
```
n = 15 → 1111
Count = 4
```

---

### Example 2
```
n = 10 → 1010

Step-by-step:
1010 → 0  
0101 → 1  
0010 → 0  
0001 → 1  

Total = 2
```

---

## ⏱️ Time Complexity

- **O(log n)** → depends on number of bits

---

## 📦 Space Complexity

- **O(1)** → no extra space used

---

## ⚠️ Important Points

- `(n & 1)` checks LSB
- `n >> 1` moves to next bit
- Works for positive numbers
- For negative numbers, use `while(n != 0)`

---

## 🚀 Key Takeaways

- Counts number of 1s in binary form
- Simple and efficient approach
- Very common in bit manipulation problems 🔥

---