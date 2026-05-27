# Recursive Algorithms

## Total work done (Time Complexity) = (no of calls * work in each call)

## Recurrence Equation

## Space Complexity = (max depth * memory in each call)

# ------------------------------------------------------------------------------------------------
# ------------------------------------------------------------------------------------------------


# Recursive Complexity Analysis — Factorial (Java)
 
---
 
## The Code
 
```java
int factorial(int n) {
    if (n == 0) return 1;         // base case
    return n * factorial(n - 1);  // recursive case
}
```
 
---
 
## How it Works — Call Stack for factorial(4)
 
**Calls going DOWN (building the stack):**
 
```
factorial(4)  →  4 × factorial(3)
  factorial(3)  →  3 × factorial(2)
    factorial(2)  →  2 × factorial(1)
      factorial(1)  →  1 × factorial(0)
        factorial(0)  →  return 1  ← BASE CASE
```
 
**Returns going UP (unwinding the stack):**
 
```
        factorial(0)  returns  1
      factorial(1)  returns  1 × 1 = 1
    factorial(2)  returns  2 × 1 = 2
  factorial(3)  returns  3 × 2 = 6
factorial(4)  returns  4 × 6 = 24
```
 
---
 
## Counting Total Work
 
| Call | Work done |
|---|---|
| factorial(4) | 1 multiplication + 1 recursive call |
| factorial(3) | 1 multiplication + 1 recursive call |
| factorial(2) | 1 multiplication + 1 recursive call |
| factorial(1) | 1 multiplication + 1 recursive call |
| factorial(0) | 1 return (base case) |
| **Total calls** | **n + 1 calls** |
| **Work per call** | **O(1)** |
| **Total work** | **(n+1) × O(1) = O(n)** |
 
---
 
## Recurrence Relation
 
A formal way to express recursive complexity:
 
```
T(n) = T(n-1) + O(1)
        ↑           ↑
   recursive     work done
     call        this call
 
T(0) = O(1)  ← base case
```
 
**Expanding step by step:**
 
```
T(n) = T(n-1) + 1
     = T(n-2) + 1 + 1
     = T(n-3) + 1 + 1 + 1
     = T(0)   + n
     = 1 + n
     = O(n)
```
 
---
 
## Time & Space Complexity
 
| | Complexity | Why |
|---|---|---|
| **Time** | O(n) | n+1 function calls, each O(1) work |
| **Space** | O(n) | n+1 frames on the call stack at once |
 
> The call stack holds **all n+1 frames simultaneously** until the base case is reached — only then does it start unwinding.
 
---
 
## 3-Step Method for Recursive Analysis
 
| Step | Question | Factorial Answer |
|---|---|---|
| 1 | How many recursive calls are made? | n+1 calls |
| 2 | How much work per call (excluding recursion)? | O(1) |
| 3 | Multiply → total complexity | (n+1) × O(1) = O(n) |
 
---
 
## Key Insight — Recursion vs Loops (Space)
 
```java
// Iterative factorial — O(1) space
int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) result *= i;
    return result;
}
 
// Recursive factorial — O(n) space (call stack)
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```
 
> Unlike loops (O(1) space), recursion holds all frames in memory **at the same time**.
> Even though work per call is O(1), space is O(n) due to the call stack.
 
---