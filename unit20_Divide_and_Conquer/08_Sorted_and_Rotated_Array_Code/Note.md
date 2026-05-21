# Search in Rotated Sorted Array

## What is a Rotated Sorted Array?

A normal sorted array like `[0, 1, 2, 4, 5, 6, 7]` when **rotated** becomes:

```
[4, 5, 6, 7, 0, 1, 2]
```

It's sorted, but **shifted** at some pivot point. Two sorted "lines" (L1 and L2) with a **drop** in between.

---

## The Problem

```
Array:  [4, 5, 6, 7, 0, 1, 2]
         si              ei
mid = arr[3] = 7
target = 0
```

Find `target = 0` using **Binary Search**.

---

## Why Normal Binary Search Fails?

Normal binary search assumes the **whole array is sorted**. Here only **one half is always sorted** at a time — so we figure out which half is sorted, then decide where to search.

---

## The Approach — 4 Cases

### Step 1: Find mid
```java
int mid = (si + ei) / 2;
if (arr[mid] == target) return mid;
```

### Step 2: Determine which half is sorted

---

### 🔵 Case 1: mid is on L1 (left half is sorted)
**Condition:** `arr[si] <= arr[mid]`

```
[4, 5, 6, 7, | 0, 1, 2]
  ←   L1   →    ← L2 →
       ↑
      mid
```

- **Case a — Go LEFT:** `arr[si] <= target <= arr[mid]` → `ei = mid - 1`
- **Case b — Go RIGHT (else):** target not in left half → `si = mid + 1`

---

### 🔵 Case 2: mid is on L2 (right half is sorted)
**Condition:** `arr[mid] <= arr[ei]`

```
[4, 5, 6, 7, | 0, 1, 2]
  ←  L1  →      ← L2 →
                   ↑
                  mid
```

- **Case c — Go RIGHT:** `arr[mid] <= target <= arr[ei]` → `si = mid + 1`
- **Case d — Go LEFT (else):** target not in right half → `ei = mid - 1`

---

## All 4 Cases — Summary Table

| Case | mid on | Condition | Move |
|------|--------|-----------|------|
| a | L1 | `arr[si] <= target <= arr[mid]` | `ei = mid - 1` |
| b | L1 | else | `si = mid + 1` |
| c | L2 | `arr[mid] <= target <= arr[ei]` | `si = mid + 1` |
| d | L2 | else | `ei = mid - 1` |

---

## Dry Run

```
Array = [4, 5, 6, 7, 0, 1, 2],  target = 0
si=0, ei=6, mid=3, arr[mid]=7
```

**Step 1:**
- `arr[si]=4 <= arr[mid]=7` → mid on **L1**
- Is `4 <= 0 <= 7`? ❌ No → Case b: `si = mid+1 = 4`

**Step 2:**
- `si=4, ei=6, mid=5, arr[mid]=1`
- `arr[mid]=1 <= arr[ei]=2` → mid on **L2**
- Is `1 <= 0 <= 2`? ❌ No → Case d: `ei = mid-1 = 4`

**Step 3:**
- `si=4, ei=4, mid=4, arr[mid]=0`
- `arr[mid] == target` ✅ → **return index 4**


---

## Complexity

| Property | Value |
|----------|-------|
| Time Complexity | **O(log n)** |
| Space Complexity | **O(1)** |

> **Key insight:** One half is always sorted in a rotated array — use that to eliminate half the search space each time.