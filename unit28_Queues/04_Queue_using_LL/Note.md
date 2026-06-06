# Queue using Linked List

## Introduction

A **Queue using Linked List** is an implementation of Queue where elements are stored in nodes connected through pointers.

Like every Queue, it follows the **FIFO (First In, First Out)** principle.

    First Element Inserted  →  First Element Removed

Unlike an Array-based Queue:

- No shifting of elements is required.
- No fixed size limitation exists.
- Memory is allocated dynamically.
- Both insertion and deletion work in O(1) time.

Because of these advantages, Queue using Linked List is commonly asked in coding interviews.

---

# Why Use Linked List?

In a simple Array Queue:

    add()    = O(1)
    remove() = O(n)

because every removal requires shifting elements.

Example:

    [10][20][30][40]

Remove 10:

    [20][30][40]

All remaining elements must be shifted.

This takes:

    O(n)

time.

---

## Linked List Solution

Instead of shifting elements, we simply move pointers.

Example:

    head
      ↓
    [10] → [20] → [30]
                     ↑
                    tail

After removing 10:

    head
      ↓
    [20] → [30]
             ↑
            tail

No shifting occurs.

Therefore:

    remove() = O(1)

---

# Node Structure

Each node contains:

1. Data
2. Pointer to next node

Structure:

    [ Data | Next ]

Example:

    [1|•] → [2|•] → [3|null]

---

## Node Class

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

---

# Queue Representation

To efficiently perform Queue operations, we maintain:

    head
    tail

---

## Head

Points to the first node.

Front element of Queue.

Example:

    head
      ↓
    [10] → [20] → [30]

---

## Tail

Points to the last node.

Used for insertion.

Example:

    [10] → [20] → [30]
                     ↑
                    tail

---

# Initial State

Initially:

    head = null
    tail = null

Queue:

    Empty

---

# Time Complexities

| Operation | Time Complexity |
|------------|------------|
| isEmpty() | O(1) |
| add() | O(1) |
| remove() | O(1) |
| peek() | O(1) |

This is one of the biggest advantages of Linked List Queue.

---

# isEmpty()

Checks whether Queue contains any nodes.

Condition:

    head == null && tail == null

Implementation:

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

Time Complexity:

    O(1)

---

# add() (Enqueue)

Adds a new node at the rear (tail) of the Queue.

---

## Step 1: Create New Node

    Node newNode = new Node(data);

Example:

    [5|null]

---

## Step 2: Empty Queue Case

If Queue is empty:

    head = tail = newNode

Example:

Before:

    Empty

After:

    head
      ↓
    [5|null]
      ↑
    tail

---

## Step 3: Queue Already Contains Nodes

Attach new node after tail.

    tail.next = newNode;

Move tail forward.

    tail = newNode;

---

### Example

Before:

    head
      ↓
    [1] → [2]
             ↑
            tail

Add 3:

    head
      ↓
    [1] → [2] → [3]
                    ↑
                   tail

---

## Implementation

    public static void add(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

---

## Time Complexity

    O(1)

Because insertion occurs directly using tail.

---

# remove() (Dequeue)

Removes the front element from the Queue.

Since front is always at head:

    Remove head node

---

## Step 1: Check Empty Queue

    if(isEmpty())

Queue contains no nodes.

---

## Step 2: Store Front Value

    int front = head.data;

This value will be returned.

---

## Step 3: Single Node Case

If:

    head == tail

Queue contains only one node.

Example:

    head
      ↓
    [5]
      ↑
    tail

After removal:

    head = null
    tail = null

Queue becomes empty.

---

## Step 4: Multiple Nodes Case

Move head to next node.

    head = head.next;

Example:

Before:

    head
      ↓
    [1] → [2] → [3]
                    ↑
                   tail

After remove():

    head
      ↓
    [2] → [3]
             ↑
            tail

Node containing 1 automatically becomes unreachable and is removed by Java's Garbage Collector.

---

## Implementation

    public static int remove() {

        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        int front = head.data;

        if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        return front;
    }

---

## Time Complexity

    O(1)

No shifting required.

Only pointer movement occurs.

---

# peek()

Returns the front element without removing it.

Front element is always stored at:

    head

Therefore:

    return head.data;

---

## Example

Queue:

    head
      ↓
    [10] → [20] → [30]

peek()

Returns:

    10

Queue remains unchanged.

---

## Implementation

    public static int peek() {

        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return head.data;
    }

---

## Time Complexity

    O(1)

---

# Complete Example

Operations:

    add(1)
    add(2)
    add(3)

Queue:

    head
      ↓
    [1] → [2] → [3]
                    ↑
                   tail

---

peek()

Returns:

    1

Queue unchanged.

---

remove()

Returns:

    1

Queue:

    head
      ↓
    [2] → [3]
             ↑
            tail

---

remove()

Returns:

    2

Queue:

    head
      ↓
    [3]
      ↑
    tail

---

remove()

Returns:

    3

Queue:

    Empty

    head = null
    tail = null

---

# Dry Run of Program

Code:

    q.add(1);
    q.add(2);
    q.add(3);

Queue:

    head
      ↓
    [1] → [2] → [3]
                    ↑
                   tail

Loop:

    while(!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }

Iteration 1:

    peek()   → 1
    remove() → 1

Queue:

    [2] → [3]

---

Iteration 2:

    peek()   → 2
    remove() → 2

Queue:

    [3]

---

Iteration 3:

    peek()   → 3
    remove() → 3

Queue:

    Empty

Output:

    1
    2
    3

---

# Comparison with Other Queue Implementations

| Feature | Array Queue | Circular Queue | Linked List Queue |
|----------|----------|----------|----------|
| add() | O(1) | O(1) | O(1) |
| remove() | O(n) | O(1) | O(1) |
| peek() | O(1) | O(1) | O(1) |
| Dynamic Size | ❌ | ❌ | ✅ |
| Shifting Required | ✅ | ❌ | ❌ |
| Memory Usage | Fixed | Fixed | Dynamic |

---

# Advantages of Linked List Queue

- Dynamic memory allocation.
- No fixed size limitation.
- No element shifting.
- O(1) insertion.
- O(1) deletion.
- Efficient for large queues.

---

# Drawbacks

- Extra memory required for pointers.
- More complex than Array implementation.
- Nodes are not stored in contiguous memory.

---

# Key Takeaways

- Queue using Linked List follows FIFO (First In, First Out).
- head represents the front of the Queue.
- tail represents the rear of the Queue.
- add() inserts at tail.
- remove() removes from head.
- No shifting of elements is required.
- Both add() and remove() run in O(1) time.
- Queue size can grow dynamically.
- Linked List Queue is one of the most efficient Queue implementations.