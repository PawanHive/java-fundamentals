# Linked List (Introduction)

## What is a Linked List?

A **Linked List** is a linear data structure where elements are stored in **nodes**, and each node contains:

1. **Data** → the actual value
2. **Next** → address/reference of the next node

Unlike an Array, Linked List elements are **not stored in contiguous memory locations**.

---

## Visual Representation

```text
Head
 ↓

+------+-------+    +------+-------+    +------+-------+
|  10  |   •───|───>|  20  |   •───|───>|  30  | NULL  |
+------+-------+    +------+-------+    +------+-------+
   Node1              Node2              Node3
```

Each node stores:
- Data → `10`, `20`, `30`
- Address of next node

The last node points to `NULL`.

---

## Why Do We Need Linked Lists?

### Problem with Arrays

Suppose we have:

```text
[10][20][30][40]
```

To insert `25` between `20` and `30`:

```text
Before:
[10][20][30][40]

After:
[10][20][25][30][40]
```

We must shift elements:

```text
40 → right
30 → right
```

Insertion can take **O(n)** time.

---

### Linked List Solution

```text
10 → 20 → 30 → 40 → NULL
```

Insert `25`:

```text
10 → 20 → 25 → 30 → 40 → NULL
```

Only a few pointer changes are needed.

No shifting of elements.


## Structure of a Node in Java

```java
public class LinkedList {
  public static class Node {
    int data;
    Node next;

    public Node (int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static void main(String[] args) {
    
  }
}

```

### Example

```java
Node first = new Node(10);
Node second = new Node(20);
Node third = new Node(30);

first.next = second;
second.next = third;
```

Visual:

```text
10 → 20 → 30 → NULL
```

---

## Important Terms

### Head

The first node of the Linked List.

```text
Head
 ↓
10 → 20 → 30 → NULL
```

Without the head, we lose access to the entire list.

---

### Tail

The last node of the Linked List.

```text
10 → 20 → 30 → NULL
               ↑
             Tail
```

Tail's next is always `NULL`.

---

## Array vs Linked List

| Feature | Array | Linked List |
|----------|--------|------------|
| Memory Allocation | Contiguous | Non-contiguous |
| Size | Fixed | Dynamic |
| Insertion at Beginning | O(n) | O(1) |
| Deletion at Beginning | O(n) | O(1) |
| Random Access (`arr[i]`) | O(1) | O(n) |
| Extra Memory | No | Yes (next pointer) |

---

## Advantages of Linked List

### 1. Dynamic Size

Array:

```java
int arr[] = new int[5];
```

Size is fixed.

Linked List:

```text
10 → 20 → 30 → ...
```

Can grow as needed.

---

### 2. Fast Insertions and Deletions

No shifting required.

```text
10 → 20 → 30

Insert 25

10 → 20 → 25 → 30
```

---

## Disadvantages of Linked List

### 1. Extra Memory

Each node stores:

```text
data + next pointer
```

More memory than arrays.

---

### 2. No Direct Access

Array:

```java
arr[4]
```

Direct access.

Linked List:

```text
10 → 20 → 30 → 40 → 50
```

To reach `50`, we must visit:

```text
10 → 20 → 30 → 40 → 50
```

Time Complexity: **O(n)**

---

## Time Complexities

| Operation | Time Complexity |
|------------|----------------|
| Add First | O(1) |
| Add Last (with Tail) | O(1) |
| Search | O(n) |
| Access nth Node | O(n) |
| Delete First | O(1) |
| Delete Last | O(n) |

---

## Key Idea to Remember

### Array stores elements next to each other in memory

```text
[10][20][30][40]
```

### Linked List stores elements anywhere in memory and connects them using pointers

```text
10 → 20 → 30 → 40 → NULL
```

This single idea is the foundation of every Linked List operation you'll learn next:

- Add First
- Add Last
- Delete First
- Delete Last
- Reverse Linked List
- Palindrome Linked List

