# Clear Range of Bits — Bit Manipulation

## Problem
Given a number `n`, clear all bits from index `i` to index `j` (inclusive).

**Example:** `n = 100111010011`, `i = 2`, `j = 7`

---

## Strategy — Use Two Masks

We need to **preserve** bits above `j` and below `i`, and **zero out** everything in between.

We build two masks and combine them with OR (`|`).

---

## Mask `a` — Preserve bits ABOVE position `j`

```java
int a = (~0) << (j + 1);
```

- `~0` → all 1s: `1111 1111 1111...`
- Left shift by `(j + 1)` → 1s only at positions above `j`

**For j = 7:**
```
a = 1111 0000 0000
```

---

## Mask `b` — Preserve bits BELOW position `i`

```java
int b = (1 << i) - 1;
```

### Why does `(1 << i) - 1` work?

Subtracting 1 from a power of 2 always fills the lower bits with 1s:

| Expression     | Binary    | Decimal     |
|----------------|-----------|-------------|
| `(1 << 1) - 1` | `0...001` | 2¹ - 1 = 1  |
| `(1 << 2) - 1` | `0...011` | 2² - 1 = 3  |
| `(1 << 3) - 1` | `0...0111`| 2³ - 1 = 7  |
| `(1 << 4) - 1` | `0...1111`| 2⁴ - 1 = 15 |

**Pattern:** `(1 << i) - 1` always gives exactly `i` ones in the lowest positions.

**For i = 2:**
```
1 << 2       = 0000 0100
(1 << 2) - 1 = 0000 0011  ← bits 0 and 1 are set (below position i)
```

---

## Combine Both Masks

```java
int mask = a | b;
```

```
a    = 1111 0000 0000   (1s above j=7)
b    = 0000 0000 0011   (1s below i=2)
---------------------------------
mask = 1111 0000 0011   (0s only in range i to j)
```

---

## Final Result

```java
int result = n & mask;
```

ANDing `n` with the mask **clears bits i through j** and keeps everything else intact.

---

## Complete Java Code

```java
public static int clearRange(int n, int i, int j) {
    int a = (~0) << (j + 1);       // 1s above j
    int b = (1 << i) - 1;          // 1s below i
    int mask = a | b;               // combine
    return n & mask;                // clear the range
}
```

---

## Quick Summary

| Mask | Formula         | Purpose                    |
|------|-----------------|----------------------------|
| `a`  | `(~0) << (j+1)` | Keep bits **above** `j`    |
| `b`  | `(1 << i) - 1`  | Keep bits **below** `i`    |
| mask | `a \| b`        | 0s only in range `[i, j]`  |

> **Key Insight:** `(1 << i) - 1` is perfect for generating a mask of `i` consecutive 1s starting from bit 0, because subtracting 1 from any power of 2 flips all lower bits to 1.