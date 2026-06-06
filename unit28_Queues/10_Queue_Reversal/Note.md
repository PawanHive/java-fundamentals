# Queue Reversal

## Problem Statement

Given a queue, reverse its elements.

---

### Example

#### Input:

    1 2 3 4 5

#### Output:

    5 4 3 2 1

---

## Idea / Approach

We use a **Stack** to reverse the order of elements in a Queue.

---

## Why Stack?

A queue follows:

    FIFO → First In First Out

A stack follows:

    LIFO → Last In First Out

So when we transfer elements:

    Queue → Stack → Queue

The order gets reversed automatically.

---

## Data Structures Used

- Queue → stores original elements
- Stack → helps reverse order

---

## Algorithm Steps

---

### Step 1: Move all elements from Queue to Stack

Remove each element from the queue and push it into the stack.

```java id="step1"
while (!q.isEmpty()) {
    s.push(q.remove());
}
```

---

### Example after Step 1

#### Input Queue:

    1 2 3 4 5

#### Stack:

    Top → 5
          4
          3
          2
          1

#### Queue:

    empty

---

### Step 2: Move all elements back to Queue

Pop elements from stack and insert back into queue.

```java 
while (!s.isEmpty()) {
    q.add(s.pop());
}
```

---

### Final Queue:

    5 4 3 2 1

---

## Dry Run

### Initial State

Queue:

    1 2 3 4 5

---

### After pushing to stack

Stack:

    5
    4
    3
    2
    1

Queue:

    empty

---

### After pushing back to queue

Queue:

    5 4 3 2 1

---

## Time Complexity

Each element is processed three times:

- Removed from queue → O(n)
- Pushed into stack → O(n)
- Popped back to queue → O(n)

### Final Complexity:

    O(n)

---

## Space Complexity

Stack stores all elements:

    O(n)

---

## Why This Works

Stack reverses order due to LIFO behavior:

### Queue (FIFO):

    1 → 2 → 3 → 4 → 5

### Stack (LIFO):

    5 → 4 → 3 → 2 → 1

So transferring through stack reverses the sequence.

---

## Edge Cases

### 1. Empty Queue

Input:

    []

Output:

    []

---

### 2. Single Element

Input:

    7

Output:

    7

---

## Key Insight

Reversal is achieved using a **two-step transformation**:

    Queue → Stack → Queue

This is the simplest and most intuitive method.

---

## Alternative Approaches

### 1. Recursion Method

- Uses call stack instead of explicit stack
- Time Complexity: O(n)
- Space Complexity: O(n)

---

### 2. In-place reversal (not possible in pure queue efficiently)

Queue does not support backward traversal, so auxiliary structures are required.

---

## Interview Tip

Be ready to explain:

- Why stack is used
- How FIFO becomes LIFO transformation
- Why two-step transfer reverses order
- Complexity analysis

---

## Key Takeaways

- Stack is used to reverse queue order
- Each element is moved twice
- Final complexity is O(n)
- Simple and widely accepted interview solution