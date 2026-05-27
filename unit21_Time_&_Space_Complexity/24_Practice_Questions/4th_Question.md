# Floor Square Root Function — Time & Space Complexity

---

# Given Code

```java
class SqrtNum {

    static int floorSqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int i = 1, result = 1;

        while (result <= x) {

            i++;
            result = i * i;
        }

        return i - 1;
    }

    public static void main(String[] args) {

        int x = 11;
        System.out.print(floorSqrt(x));
    }
}
```

---

# What is the Function Doing?

This function calculates:

> floor of √x (square root of x)

---

## Example:

- √11 ≈ 3.31 → output = 3  
- √16 = 4 → output = 4  

---

# Step 1 — Understand the Loop

```java
while (result <= x)
```

Inside loop:

```java
i++
result = i * i
```

So values grow like:

| i | result = i² |
|---|---|
| 1 | 1 |
| 2 | 4 |
| 3 | 9 |
| 4 | 16 |
| 5 | 25 |
| ... | ... |

---

## Loop Stops When:

```text
i² > x
```

---

# Step 2 — How Many Iterations?

We stop when:

```text
i² ≈ x
```

So:

```text
i ≈ √x
```

---

# Step 3 — Time Complexity

The loop runs until `i = √x`.

So total iterations:

```text
O(√x)
```

---

# Final Time Complexity

```text
O(√x)
```

---

# Step 4 — Space Complexity

We use only:
- `i`
- `result`
- `x`

No extra data structures are used.

So space usage does NOT grow with input.

---

# Final Space Complexity

```text
O(1)
```

---

# Final Answer

| Type | Complexity |
|------|-----------|
| Time | O(√x) |
| Space | O(1) |

---

# Why Time Complexity is O(√x)?

Because:

- we check values one by one
- `i` increases linearly
- but we stop when `i² > x`

So:

```text
i² ≈ x
⇒ i ≈ √x
```

---

# Key Insight

This is:

> Linear search on square values

Not binary search.

That’s why it is slower.

---

# Better Approach (Optional Idea)

We can optimize using binary search:

```text
O(log x)
```

If you want, I can also convert that optimized version into `.md` notes.