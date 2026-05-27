# Time & Space Complexity Analysis

# The Code

```java
int a = 0;

for (int i = 0; i < n; ++i) {

    for (int j = n; j > i; --j) {

        a = a + i + j;
    }
}
```

---

# Understanding the Loops

# Outer Loop (`i`)

```java
for (int i = 0; i < n; ++i)
```

Runs from:

```text
i = 0 to i = n-1
```

Total iterations:

```text
n times
```

---

# Inner Loop (`j`)

```java
for (int j = n; j > i; --j)
```

For every value of `i`:

- `j` starts from `n`
- decreases until `j > i`

So:

```text
j runs from n down to i+1
```

Number of iterations:

```text
n - i
```

---

# Counting Total Operations

| i Value | Inner Loop Runs |
|---|---|
| 0 | n times |
| 1 | n-1 times |
| 2 | n-2 times |
| ... | ... |
| n-1 | 1 time |

---

# Total Work

Total operations become:

```text
n + (n-1) + (n-2) + ... + 1
```

This is the sum of first `n` natural numbers:

```text
n(n+1)/2

= (n² + n)/2
```

---

# Final Time Complexity

After dropping:
- constants
- lower-order terms

from:

```text
(n² + n)/2
```

we get:

```text
O(n²)
```

---

# Space Complexity Analysis

The code uses only:
- `a`
- `i`
- `j`

No extra:
- arrays
- lists
- data structures

are created.

So memory usage does NOT grow with `n`.

---

# Final Space Complexity

```text
O(1)
```

This is constant space complexity.
