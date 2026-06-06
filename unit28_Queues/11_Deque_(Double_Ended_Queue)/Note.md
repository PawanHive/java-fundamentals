# Deque (Double Ended Queue)

## Introduction

A **Deque (Double Ended Queue)** is a linear data structure that allows insertion and deletion of elements from **both the front and rear ends**.

It combines the features of:
- Stack (LIFO behavior)
- Queue (FIFO behavior)

---

## Definition

A Deque supports operations at both ends:

    Front ← → Rear

You can:
- Insert at front
- Insert at rear
- Delete from front
- Delete from rear

---

## Basic Operations

### Insertion Operations

- `addFirst()` → insert at front
- `addLast()` → insert at rear

---

### Deletion Operations

- `removeFirst()` → delete from front
- `removeLast()` → delete from rear

---

### Access Operations

- `getFirst()` → view front element
- `getLast()` → view rear element

---

## Example

### Step-by-step operations:

Start:

    []

---

### addFirst(1)

    [1]

---

### addFirst(2)

    [2, 1]

---

### addLast(3)

    [2, 1, 3]

---

### addLast(4)

    [2, 1, 3, 4]

---

### removeFirst()

Removes 2

    [1, 3, 4]

---

### removeLast()

Removes 4

    [1, 3]

---

### getFirst()

Returns:

    1

---

### getLast()

Returns:

    3

---

## Final State

    [1, 3]

---

## Time Complexity

In Java implementation using `LinkedList`:

| Operation | Complexity |
|------------|------------|
| addFirst() | O(1) |
| addLast() | O(1) |
| removeFirst() | O(1) |
| removeLast() | O(1) |
| getFirst() | O(1) |
| getLast() | O(1) |

---

## Why Deque is Powerful

Deque is more flexible than both Stack and Queue.

It can behave like:

---

### 1. Queue (FIFO)

    addLast()
    removeFirst()

Example:

    1 → 2 → 3 → 4

---

### 2. Stack (LIFO)

    addLast()
    removeLast()

Example:

    1 → 2 → 3 → 4
                ↑
              top

---

## Internal Working (Java)

In Java:

```java
Deque<Integer> deque = new LinkedList<>();
```

- Uses **doubly linked list internally**
- Each node has:
  - data
  - next pointer
  - previous pointer

So both ends are directly accessible.

---

## Advantages

- Flexible operations at both ends
- Can act as Stack or Queue
- Efficient O(1) operations
- Useful in sliding window problems

---

## Disadvantages

- Slightly more memory overhead (due to pointers)
- More complex than simple queue/stack
- Not always needed for simple problems

---

## Real-Life Analogy

A Deque is like a **line where people can enter or exit from both ends**.

Example:

- VIP entry from front
- Normal entry from back
- Exit allowed from both sides

---

## Common Use Cases

- Sliding window problems
- Palindrome checking
- Browser history (back/forward)
- Undo/redo operations
- LRU Cache (conceptually uses deque-like behavior)

---

## Key Insight

Deque is a **generalized form of Stack and Queue**:

| Structure | Restriction |
|------------|------------|
| Stack | Insert & remove from one side |
| Queue | Insert rear, remove front |
| Deque | Insert & remove from both sides |

---

## Key Takeaways

- Deque means Double Ended Queue
- Supports operations at both front and rear
- Can behave like Stack or Queue
- All operations are O(1) in Java LinkedList implementation
- Highly useful in advanced DSA problems