# Implementing Stack using Deque

## Introduction

A **Stack** is a linear data structure that follows:

    LIFO → Last In First Out

We can efficiently implement a Stack using a **Deque (Double Ended Queue)**.

---

## Why Use Deque for Stack?

A Deque allows insertion and deletion from both ends in **O(1)** time.

So it naturally supports Stack operations without extra complexity.

---

## Core Idea

We use **one side of the Deque (usually rear)** as the Stack top.

So:

    Stack Top = Deque Rear

---

## Mapping of Operations

| Stack Operation | Deque Operation | Reason |
|----------------|----------------|--------|
| push() | addLast() | insert at top |
| pop() | removeLast() | remove top |
| peek() | getLast() | view top |
| isEmpty() | isEmpty() | check empty |

---

## Implementation Strategy

We treat the Deque like a dynamic container where:

- New elements go to the rear
- Removal happens from the rear

---

## Stack Operations Explained

---

## 1. push()

### Goal:
Insert element into stack.

### Logic:

Add element at the end of Deque.

```java id="push1"
deque.addLast(data);
```

### Why?

Because rear represents the stack top.

---

## 2. pop()

### Goal:
Remove top element of stack.

### Logic:

Remove element from the end of Deque.

```java id="pop1"
return deque.removeLast();
```

---

## 3. peek()

### Goal:
Return top element without removing it.

### Logic:

Access last element of Deque.

```java id="peek1"
return deque.getLast();
```

---

## 4. isEmpty()

### Logic:

Check if Deque is empty.

```java id="empty1"
return deque.isEmpty();
```

---

## Example

### Operations:

    push(1)
    push(2)
    push(3)

---

### Step-by-step:

#### After push(1)

    [1]

---

#### After push(2)

    [1, 2]

---

#### After push(3)

    [1, 2, 3]
            ↑
          top

---

### peek()

    returns 3

---

### pop()

    removes 3

Stack becomes:

    [1, 2]

---

## Time Complexity

All operations are constant time:

| Operation | Complexity |
|------------|------------|
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |
| isEmpty() | O(1) |

---

## Space Complexity

Depends on number of elements stored:

    O(n)

---

## Why This Works

Deque supports both ends, and we consistently use one end (rear) as stack top.

So it behaves exactly like a stack:

    LIFO → Last In First Out

---

## Advantages

- Very simple implementation
- No manual pointer/index management
- Efficient O(1) operations
- Cleaner than array-based stack

---

## Disadvantages

- Slight overhead of Deque abstraction
- Not needed if simple array stack is sufficient

---

## Real-World Use

Using Deque as Stack is common in:

- Expression evaluation
- Backtracking algorithms
- Undo/Redo systems
- Parsing problems

---

## Key Insight

Deque is flexible enough to act as:

- Stack (using one end)
- Queue (using both ends differently)

So it is a **universal linear data structure tool**.

---

## Interview Tip

Be ready to explain:

- Why Deque can replace Stack
- Why we use addLast/removeLast
- Why operations are O(1)
- Difference between Stack and Deque implementation

---

## Key Takeaways

- Stack follows LIFO
- Deque allows O(1) operations at both ends
- Using rear end of Deque gives stack behavior
- Clean and efficient implementation