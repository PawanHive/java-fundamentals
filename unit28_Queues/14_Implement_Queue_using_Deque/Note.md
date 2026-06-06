# Implement Queue using Deque

## Introduction

A **Queue** is a linear data structure that follows:

    FIFO → First In First Out

We can efficiently implement a Queue using a **Deque (Double Ended Queue)**.

---

## Why Use Deque for Queue?

A Deque allows insertion and deletion from both ends in **O(1)** time.

So it naturally supports Queue operations without extra complexity.

---

## Core Idea

We use:

- Rear end → for insertion (enqueue)
- Front end → for deletion (dequeue)

So:

    Front of Queue = Deque Front
    Rear of Queue  = Deque Rear

---

## Mapping of Operations

| Queue Operation | Deque Operation | Reason |
|----------------|----------------|--------|
| add() (enqueue) | addLast() | insert at rear |
| remove() (dequeue) | removeFirst() | remove from front |
| peek() | getFirst() | view front element |
| isEmpty() | isEmpty() | check empty |

---

## Implementation Strategy

We treat Deque as a ready-made double-ended structure and map Queue behavior directly onto it.

---

## Queue Operations Explained

---

## 1. add() / enqueue

### Goal:
Insert element at the rear of the queue.

### Logic:

```java id="add1"
deque.addLast(data);
```

### Why?

Because FIFO requires new elements to go at the end.

---

## 2. remove() / dequeue

### Goal:
Remove element from the front of the queue.

### Logic:

```java id="remove1"
return deque.removeFirst();
```

### Why?

Because the oldest element must be removed first.

---

## 3. peek()

### Goal:
View the front element without removing it.

### Logic:

```java id="peek1"
return deque.getFirst();
```

---

## 4. isEmpty()

### Logic:

Check if deque is empty.

```java id="empty1"
return deque.isEmpty();
```

---

## Example

### Operations:

    add(1)
    add(2)
    add(3)

---

### Step-by-step:

#### After add(1)

    [1]

---

#### After add(2)

    [1, 2]

---

#### After add(3)

    [1, 2, 3]

---

### Queue view:

    Front → 1 → 2 → 3 → Rear

---

### peek()

    returns 1

---

### remove()

    removes 1

Queue becomes:

    [2, 3]

---

## Time Complexity

All operations are constant time:

| Operation | Complexity |
|------------|------------|
| add() | O(1) |
| remove() | O(1) |
| peek() | O(1) |
| isEmpty() | O(1) |

---

## Space Complexity

Depends on number of elements stored:

    O(n)

---

## Why This Works

Deque provides direct access to both ends:

- Rear → insertion
- Front → deletion

So it naturally matches Queue behavior (FIFO).

---

## Advantages

- Simple implementation
- No manual pointer/index handling
- Efficient O(1) operations
- Clean and production-ready approach

---

## Disadvantages

- Slight abstraction overhead
- Not required for very basic implementations
- Requires understanding of Deque internals

---

## Real-World Use Cases

- Task scheduling
- Print queue systems
- Breadth First Search (BFS)
- Buffer management

---

## Key Insight

Deque acts as a **universal linear structure**:

| Structure | Mapping |
|------------|--------|
| Stack | one end (LIFO) |
| Queue | front + rear (FIFO) |

So Queue using Deque is the most natural implementation.

---

## Interview Tip

Be ready to explain:

- Why addLast and removeFirst are used
- How FIFO is preserved
- Why Deque is better than LinkedList directly
- Time complexity of operations

---

## Key Takeaways

- Queue follows FIFO order
- Deque supports O(1) operations at both ends
- addLast → enqueue
- removeFirst → dequeue
- getFirst → peek
- Clean and efficient implementation