
```java 
    // some k < n
    for (int i = 0; i<n; i=i+k) {
      for (int j=i+1; j<=k; j++) {
        //some constant work
        // is done in this loop
      }
    }
```

# Tracing Nested Loops Step-by-Step (n = 50, k = 5)

---

## Code Logic

```java
for(int i = 0; i < n; i = i + k) {

    for(int j = i + 1; j <= k; j++) {
        // operation
    }

}
```

Given:

```text
n = 50
k = 5
```

---

# Step 1 — Trace Outer Loop

Outer loop increases by `k` every time:

```text
i = 0, 5, 10, 15, 20, 25, 30, 35, 40, 45
```

Total outer iterations:

```text
n / k = 50 / 5 = 10
```

✅ Outer loop runs 10 times.

---

# Step 2 — Trace Inner Loop

Inner loop condition:

```java
j = i + 1;
j <= k;
```

So for every value of `i`, check whether `i + 1 <= 5`.

---

# Detailed Trace

| i value | j starts at | Condition (`j <= 5`) | Inner Runs? | Iterations |
|---|---|---|---|---|
| i = 0 | j = 1 | 1 ≤ 5 | ✅ Yes | 5 times → (1,2,3,4,5) |
| i = 5 | j = 6 | 6 ≤ 5 | ❌ No | 0 |
| i = 10 | j = 11 | 11 ≤ 5 | ❌ No | 0 |
| i = 15 | j = 16 | 16 ≤ 5 | ❌ No | 0 |
| i = 20 | j = 21 | 21 ≤ 5 | ❌ No | 0 |
| i = 25 | j = 26 | 26 ≤ 5 | ❌ No | 0 |
| i = 30 | j = 31 | 31 ≤ 5 | ❌ No | 0 |
| i = 35 | j = 36 | 36 ≤ 5 | ❌ No | 0 |
| i = 40 | j = 41 | 41 ≤ 5 | ❌ No | 0 |
| i = 45 | j = 46 | 46 ≤ 5 | ❌ No | 0 |

---

# Total Operations

| Operation | Count |
|---|---|
| Outer loop checks | 10 times |
| Inner body runs | 5 times total |
| Total operations | 10 + 5 = 15 |

---

# Mathematical Analysis

```text
Total = n/k + k
```

Substitute values:

```text
= 50/5 + 5
= 10 + 5
= 15
```

---

# Big O Simplification

```text
n/k + k
```

Since `k` is constant:

- Drop constants
- `n/k` behaves like `n`

Final complexity:

```text
O(n)
```

---

# Important Insight

At first glance, this looks like a nested loop (`O(n²)`).

But the inner loop only actually runs when:

```text
i = 0
```

For every other value:

```text
j starts greater than k
```

So the inner loop dies instantly.

Even though there are two loops:

```text
Inner loop total executions = only 5
NOT 50 × 5 = 250
```

That is why the complexity becomes:

```text
O(n)
```

instead of:

```text
O(n²)
```

---