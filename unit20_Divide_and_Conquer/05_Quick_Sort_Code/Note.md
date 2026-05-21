# Quick Sort — Pivot & Partition

> **Course:** Sigma 10 (DSA with Java) | **Topic:** Sorting Algorithms

---

## Overview — 3 Steps

1. **Pivot** → Choose the **last element** as pivot
2. **Partition** → Rearrange array around pivot
3. **Quick Sort (Left)** + **Quick Sort (Right)** → Recurse on both halves

---

## What is Partition?

Partition places the **pivot at its correct sorted index** such that:
- All elements to the **left < pivot**
- All elements to the **right > pivot**

---

## Dry Run Example

# Quick Sort Partition — Dry Run

## Setup

```
Array:  [6, 3, 9, 8, 2, 5]
         si=0            ei=5
pivot = arr[ei] = 5
i = -1   (tracks last smaller element)
j = 0    (scans through array)
```

---

## Dry Run (j scans from 0 → 4)

**j = 0 → arr[j] = 6**
- 6 > pivot(5) → **skip**, no swap
- i stays = -1

**j = 1 → arr[j] = 3**
- 3 < pivot(5) → i++ → i=0, swap(arr[i], arr[j])
- swap(arr[0], arr[1]) → swap(6, 3)
- Array: `[3, 6, 9, 8, 2, 5]`

**j = 2 → arr[j] = 9**
- 9 > pivot(5) → **skip**

**j = 3 → arr[j] = 8**
- 8 > pivot(5) → **skip**

**j = 4 → arr[j] = 2**
- 2 < pivot(5) → i++ → i=1, swap(arr[i], arr[j])
- swap(arr[1], arr[4]) → swap(6, 2)
- Array: `[3, 2, 9, 8, 6, 5]`

---

## Final Step — Place Pivot

After the loop ends, swap pivot with `arr[i+1]`:

```
swap(arr[i+1], arr[ei])
= swap(arr[2], arr[5])
= swap(9, 5)
```

### ✅ Final Array: `[3, 2, 5, 8, 6, 9]`

```
[3, 2] | 5 | [8, 6, 9]
          ↑
     Pivot is now at
     its CORRECT position (index 2)!
```

> **5 is underlined in red** on the board because it's now in its final sorted position.


| j | arr[j] | Condition  | Action              | i  | Array State           |
|---|--------|------------|---------------------|----|------------------------|
| 0 | 6      | 6 > 5      | Skip                | -1 | `[6, 3, 9, 8, 2, 5]`  |
| 1 | 3      | 3 ≤ 5      | i++, swap(i=0, j=1) | 0  | `[3, 6, 9, 8, 2, 5]`  |
| 2 | 9      | 9 > 5      | Skip                | 0  | `[3, 6, 9, 8, 2, 5]`  |
| 3 | 8      | 8 > 5      | Skip                | 0  | `[3, 6, 9, 8, 2, 5]`  |
| 4 | 2      | 2 ≤ 5      | i++, swap(i=1, j=4) | 1  | `[3, 2, 9, 8, 6, 5]`  |
| — | —      | Loop ends  | swap(i+1=2, ei=5)   | —  | `[3, 2, 5, 8, 6, 9]` ✅ |

**Pivot `5` is now at index 2 — its correct sorted position.**

```
[3, 2] | 5 | [8, 6, 9]
  left   ↑    right
       pivot
```

---

## Swap Code

```java
// When arr[j] <= pivot:
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
```

## Recursion Tree

```
        [6, 3, 9, 8, 2, 5]   pivot = 5
                 |
        [3, 2] | 5 | [8, 6, 9]
           |              |
       [2] | 3 | []    [6] | 8 | [9]
                              |
                          [] | 6 | []   [] | 9 | []

Final Sorted: [2, 3, 5, 6, 8, 9] ✅
```

---

## Complexity Analysis

| Case         | Time Complexity | When?                              |
|--------------|-----------------|------------------------------------|
| Best Case    | O(n log n)      | Pivot always splits array in half  |
| Average Case | O(n log n)      | Random data                        |
| Worst Case   | O(n²)           | Already sorted / reverse sorted    |

| Property         | Value            |
|------------------|------------------|
| Space Complexity | O(log n) — stack |
| In-place         | ✅ Yes            |
| Stable           | ❌ No             |

---

## Key Takeaways

- Pivot is always the **last element**
- `i` tracks the **boundary of smaller elements**
- `j` **scans** the entire array
- After the loop, pivot is swapped to `i+1` (its correct spot)
- Worst case occurs when pivot is always min/max → leads to **O(n²)**