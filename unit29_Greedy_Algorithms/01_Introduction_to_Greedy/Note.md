#  Introduction to Greedy Algorithm

**Definition:**
Greedy algorithms is the problem solving techniqe where we make the **locally optimum choice at each stage** & hope to achieve a global optimum.

## Pros
- Simple & Easy
- Good enough Time Complexity

## Cons
- A lot of time, global optimum is not achieved.

# --------------------------------------------------------------------------------------------------

# Greedy Algorithms

## What is a Greedy Algorithm?

A **Greedy Algorithm** is an algorithmic technique that makes the **best possible choice at the current moment** without worrying about future consequences.

The idea is:

> At every step, choose the option that looks best right now.

The algorithm hopes that these locally optimal choices will lead to a globally optimal solution.

---

# Real-Life Example

Imagine you need ₹590 and have the following Indian coins:

```text
500, 200, 100, 50, 20, 10, 5, 2, 1
```

A greedy approach would be:

```text
590

Take 500  → Remaining = 90
Take 50   → Remaining = 40
Take 20   → Remaining = 20
Take 20   → Remaining = 0
```

Answer:

```text
500 + 50 + 20 + 20 = 590
```

At every step, we picked the **largest possible coin**.

---

# Core Idea

A Greedy Algorithm follows this strategy:

```text
1. Find the best available choice.
2. Make that choice immediately.
3. Never reconsider it.
4. Repeat until the problem is solved.
```

Unlike some other approaches, once a decision is made, it is usually **not changed later**.

---

# Why is it Called "Greedy"?

Because the algorithm always grabs the most attractive option available at the moment.

Think of a child picking chocolates:

```text
See biggest chocolate
↓
Take it immediately
↓
Repeat
```

The child doesn't think about future chocolates.

Similarly, a Greedy Algorithm focuses only on the current best choice.

# Characteristics of Greedy Algorithms

A problem can usually be solved using Greedy if it has the following properties:

## 1. Greedy Choice Property

Making a local optimal choice should lead toward the global optimal solution.

### Examples

- Activity Selection
- Fractional Knapsack
- Indian Coins

---

## 2. Optimal Substructure

After solving one part of the problem, the remaining problem should still be solvable optimally.

### Example

```text
Select one activity
↓
Remaining activities form a smaller version
of the same problem
```

---

# Advantages of Greedy Algorithms

## Fast

Most greedy algorithms involve sorting.

Typical Time Complexity:

```text
O(n log n)
```

---

## Easy to Implement

General Pattern:

```text
Sort
↓
Traverse
↓
Choose best option
```

---

## Memory Efficient

Most greedy algorithms require:

```text
O(1) or O(n)
```

extra space.

---

# Disadvantages of Greedy Algorithms

Greedy algorithms do **not always work**.

Sometimes the best current choice leads to a bad final answer.

- sometime it don't feel you are using greedy approach

---

## Example Where Greedy Fails

### Coin System

```text
Coins = {1, 3, 4}
Amount = 6
```

### Greedy Solution

```text
Take 4
Remaining = 2

Take 1
Remaining = 1

Take 1
```

Total Coins Used:

```text
3 coins
```

### Optimal Solution

```text
3 + 3 = 6
```

Total Coins Used:

```text
2 coins
```

### Conclusion

Greedy fails because choosing the largest coin first does not produce the minimum number of coins.

---

# Greedy vs Dynamic Programming

| Greedy | Dynamic Programming |
|----------|----------|
| Takes best choice immediately | Explores multiple possibilities |
| Doesn't reconsider decisions | Stores and reuses results |
| Faster | Usually slower |
| Less memory usage | More memory usage |
| Doesn't always give optimal answer | Gives optimal answer when applicable |

---

# Common Greedy Problems

1. Activity Selection
2. Fractional Knapsack
3. Job Sequencing
4. Huffman Coding
5. Minimum Spanning Tree (Prim's & Kruskal's)
6. Dijkstra's Shortest Path Algorithm
7. Chocola Problem
8. Indian Coins Problem
9. Maximum Length Chain of Pairs

---

# How to Recognize a Greedy Problem

Ask yourself:

- Can I make a choice now without revisiting it later?
- Does the current best choice seem to help achieve the final answer?
- After making a choice, does the remaining problem look similar?

If the answer is mostly **Yes**, then a Greedy approach may work.

---

# Greedy Algorithm Template

```text
1. Sort the data (if required).
2. Pick the best available option.
3. Add it to the solution.
4. Move to the next valid choice.
5. Repeat until the problem is solved.
```

---

# Key Takeaways

- Greedy algorithms make the best local choice at every step.
- Decisions are usually never changed once made.
- They are fast, simple, and memory efficient.
- They do not always guarantee the optimal solution.
- A greedy solution works only when the problem satisfies:
  - Greedy Choice Property
  - Optimal Substructure

---

# One-Line Definition

> A Greedy Algorithm is an approach that builds a solution step-by-step by always choosing the best available option at the current moment, hoping to achieve the overall optimal solution.