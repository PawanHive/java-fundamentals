# Queue using Arrays

## Introduction

A Queue is a linear data structure that follows the **FIFO (First In, First Out)** principle.

    First Element Inserted  →  First Element Removed

In an Array-based Queue, elements are stored inside an array and are accessed using the **rear** index.

---

# Queue Representation

For a Queue of size 5:
```
    Index:  0    1    2    3    4
           ---  ---  ---  ---  ---
    Array: [ ]  [ ]  [ ]  [ ]  [ ]
```
Initially:

    rear = -1

A value of `-1` indicates that the Queue is empty.

---

# Variables Used

## Array

Stores the Queue elements.

    int arr[];

Example:

    arr = [1, 2, 3, _, _]

---

## Size

Stores the maximum capacity of the Queue.

    int size;

Example:

    size = 5

---

## Rear

Tracks the last inserted element.

    int rear;

Initially:

    rear = -1

---

# Queue Operations

## 1. isEmpty()

Checks whether the Queue contains any element.

### Condition

    rear == -1

### Implementation

    public static boolean isEmpty() {
        return rear == -1;
    }

### Time Complexity

    O(1)

Because only one comparison is performed.

---

## 2. add() (Enqueue)

Used to insert an element at the rear of the Queue.

### Step 1: Check if Queue is Full

    rear == size - 1

If true:

    Queue is full

---

### Step 2: Move Rear Forward

    rear++;

---

### Step 3: Insert Element

    arr[rear] = data;

---

### Example

Insert 10:

    rear = 0

    [10][ ][ ][ ][ ]

Insert 20:

    rear = 1

    [10][20][ ][ ][ ]

Insert 30:

    rear = 2

    [10][20][30][ ][ ]

---

### Implementation
```java 
    public static void add(int data) {
        if(rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] = data;
    }
```
---

### Time Complexity

    O(1)

Because insertion occurs directly at the rear.

---

## 3. remove() (Dequeue)

Used to remove the front element from the Queue.

Since the front element is always at index 0, after removing it we must shift all remaining elements one position toward the front.

This shifting operation is the major drawback of Array-based Queues.

---

### Example

Queue:

    [10][20][30]

Remove 10:

Step 1:

    front = arr[0]

    front = 10

Step 2: Shift Elements

    arr[0] = arr[1]
    arr[1] = arr[2]

Result:

    [20][30][30]

Step 3: Decrease Rear

    rear--

Result:

    Queue = [20][30]

---

### Visualization

Before Removal:

    Front
      ↓
    [10][20][30]
              ↑
            Rear

After Removal:

    Front
      ↓
    [20][30]
          ↑
        Rear

---

### Implementation
```java 
    public static int remove() {

        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        int front = arr[0];

        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;

        return front;
    }
```
---

### Time Complexity

    O(n)

Reason:

All elements must be shifted one position.

---

## 4. peek()

Returns the front element without removing it.

Since the front is always stored at index 0:

    arr[0]

---

### Example

Queue:

    [10][20][30]

peek()

Returns:

    10

Queue remains unchanged.

---

### Implementation
```java
    public static int peek() {

        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return arr[0];
    }
```
---

### Time Complexity

    O(1)

Because we directly access index 0.

---

# Complete Example

Operations:

    add(1)
    add(2)
    add(3)

Queue:

    Front
      ↓
    [1][2][3]
            ↑
          Rear

---

peek()

Returns:

    1

Queue:

    [1][2][3]

---

remove()

Removes:

    1

Queue:

    [2][3]

---

remove()

Removes:

    2

Queue:

    [3]

---

remove()

Removes:

    3

Queue becomes:

    Empty

    rear = -1

---

# Dry Run of Program

Code:

    q.add(1);
    q.add(2);
    q.add(3);

Queue:

    [1][2][3]

Loop:
```java 
    while(!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }
```
Iteration 1:

    peek() → 1
    remove() → 1

Queue:

    [2][3]

Iteration 2:

    peek() → 2
    remove() → 2

Queue:

    [3]

Iteration 3:

    peek() → 3
    remove() → 3

Queue:

    Empty

Output:

    1
    2
    3

---

# Time Complexity Summary

| Operation | Time Complexity |
|------------|----------------|
| isEmpty() | O(1) |
| add() | O(1) |
| remove() | O(n) |
| peek() | O(1) |

---

# Drawback of Queue using Arrays

The biggest problem occurs during removal.

Example:

    [10][20][30][40][50]

Remove 10:

    [20][30][40][50]

All elements must be shifted.

For every dequeue operation:

    O(n)

time is required.

This makes the Queue inefficient when many remove operations are performed.

---

# Solution to the Drawback

To avoid shifting elements after every removal, we use:

## Circular Queue

In a Circular Queue:

- No shifting is required.
- Space is reused efficiently.
- add() becomes O(1).
- remove() becomes O(1).

This is why Circular Queue is considered an improvement over the simple Array-based Queue.

---

# Key Takeaways

- Queue follows FIFO (First In, First Out).
- Array-based Queue stores elements in an array.
- rear tracks the last inserted element.
- Front element always remains at index 0.
- add() inserts at rear.
- remove() deletes from front and shifts remaining elements.
- peek() returns the front element.
- The major drawback is O(n) removal due to shifting.
- Circular Queue solves this drawback efficiently.