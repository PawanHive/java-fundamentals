# Queue using Two Stacks

## Introduction

A **Queue using Two Stacks** is a classic DSA problem where we implement the behavior of a Queue (FIFO) using two Stacks (LIFO).

This is a frequently asked interview question in companies like:

- Amazon
- Google
- Microsoft

---

## Core Idea

A Queue follows:

    FIFO (First In, First Out)

But a Stack follows:

    LIFO (Last In, First Out)

So we use **two stacks** to reverse the order and simulate FIFO behavior.

---

## Two Approaches

There are two ways to implement Queue using Two Stacks:

| Approach | Costly Operation | Complexity |
|----------|-----------------|------------|
| Approach 1 | add() | O(n) |
| Approach 2 | remove() | O(n) |

In this implementation, we use:

    👉 Approach 1 (Costly add)

---

## Data Structures Used

We use two stacks:

    s1 → Main Stack (stores queue elements in correct order)
    s2 → Temporary Stack (used for reversing)

---

## Key Idea

We maintain this invariant:

    Top of s1 = Front of Queue

So:

- pop from s1 → dequeue operation
- peek from s1 → front element

---

## add() Operation (Enqueue)

### Goal:
Insert element at the rear of the queue.

---

### Steps:

1. Move all elements from s1 → s2
2. Push new element into s1
3. Move all elements back from s2 → s1

---

### Visualization

Initial:

    s1: [1, 2, 3]
    s2: []

Add 4:

Step 1: Move s1 → s2

    s2: [3, 2, 1]
    s1: []

Step 2: Push 4 into s1

    s1: [4]

Step 3: Move back s2 → s1

    s1: [4, 1, 2, 3]

---

### Code Logic
```java
    while(!s1.isEmpty()) {
        s2.push(s1.pop());
    }

    s1.push(data);

    while(!s2.isEmpty()) {
        s1.push(s2.pop());
    }
```
---

### Time Complexity

    O(n)

Because all elements are moved twice.

---

## remove() Operation (Dequeue)

### Goal:
Remove element from the front of the queue.

---

### Logic:

Since order is maintained in s1:

    return s1.pop();

---

### Example:

    s1: [4, 1, 2, 3]

remove() → returns:

    1 (front element of queue)

---

### Time Complexity

    O(1)

---

## peek() Operation

### Goal:
Return front element without removing it.

---

### Logic:

    return s1.peek();

---

### Time Complexity

    O(1)

---

## isEmpty() Operation

### Logic:

Queue is empty if s1 has no elements.

    return s1.isEmpty();

---

### Time Complexity

    O(1)

---

## Example Flow

Operations:

    add(1)
    add(2)
    add(3)

Queue state:

    Front → 1 → 2 → 3 → Rear

Stack representation:

    s1 = [3, 2, 1]

---

Now operations:

### peek()

    returns 1

---

### remove()

    removes 1

Queue becomes:

    2 → 3

---

## Time Complexity Summary

| Operation | Complexity |
|----------|------------|
| add() | O(n) |
| remove() | O(1) |
| peek() | O(1) |
| isEmpty() | O(1) |

---

## Why This Works

Stacks reverse order:

Example:

    Push: 1, 2, 3

Stack:

    Top → 3 → 2 → 1

By transferring elements between two stacks, we restore FIFO order.

---

## Key Insight

We use:

- Stack 1 → Maintains queue order
- Stack 2 → Helps reverse elements during insertion

So we simulate a queue using stack behavior.

---

## Advantages

- Easy to implement
- Great interview question
- Demonstrates understanding of stack/queue relationship

---

## Disadvantages

- add() is expensive (O(n))
- Not as efficient as circular queue or linked list queue

---

## Interview Tip

Be ready to explain:

- Why two stacks are needed
- How FIFO is maintained using LIFO structures
- Trade-off between add and remove operations