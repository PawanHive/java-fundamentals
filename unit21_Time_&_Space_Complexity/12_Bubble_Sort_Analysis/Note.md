# Bubble Sort Analysis

**Code:**
```java
void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {           // outer: n-1 passes
        for (int j = 0; j < n - 1 - i; j++) {   // inner: shrinks each pass
            if (arr[j] > arr[j + 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

# Pass 1 — What Happens to `[5, 3, 1, 4, 2]`

Each step: Compare adjacent pair, Swap if `left > right`

Start:
[5, 3, 1, 4, 2]

`5>3` --> swap
[3, 5, 1, 4, 2]

`5>1` --> swap
[3, 1, 5, 4, 2]

`5>4` --> swap
[3, 1, 4, 5, 2]

`5>2` --> swap
[3, 1, 4, 2, 5]

*5 is now in its correct position*

**After pass 1: Largest element (`5`) is sorted. Inner loop runs: `n - 1 = 4` times during this pass**

# Inner Loop Shrinks Each Pass

For `n = 5`:

| Pass | Comparisons |
|---|---|
| Pass 1 (`i = 0`) | 4 comps |
| Pass 2 (`i = 1`) | 3 comps |
| Pass 3 (`i = 2`) | 2 comps |
| Pass 4 (`i = 3`) | 1 comp |

Total:
4 + 3 + 2 + 1 = 10 comparisons, for `n = 5`.

**Inner loop runs: (n - 1) + (n - 2) + (n - 3) + ... + 1times total. This is aShrinking triangle pattern -- same as Nested Loop 2!**

# Mathematical Derivation

| Pass (i) | Inner loop runs |
|---|---|
| i = 0 | n - 1 times |
| i = 1 | n - 2 times |
| i = 2 | n - 3 times |
| ... | ... |
| i = n - 2 | 1 time |
| Total | (n - 1) + (n - 2) + ... + 1 |


= n(n-1)/2
= (n² - n) / 2
= n²/2 - n/2
→ drop constant (½)
→ drop smaller term (n/2)
= O(n²)

---

# Best / Average / Worst Case

| Case | Input | Time | Space |
|---|---|---|---|
| Best | Already sorted | O(n) (with flag) | O(1) |
| Average | Random order | O(n²) | O(1) |
| Worst | Reverse sorted | O(n²) | O(1) |


**Space is `O(1)` — Bubble Sort only uses a temp variable for swapping. No extra arrays needed → in-place algorithm.**


# -------------------------------------------------------------------------------------------------------
# -------------------------------------------------------------------------------------------------------

# The Optimized version -- o(n) best case:

```java 
void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;           // flag
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;              // already sorted! stop early
    }
}
```

If no swaps happened in a full pass → array is already sorted → exit early → O(n) best case.

# Complexity Summary

| Complexity Type | Result |
|---|---|
| Time — Best Case | O(n) (with flag) |
| Time — Average Case | O(n²) |
| Time — Worst Case | O(n²) |
| Space | O(1) — in place |
| Stable Sort? | ✅ Yes |

---

# Why Bubble Sort is O(n²)
The math boils down to the `sum 1 + 2 + ... + (n-1) = n(n-1)/2` which is always` O(n²)`.