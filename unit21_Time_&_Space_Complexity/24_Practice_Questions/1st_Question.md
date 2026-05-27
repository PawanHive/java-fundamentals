 
# Practice Question — Time Complexity Analysis (Java)
 
---
 
## The Code
 
```java
int i, j, k = 0;
 
for (i = n / 2; i <= n; i++) {        // outer loop
    for (j = 2; j <= n; j = j * 2) {  // inner loop
        k = k + n / 2;                 // O(1) work
    }
}
```
 
**Question:** Find the time complexity.
- A. O(n)
- B. O(n log n) ✅
- C. O(n²)
- D. O(n² log n)
---
 
## Step 1 — Analyze the Outer Loop
 
```java
for (i = n / 2; i <= n; i++)
```
 
**Where does i start?**
```
i starts at  n/2
```
 
**Where does i end?**
```
i goes until i <= n → last value = n
```
 
**List every value of i (for n = 10):**
```
i = 5, 6, 7, 8, 9, 10  →  6 iterations
```
 
**Formula to count iterations:**
```
iterations = end - start + 1
           = n - n/2 + 1
           = 10 - 5 + 1
           = 6
```
 
**Simplify for Big O:**
```
n - n/2 + 1
→ drop +1 (constant)
= n - n/2
= 2n/2 - n/2
= n/2
→ drop constant (1/2)
= O(n)
```
 
**Why starting at n/2 doesn't matter:**
 
| n | i starts | i ends | iterations | = n/2 |
|---|---|---|---|---|
| 10 | 5 | 10 | 6 | 5 |
| 20 | 10 | 20 | 11 | 10 |
| 100 | 50 | 100 | 51 | 50 |
| 1000 | 500 | 1000 | 501 | 500 |
 
> Starting at n/2 instead of 0 just cuts iterations in half. Half of n is still proportional to n → **O(n)**
 
---
 
## Step 2 — Analyze the Inner Loop
 
```java
for (j = 2; j <= n; j = j * 2)
```
 
**Where does j start?**
```
j starts at 2
```
 
**How does j change each iteration?**
```
j = j * 2  →  j doubles every iteration
```
 
**Trace every value of j for n = 10:**
 
| Step | j value | j <= 10? | Body runs? | Next j = j×2 |
|---|---|---|---|---|
| Start | 2 | 2 <= 10 ✅ | Yes | 2 × 2 = 4 |
| Step 2 | 4 | 4 <= 10 ✅ | Yes | 4 × 2 = 8 |
| Step 3 | 8 | 8 <= 10 ✅ | Yes | 8 × 2 = 16 |
| Step 4 | 16 | 16 <= 10 ❌ | STOP | — |
 
**Loop runs 3 times. log₂(10) ≈ 3 ✅**
 
**Verify with clean powers of 2:**
 
| n | values of j | iterations | log₂(n) |
|---|---|---|---|
| 8 | 2, 4, 8 | 3 | log₂(8) = 3 ✅ |
| 16 | 2, 4, 8, 16 | 4 | log₂(16) = 4 ✅ |
| 32 | 2, 4, 8, 16, 32 | 5 | log₂(32) = 5 ✅ |
 
**The doubling rule:**
```
j *= 2  → doubles each time → runs log₂(n) times → O(log n)
 
Doubling going UP is same as halving going DOWN — both O(log n):
 
Halving:  n → n/2 → n/4 → ... → 1   (log n steps DOWN)
Doubling: 2 → 4   → 8   → ... → n   (log n steps UP)
```
 
**Loop pattern cheat sheet:**
 
| Pattern | Complexity |
|---|---|
| `i++` or `i--` | O(n) |
| `i += k` | O(n) |
| `i *= 2` or `j = j * 2` | O(log n) |
| `i /= 2` | O(log n) |
 
---
 
## Step 3 — Multiply (Nested Loops)
 
```
Outer loop  →  O(n)
Inner loop  →  O(log n)
Nested      →  O(n) × O(log n)  =  O(n log n)
 
Work inside (k = k + n/2) → O(1) → doesn't affect complexity
```
 
---
 
## Final Answer → B. O(n log n)
 
```
Outer: i goes from n/2 to n   → n/2 iterations  → O(n)
Inner: j doubles 2 → 4 → 8..  → log n iterations → O(log n)
Total: O(n) × O(log n)         =  O(n log n)
```
 
**Why other options are wrong:**
 
| Option | Why wrong |
|---|---|
| A. O(n) | Ignores the inner O(log n) loop |
| C. O(n²) | Inner loop is NOT O(n) — j multiplies, doesn't add |
| D. O(n² log n) | Would need a triple nested structure |
 
---