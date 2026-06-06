# Stack using Two Queues

## Introduction

A **Stack using Two Queues** is a classic DSA problem where we implement **LIFO (Last In First Out)** behavior using **FIFO (First In First Out)** data structures.

This is frequently asked in interviews at companies like:

- Amazon
- Google
- Microsoft

---

## Core Idea

A Stack follows:

    LIFO → Last In First Out

But a Queue follows:

    FIFO → First In First Out

So we use **two queues** to simulate stack behavior by controlling order of elements.

---

## Two Approaches

There are two standard ways to implement Stack using Two Queues:

| Approach | Costly Operation | Complexity |
|----------|------------------|------------|
| Approach 1 | push() | O(n) |
| Approach 2 | pop() | O(n) |

In this explanation, we use:

    👉 Pop-costly approach (your code idea)

---

## Data Structures Used

We use two queues:

    q1 → main queue
    q2 → helper queue

At any time:
- Only one queue contains all elements
- The other is empty

---

## Key Idea

We maintain stack behavior by ensuring:

    Front of active queue = Top of Stack

So:
- pop() → removes last inserted element
- peek() → returns last inserted element

---

# push() Operation

## Goal:
Insert element into stack.

---

## Logic (Pop-costly approach)

We simply:

    Add element into q1

or if q1 is not active, use q2 (less common variant)

But standard approach:

    push = O(1)

---

## Visualization

Push 1, 2, 3:

    q1: [1, 2, 3]
         front → 1
         rear  → 3

---

## Code Logic

    q1.add(data);

---

## Time Complexity

    O(1)

---

# pop() Operation

## Goal:
Remove the top element of stack (LIFO).

---

## Idea

To get last inserted element:
1. Move elements from q1 → q2 except last one
2. Last element is the stack top
3. Remove it
4. Swap q1 and q2

---

## Step-by-Step Example

Initial:

    q1: [1, 2, 3]
         front → 1

Stack top should be:

    3

---

### Step 1: Move elements except last

Move:

    1 → q2
    2 → q2

Now:

    q1: [3]
    q2: [1, 2]

---

### Step 2: Remove last element

    pop → 3

---

### Step 3: Swap queues

    q1 ← q2
    q2 ← empty

Now:

    q1: [1, 2]

---

## Code Logic

    while(q1.size() > 1) {
        q2.add(q1.remove());
    }

    int top = q1.remove();

    swap(q1, q2);

    return top;

---

## Time Complexity

    O(n)

Because all elements except one are moved.

---

# peek() Operation

## Goal:
Return top element without removing it.

---

## Logic

Same as pop, but we do not permanently remove last element.

---

## Steps

1. Move elements except last
2. Store last element
3. Put it into q2 (so structure remains intact)
4. Swap queues
5. Return value

---

## Code Logic

    while(q1.size() > 1) {
        q2.add(q1.remove());
    }

    int top = q1.peek();
    q2.add(q1.remove());

    swap(q1, q2);

    return top;

---

## Time Complexity

    O(n)

---

# isEmpty() Operation

## Logic:

Stack is empty if both queues are empty.

    return q1.isEmpty() && q2.isEmpty();

---

## Time Complexity

    O(1)

---

# Example Flow

Operations:

    push(1)
    push(2)
    push(3)

Stack:

    Top → 3 → 2 → 1

---

## pop()

Returns:

    3

Stack becomes:

    2 → 1

---

## pop()

Returns:

    2

Stack becomes:

    1

---

## pop()

Returns:

    1

Stack becomes:

    empty

---

# Time Complexity Summary

| Operation | Complexity |
|----------|------------|
| push() | O(1) |
| pop() | O(n) |
| peek() | O(n) |
| isEmpty() | O(1) |

---

# Why This Works

Queues follow FIFO:

    1 → 2 → 3

But stack needs LIFO:

    3 → 2 → 1

So we:
- Use queue shifting
- Extract last inserted element
- Reverse order indirectly

---

# Key Insight

We simulate stack behavior by:

    Moving n-1 elements to helper queue

So the last inserted element becomes accessible.

---

# Advantages

- Good interview question
- Helps understand stack-queue relationship
- Strengthens pointer/data structure manipulation

---

# Disadvantages

- pop() is expensive (O(n))
- peek() is also O(n)
- Less efficient than real stack implementation

---

# Interview Tip

Be ready to explain:

- Why two queues are needed
- Why we move elements
- How FIFO is converted to LIFO
- Tradeoff between push-costly and pop-costly approaches