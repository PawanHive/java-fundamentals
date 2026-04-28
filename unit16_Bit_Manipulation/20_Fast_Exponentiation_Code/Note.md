# ⚡ Fast Exponentiation (Binary Exponentiation)

---

## 📌 Problem Statement
Compute:
```
a^n
```
efficiently using **bit manipulation**, instead of multiplying `a` repeatedly.

---

## 🧠 Idea

Instead of doing multiplication `n` times, we:
- Use **binary form of exponent**
- Multiply only when the bit is `1`
- Square the base at each step

👉 This reduces complexity from **O(n) → O(log n)**

---

## ⚙️ Algorithm

1. Initialize `ans = 1`
2. While `n > 0`:
   - If `(n & 1) != 0` → multiply `ans *= a`
   - Square base → `a = a * a`
   - Right shift exponent → `n = n >> 1`
3. Return `ans`

---

## 💻 Java Code

```java
public class Main {

  public static int fastExpo(int a, int n) {
    int ans = 1;

    while (n > 0) {

      if ((n & 1) != 0) {
        ans = ans * a;
      }

      a = a * a;
      n = n >> 1;
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(fastExpo(3, 5));
    System.out.println(fastExpo(5, 3));
  }
}
```

---

## 🧠 Dry Run

### Example: `3^5`

```
n = 5 → 101

Step 1:
n = 5 (odd) → ans = 1 * 3 = 3
a = 9

Step 2:
n = 2 (even) → skip
a = 81

Step 3:
n = 1 (odd) → ans = 3 * 81 = 243
```

Output:
```
243
```

---

## ⏱️ Time Complexity

- **O(log n)** → exponent is reduced by half each step

---

## 📦 Space Complexity

- **O(1)** → constant space

---

## ⚠️ Important Points

- Uses binary representation of exponent
- Multiplication happens only when bit is `1`
- Base is squared every iteration
- Much faster than normal exponentiation

---

## 🚀 Key Takeaways

- Converts exponent into binary
- Reduces repeated multiplication
- Core technique in optimization problems 🔥
- Used in modular exponentiation & cryptography

---