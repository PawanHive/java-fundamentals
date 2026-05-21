# Time Complexity — Code Examples (Java)

> **Core idea:** Time complexity = how the number of operations *scales* as input size `n` grows.

---

## O(1) — Constant Time

No matter how large the input, the number of operations never changes.

```java
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr[0]);  // always 1 operation
```

| n   | Operations |
|-----|------------|
| 5   | 1          |
| 100 | 1          |
| 1M  | 1          |

**Pattern:** Direct memory access, returning a value, simple math.

---

## O(n) — Linear Time

One operation per element. Double the input → double the work.

```java
int[] arr = {10, 20, 30, 40, 50};
for (int item : arr) {
    System.out.println(item);  // runs n times
}
```

| n   | Operations |
|-----|------------|
| 5   | 5          |
| 100 | 100        |
| 1M  | 1,000,000  |

**Pattern:** A single loop over the input.

---

## O(n²) — Quadratic Time

A loop inside a loop. Each element pairs with every other element.

```java
int[] arr = {10, 20, 30, 40, 50};
for (int i : arr) {
    for (int j : arr) {
        System.out.println(i + " " + j);  // runs n × n times
    }
}
```

| n   | Operations         |
|-----|--------------------|
| 5   | 25                 |
| 100 | 10,000             |
| 1M  | 1,000,000,000,000  |

**Pattern:** Nested loops over the same input. Grows explosively — avoid for large inputs.

---

## O(log n) — Logarithmic Time

Each step cuts the problem in half. Grows very slowly.

```java
int n = 16;
while (n > 1) {
    n = n / 2;  // halves each time
}
// n=16 → 8 → 4 → 2 → 1  (4 steps)
```

| n         | Operations |
|-----------|------------|
| 8         | 3          |
| 16        | 4          |
| 1,000     | ~10        |
| 1,000,000 | ~20        |

**Pattern:** Halving the input each step (e.g. Binary Search).

---

## O(n log n) — Linearithmic Time

n work done at each of the log n levels. The sweet spot for sorting.

```java
// Merge Sort — classic O(n log n) example
void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);      // log n levels of splitting
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);       // n work at each level
    }
}
```

| n   | Operations  |
|-----|-------------|
| 5   | ~11         |
| 100 | ~664        |
| 1M  | ~20,000,000 |

**Pattern:** Divide-and-conquer algorithms like Merge Sort, Heap Sort.

---

## Growth Comparison (same n)

```
n = 10

O(1)       →        1 operation
O(log n)   →        3 operations
O(n)       →       10 operations
O(n log n) →       33 operations
O(n²)      →      100 operations
```

```
n = 1000

O(1)       →            1 operation
O(log n)   →           10 operations
O(n)       →        1,000 operations
O(n log n) →        9,965 operations
O(n²)      →    1,000,000 operations
```

---

## Key Rules for Simplification

1. **Drop constants** — `5n` → `O(n)`, `100` → `O(1)`
2. **Drop smaller terms** — `n² + n` → `O(n²)`
3. **Nested loops multiply** — loop inside loop → `O(n × n)` = `O(n²)`
4. **Sequential loops add** — two separate loops → `O(n + n)` = `O(n)`
5. **Halving = log n** — any step that halves the input is logarithmic

---

## Quick Reference

| Complexity | Name         | Example Algorithm     | Good? |
|------------|--------------|-----------------------|-------|
| O(1)       | Constant     | Array index access    | Best  |
| O(log n)   | Logarithmic  | Binary Search         | Great |
| O(n)       | Linear       | Linear Search         | Good  |
| O(n log n) | Linearithmic | Merge Sort, Heap Sort | OK    |
| O(n²)      | Quadratic    | Bubble Sort           | Bad   |
| O(2ⁿ)      | Exponential  | Recursive Fibonacci   | Avoid |

---
