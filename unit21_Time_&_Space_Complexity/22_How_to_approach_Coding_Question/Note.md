# How to Approach Coding Questions

# The 7-Step Framework

---

# Step 1 — Read & Understand the Problem

Read the problem at least twice.

Understand:
- what is given (input)
- what is required (output)

Do NOT rush to code.

Most mistakes happen because people misread the problem statement.

---

# Step 2 — Work Through Examples by Hand

Take the sample input and manually solve it on paper.

This helps reveal:
- hidden patterns
- observations
- edge cases

Example:

```text
Input: [1, 2, 3]
Output: ?
```

Manual tracing often makes the solution obvious.

---

# Step 3 — Identify Constraints & Edge Cases

Always check:
- range of `n`
- can input be `0`?
- can numbers be negative?
- can array be empty?
- is array sorted?

These questions prevent wrong assumptions.

---

# Step 4 — Think of Brute Force First

Always start with the simplest correct solution.

Even if complexity is:

O(n²) or O(n³)

A working brute force solution is better than no solution.

---

# Step 5 — Optimize Using Constraints

Use constraints to decide required complexity.

Then choose suitable techniques:
- sorting
- binary search
- hashing
- sliding window
- two pointers
- dynamic programming

---

# Step 6 — Code the Solution Cleanly

Write:
- readable code
- meaningful variable names
- proper conditions

Handle edge cases carefully.

Do NOT over-engineer.

Simple and correct > complicated and buggy.

---

# Step 7 — Test & Dry Run Your Code

First test:
- sample inputs

Then test edge cases:
- empty input
- `n = 1`
- all elements same
- negative numbers
- already sorted arrays

---

# Step 5 Cheat Sheet — n's Range Tells Required Complexity

This is one of the most important tricks in competitive programming.

| n Range | Acceptable Complexity | Think About |
|---|---|---|
| `n ≤ 10` | `O(n!)` or `O(2^n)` | brute force, permutations |
| `n ≤ 20` | `O(2^n)` | recursion, bitmask |
| `n ≤ 100` | `O(n^3)` | triple nested loops |
| `n ≤ 1,000` | `O(n^2)` | nested loops |
| `n ≤ 100,000` | `O(n log n)` | sorting, binary search |
| `n ≤ 1,000,000` | `O(n)` | HashMap, two pointers |
| `n ≤ 10^18` | `O(log n)` | binary search, math |

---

# Common Patterns to Recognize

| If You See... | Think About... |
|---|---|
| Sorted array + search | Binary Search |
| Find duplicates/frequency | HashMap |
| Subarray sum/window | Sliding Window |
| Two indices moving inward | Two Pointers |
| Overlapping subproblems | Dynamic Programming |
| All combinations/subsets | Recursion + Backtracking |
| Shortest path in graph | BFS |

---

# Common Mistakes to Avoid

| Mistake | Better Approach |
|---|---|
| Jump straight to coding | Spend time thinking first |
| Ignore edge cases | Test special inputs |
| Overcomplicate solution | Keep it simple |
| Ignore complexity | Estimate complexity first |
| Give up early | Build brute force first |

---

# Time Split for a 30-Min Interview Problem

| Phase | Time |
|---|---|
| Read + understand + examples | 5 min |
| Think brute force + optimize | 8 min |
| Code solution | 12 min |
| Test + fix bugs | 5 min |

---

# Most Important Habit

```text
Think before you type.
```

Interviewers care more about:
- your thought process
- structured reasoning
- communication

than writing perfect code immediately.

---

# Ideal Problem Solving Flow

```text
Problem
   ↓
Observation
   ↓
Pattern
   ↓
Algorithm
   ↓
Code
   ↓
Dry Run
   ↓
Optimization
```