# #1: Definition of an Array

List of Elements of the **same** type placed in a **contiguous** memory location.

# #2: Creating an Array

```java
dataType arrayName[] = new dataType[size];
``` 
# -------------------------------------------------------------------------------------------------------

# #3: Linear Search

Find the **index** of element in a given array

## 📌 Definition
Linear Search is a simple searching algorithm that checks each element of the array **one by one** until the target element is found or the array ends.

---

## ⚠️ Condition
- Works on **both sorted and unsorted arrays**

---

## ⚙️ Algorithm
1. Start from index `0`
2. Traverse each element:
   - If `arr[i] == key` → return index
3. If loop ends → return `-1` (not found)

---

# -------------------------------------------------------------------------------------------------------

# #9: Binary Search 

##  🔍 Binary Search (DSA Notes)

### 📌 Definition
Binary Search is an efficient searching algorithm used to find an element in a **sorted array** by repeatedly dividing the search space into half.

---

### ⚠️ Condition
- The array **must be sorted** (ascending or descending).

---

### ⚙️ Algorithm
1. Initialize:
   - `start = 0`
   - `end = n - 1`
2. While `start <= end`:
   - `mid = start + (end - start) / 2`
   - If `arr[mid] == key` → return index
   - If `key > arr[mid]` → search right → `start = mid + 1`
   - Else → search left → `end = mid - 1`
3. If not found → return `-1`

---

# -------------------------------------------------------------------------------------------------------


# ⏱️ Time & Space Complexity (DSA Notes)

---

## 📌 What is Time Complexity?

Time Complexity measures **how the execution time of an algorithm grows** with respect to input size `n`.

👉 It does NOT measure actual time (seconds),  
👉 It measures **growth rate**.

---

## 🔢 Common Time Complexities

| Complexity | Name              | Example                        |
|------------|------------------|--------------------------------|
| O(1)       | Constant         | Access array element           |
| O(log n)   | Logarithmic      | Binary Search                  |
| O(n)       | Linear           | Linear Search                  |
| O(n log n) | Linearithmic     | Merge Sort, Quick Sort         |
| O(n²)      | Quadratic        | Nested loops                   |
| O(2ⁿ)      | Exponential      | Recursion (Fibonacci)          |

---

## ⚙️ How to Calculate Time Complexity

### 1. Single Loop
```java
for (int i = 0; i < n; i++)
```
👉 Runs `n` times → **O(n)**

---

### 2. Nested Loop
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++)
```
👉 Runs `n × n` → **O(n²)**

---

### 3. Halving Problem (Binary Search)
```java
while (start <= end)
```
👉 Reduces problem by half → **O(log n)**

---

### 4. Multiple Independent Loops
```java
for (...)  // O(n)
for (...)  // O(n)
```
👉 O(n) + O(n) = **O(n)**

---

### 5. Drop Constants & Lower Terms

👉 O(2n + 3) → **O(n)**  
👉 O(n² + n) → **O(n²)**

---

## 📌 What is Space Complexity?

Space Complexity measures **extra memory used by an algorithm**.

---

## 📦 Types of Space

### 1. Auxiliary Space
Extra space used (temporary variables, arrays)

### 2. Input Space
Space used to store input

👉 Usually, we focus on **Auxiliary Space**

---

## ⚙️ Examples

### Constant Space
```java
int a = 10;
int b = 20;
```
👉 **O(1)**

---

### Linear Space
```java
int arr[] = new int[n];
```
👉 **O(n)**

---

### Recursive Stack Space
```java
function(n) → function(n-1)
```
👉 Stack grows → **O(n)**

---

## ⚠️ Important Points

- Time Complexity → **speed**
- Space Complexity → **memory**
- Optimize based on problem:
  - Less time vs less space (trade-off)

---

## 🔁 Real Examples

| Algorithm       | Time Complexity | Space Complexity |
|----------------|---------------|------------------|
| Linear Search  | O(n)          | O(1)             |
| Binary Search  | O(log n)      | O(1)             |
| Bubble Sort    | O(n²)         | O(1)             |

---

## 🚀 Key Takeaways

- Focus on **worst-case (Big-O)**
- Ignore constants and small terms
- Count loops, recursion, and operations
- Binary Search is much faster than Linear Search
- Always think: **How does it grow with n?**

---

# ------------------------------------------------------------------------------------------------------
# #11: Pairs in Arrays

## 📌 Definition
A **pair** is a combination of two elements from an array.

👉 In DSA, we usually consider **unique pairs** where:
- Order does not repeat → (a, b) = (b, a) ❌
- Same element pair is not allowed → (a, a) ❌

---

## 🔢 Total Number of Pairs

Formula:
```
n(n - 1) / 2
```

Where `n` = size of array

Example:
```
n = 5 → 5 × 4 / 2 = 10 pairs
```

---

## ⚙️ Algorithm

1. Fix first element `i`
2. Pair it with every element after it (`j = i + 1`)
3. Print `(arr[i], arr[j])`

---

# ------------------------------------------------------------------------------------------------------

# #12: Print Subarrays 

## 📌 Definition
A **subarray** is a contiguous part of an array.

👉 Elements must be **continuous (no skipping)**

Example:  
Array = `[2, 4, 6]`  

Subarrays:
- [2]
- [2, 4]
- [2, 4, 6]
- [4]
- [4, 6]
- [6]

---

## 🔢 Total Number of Subarrays

Formula:
```
n(n + 1) / 2
```

Where `n` = size of array

Example:
```
n = 5 → 5 × 6 / 2 = 15 subarrays
```

---

## ⚙️ Algorithm (Brute Force)

1. Fix starting index `i`
2. Fix ending index `j`
3. Print elements from `i` to `j`

---