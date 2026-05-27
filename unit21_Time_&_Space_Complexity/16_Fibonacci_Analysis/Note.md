
# Fibonacci Analysis — Recursive (Java)
 
---
 
## What Makes Fibonacci Different?
 
For the first time, **each call makes TWO recursive calls** instead of one. This changes everything.
 
```java
int fib(int n) {
    if (n == 0) return 0;               // base case 1
    if (n == 1) return 1;               // base case 2
    return fib(n - 1) + fib(n - 2);    // two recursive calls!
}
```
 
---
 
## Recursion Tree — fib(5)
 
Each node spawns 2 children → tree doubles at every level:
 
```
                    fib(5)
                /          \
           fib(4)           fib(3)
          /      \          /     \
       fib(3)  fib(2)   fib(2)  fib(1)
       /    \    /   \
   fib(2) fib(1) fib(1) fib(0)
   /    \
fib(1) fib(0)
```
 
---
 
## Nodes Per Level — The Doubling Pattern
 
| Level | Nodes | Pattern |
|---|---|---|
| 0 | 1 | 2⁰ = 1 |
| 1 | 2 | 2¹ = 2 |
| 2 | 4 | 2² = 4 |
| 3 | 8 | 2³ = 8 |
| ... | ... | ... |
| n | 2ⁿ | 2ⁿ |
| **Total** | **2⁰+2¹+...+2ⁿ = 2ⁿ⁺¹ - 1 ≈ 2ⁿ** | |
 
---
 
## Recurrence Relation
 
```
T(n) = T(n-1) + T(n-2) + O(1)
        ↑          ↑        ↑
     fib(n-1)  fib(n-2)  addition
 
T(0) = T(1) = O(1)  ← base cases
 
Upper bound (T(n-2) ≤ T(n-1)):
T(n) ≤ 2 × T(n-1) + O(1)
     ≈ O(2ⁿ)
```
 
> Two recursive calls instead of one → tree doubles every level → **O(2ⁿ)**
 
---
 
## Time & Space Complexity
 
| | Complexity | Why |
|---|---|---|
| **Time** | O(2ⁿ) | Tree doubles every level → 2ⁿ total nodes |
| **Space** | O(n) | Max depth of call stack at any point = n |
 
> **Space is O(n) not O(2ⁿ)!** The call stack only holds the current active path from root to leaf — not all nodes at once. At any moment, only n frames exist on the stack.
 
---
 
## Key Difference from Factorial & Sum
 
| | Factorial / Sum | Fibonacci |
|---|---|---|
| Calls per level | 1 | 2 |
| Tree shape | Linear chain | Binary tree |
| Total nodes | n | 2ⁿ |
| Time | O(n) | O(2ⁿ) |
| Space | O(n) | O(n) |
 
---
 
## Why O(2ⁿ) is Dangerous
 
| n | O(n) calls — Factorial | O(2ⁿ) calls — Fibonacci |
|---|---|---|
| 10 | 10 | 1,024 |
| 20 | 20 | 1,048,576 |
| 30 | 30 | 1,073,741,824 |
| 50 | 50 | 1,125,899,906,842,624 |
 
