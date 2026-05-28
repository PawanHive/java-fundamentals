# Types of Backtracking

There are 3 main types of backtracking problems.

---

# Type 1 — Decision Backtracking

## Question Asked

```text
Does a solution exist?
Yes or No
```


In this type:
- You are NOT finding all solutions
- You only check whether at least one valid solution exists

As soon as you find one valid solution:
```text
Stop recursion immediately
```

## Examples

- Can N-Queens be placed on this board?
- Can this maze be solved?
- Is there any valid Sudoku solution?

---

# Type 2 — Optimization Backtracking

## Question Asked

```text
What is the best possible solution?
```

You explore all valid paths and keep track of:
- Minimum cost
- Maximum value
- Shortest path
- Best answer


## Examples

- Find shortest path in a maze
- Minimum subset sum difference
- Maximum score possible
- Least cost arrangement

---

# Type 3 — Enumeration Backtracking

## Question Asked

```text
Find ALL possible solutions
```

In this type:
- You NEVER stop early
- You explore every possible path
- You either:
  - Print solutions
  - Store solutions
  - Count solutions


## Examples

- Print all permutations
- Find all subsets
- Count all N-Queens arrangements
- Generate all valid parentheses

---

# Quick Summary

| Type | Goal | Stops Early? |
|---|---|---|
| Decision | Check if solution exists | ✅ Yes |
| Optimization | Find best solution | ❌ No |
| Enumeration | Find all solutions | ❌ No |

---

# Core Backtracking Pattern

Every backtracking problem follows:

```java
make choice
recurse
undo choice
```

This is the foundation of all backtracking problems.

```