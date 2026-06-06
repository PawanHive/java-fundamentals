# Circular Queue using Arrays

## Introduction

A **Circular Queue** is an improved version of a normal Queue implemented using Arrays.

In a simple Array Queue, when an element is removed, all remaining elements must be shifted one position forward.

Example:

    [10][20][30][40][50]

Remove 10:

    [20][30][40][50]

This shifting operation takes:

    O(n)

time complexity.

To solve this problem, we use a **Circular Queue**.

---

# Why Circular Queue?

The main idea is:

- Do not shift elements after removal.
- Reuse empty spaces created at the beginning of the array.
- Treat the array as circular.

Instead of:

    0 → 1 → 2 → 3 → 4

We imagine:

           ┌───────┐
           │       ↓
    0 → 1 → 2 → 3 → 4
    ↑               │
    └───────────────┘

After the last index, we return back to index 0.

---

# Advantages of Circular Queue

| Operation | Time Complexity |
|------------|------------|
| isEmpty() | O(1) |
| isFull() | O(1) |
| add() | O(1) |
| remove() | O(1) |
| peek() | O(1) |

Unlike a normal Array Queue:

    remove() = O(n)

Circular Queue makes:

    remove() = O(1)

because no shifting is required.

---

# Variables Used

## Array

Stores queue elements.

    int arr[];

Example:

    [1][2][3]

---

## Size

Stores the maximum capacity.

    int size;

Example:

    size = 5

---

## Front

Points to the first element of the Queue.

    int front;

Initially:

    front = -1

---

## Rear

Points to the last element of the Queue.

    int rear;

Initially:

    rear = -1

---

# Initial State

For a Queue of size 5:

    Index:

      0    1    2    3    4

    [ ]  [ ]  [ ]  [ ]  [ ]

    front = -1
    rear  = -1

This means:

    Queue is Empty

---

# isEmpty()

Checks whether the Queue contains any elements.

## Condition

    rear == -1 && front == -1

### Implementation

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

### Time Complexity

    O(1)

---

# isFull()

Checks whether the Queue is full.

## Formula

    (rear + 1) % size == front

This is the most important formula in Circular Queue.

### Implementation

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

---

## Why This Formula Works

Suppose:

    size = 5

Queue:

    [10][20][30][40][50]

    F
    R

Rear is currently at index 4.

Now:

    (rear + 1) % size

    = (4 + 1) % 5

    = 0

If index 0 already contains the Front element:

    front = 0

Then:

    (rear + 1) % size == front

Queue is Full.

---

# add() (Enqueue)

Used to insert an element into the Queue.

---

## Step 1: Check Full Condition

    if(isFull())

Queue cannot accept more elements.

---

## Step 2: Insert First Element

If Queue is empty:

    front = 0

---

## Step 3: Move Rear Circularly

Formula:

    rear = (rear + 1) % size

---

## Step 4: Store Data

    arr[rear] = data;

---

## Implementation

    public static void add(int data) {

        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if(front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

---

## Example

Insert 1:

    [1][ ][ ]

    F
    R

Insert 2:

    [1][2][ ]

    F   R

Insert 3:

    [1][2][3]

    F     R

Queue becomes full.

---

### Time Complexity

    O(1)

---

# remove() (Dequeue)

Removes the front element.

Unlike a simple Queue:

- No shifting is performed.
- Front simply moves forward.

---

## Step 1: Store Front Element

    result = arr[front]

---

## Step 2: Check Last Element Case

If:

    rear == front

Only one element exists.

After removal:

    rear = -1
    front = -1

Queue becomes empty.

---

## Step 3: Move Front Circularly

Formula:

    front = (front + 1) % size

---

## Implementation

    public static int remove() {

        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        int result = arr[front];

        if(rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }

        return result;
    }

---

## Example

Queue:

    [1][2][3]

    F     R

Remove:

    1

Move Front:

    [1][2][3]

        F   R

Logical Queue:

    2 → 3

No shifting required.

---

### Time Complexity

    O(1)

---

# peek()

Returns the front element without removing it.

---

## Formula

    arr[front]

---

## Implementation

    public static int peek() {

        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return arr[front];
    }

---

### Time Complexity

    O(1)

---

# Circular Movement Example

Queue Size:

    3

Add:

    1, 2, 3

    [1][2][3]

    F     R

Remove:

    1

Front moves:

    [1][2][3]

        F   R

Now Add:

    4

Rear wraps around:

    rear = (2 + 1) % 3
         = 0

Result:

    [4][2][3]

    R   F

Logical Queue:

    2 → 3 → 4

Notice:

- No shifting occurred.
- Empty space was reused.

This is the biggest advantage of Circular Queue.

---

# Dry Run of Program

Operations:

    add(1)
    add(2)
    add(3)

Queue:

    [1][2][3]

---

remove()

Returns:

    1

Queue:

    2 → 3

---

add(4)

Queue:

    2 → 3 → 4

---

remove()

Returns:

    2

Queue:

    3 → 4

---

add(5)

Queue:

    3 → 4 → 5

---

Printing Queue:

Output:

    1
    2
    3
    4
    5

---

# Important Formulas

## Full Condition

    (rear + 1) % size == front

---

## Move Rear

    rear = (rear + 1) % size

---

## Move Front

    front = (front + 1) % size

These three formulas are the foundation of Circular Queue.

---

# Difference Between Normal Queue and Circular Queue

| Feature | Normal Queue | Circular Queue |
|----------|----------|----------|
| Removal | O(n) | O(1) |
| Shifting Required | Yes | No |
| Space Utilization | Poor | Efficient |
| Reuse Empty Spaces | No | Yes |
| Performance | Slower | Faster |

---

# Key Takeaways

- Circular Queue is an optimized version of Queue using Arrays.
- The array is treated as circular.
- No element shifting is required.
- Empty spaces are reused efficiently.
- Both add() and remove() work in O(1) time.
- Front and Rear move using modulo (%) arithmetic.
- The most important formula is:

      (rear + 1) % size == front

  which is used to detect a full Queue.