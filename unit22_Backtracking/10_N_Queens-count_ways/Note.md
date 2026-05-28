# Time Complexity

Worst case:

```text
O(N!)
```

Because:
- First row → N choices
- Second row → N-1 choices
- Third row → N-2 choices
- ...

---

# Space Complexity

```text
O(N)
```

(for recursion stack)

Board itself uses:

```text
O(N²)
```