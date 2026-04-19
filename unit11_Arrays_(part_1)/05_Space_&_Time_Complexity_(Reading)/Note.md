# 🧠 Time & Space Complexity (Simple Notes)

---

## 🎯 Simple Meaning

| Complexity | Meaning |
|------------|--------|
| O(1)       | Instant (direct access) |
| O(n)       | Check one by one (linear search) |
| O(n²)      | Very slow (nested loops) |
| O(log n)   | Divide and conquer (keep splitting) |

---

## 💡 Quick Understanding

- **O(1)** → Fastest (no loops)
- **O(n)** → One loop
- **O(n²)** → Loop inside loop (very slow)
- **O(log n)** → Divide problem into halves repeatedly

---

## 🧠 Memory Trick

> Time Complexity = Speed of code execution  
> Space Complexity = Memory used by code

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