# Algorithm Comparison (Big-O Question)

## Question

Algorithm A and B have worst-case running times:

- A = O(n)
- B = O(log n)

Therefore, Algorithm B always runs faster than Algorithm A.

✔ True or ❌ False?

---

# Final Answer

❌ **B. False**

---

# Why?

Big-O notation describes **growth rate for large input sizes**, not exact runtime.

So:

- Algorithm A → O(n)
- Algorithm B → O(log n)

---

# Key Insight

Asymptotically:

```text
O(log n) grows slower than O(n)
```

So in general:

- B is more efficient than A for large inputs

---

# BUT the statement says:

> “Algorithm B always runs faster than A”

The word **“always” makes it incorrect.**

Big-O does NOT guarantee:

- actual execution speed
- performance on small inputs
- constant factors
- implementation differences

---

# Counterexample

Assume:

```text
A(n) = 0.001n
B(n) = 1000 log n
```

For small input:

```text
n = 10
```

### Compute:

- A = 0.01
- B ≈ 1000 × 3.3 = 3300

👉 So A is MUCH faster here

---

# Key Insight

Even though:

```text
log n < n
```

we cannot say:

```text
B always runs faster than A
```

because:

- constants matter in real execution
- small inputs behave differently
- Big-O ignores constants

---

# Final Conclusion

❌ **Statement is False**

---

# One-Line Rule

> Big-O tells scaling behavior, not actual runtime speed.