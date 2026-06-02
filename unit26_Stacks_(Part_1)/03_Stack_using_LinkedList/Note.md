# Stack using Linked List

## Overview

A **Stack** can be efficiently implemented using a **Linked List**.

In this implementation:
- Each node stores data and a reference to the next node.
- The **head of the linked list acts as the Top of the Stack**.
- All operations are performed at the head for efficiency.

This follows the **LIFO (Last In First Out)** principle.

---

## Structure of Node

~~~java
static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
~~~

### Representation

```text
Top (head)
 ↓
[3] → [2] → [1] → NULL
```

---

## Key Idea

- `head` → Top of Stack
- Insert at head → Push
- Delete from head → Pop
- Read head → Peek

---

## 1. isEmpty()

Checks whether the stack is empty.

### Code

~~~java
public static boolean isEmpty() {
    return head == null;
}
~~~

### Explanation

- If `head == null`, stack has no elements.
- Otherwise, stack contains elements.

### Time Complexity

```
O(1)
```

---

## 2. push()

Adds an element to the top of the stack.

### Code

~~~java
public static void push(int data) {
    Node newNode = new Node(data);

    if(isEmpty()) {
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}
~~~

### Working

Before push:

```text
Top
 ↓
2 → 1 → NULL
```

After `push(3)`:

```text
Top
 ↓
3 → 2 → 1 → NULL
```

### Steps

1. Create a new node.
2. Point new node to current head.
3. Update head to new node.

### Time Complexity

```
O(1)
```

---

## 3. pop()

Removes and returns the top element.

### Code

~~~java
public static int pop() {

    if(isEmpty()) {
        return -1;
    }

    int top = head.data;
    head = head.next;

    return top;
}
~~~

### Working

Before pop:

```text
Top
 ↓
3 → 2 → 1 → NULL
```

After `pop()`:

```text
Top
 ↓
2 → 1 → NULL
```

Returned value:

```
3
```

### Steps

1. Store head data.
2. Move head to next node.
3. Return stored value.

### Time Complexity

```
O(1)
```

---

## 4. peek()

Returns the top element without removing it.

### Code

~~~java
public static int peek() {

    if(isEmpty()) {
        return -1;
    }

    return head.data;
}
~~~

### Working

Stack:

```text
Top
 ↓
3 → 2 → 1 → NULL
```

~~~java
peek();
~~~

Returns:

```
3
```

Stack remains unchanged.

### Time Complexity

```
O(1)
```

---

## Dry Run

### Push Operations

~~~java
push(1);
~~~

```text
1 → NULL
```

---

~~~java
push(2);
~~~

```text
2 → 1 → NULL
```

---

~~~java
push(3);
~~~

```text
3 → 2 → 1 → NULL
```

---

### Peek

~~~java
peek();
~~~

Returns:
```
3
```

---

### Pop

~~~java
pop();
~~~

Returns:
```
3
```

Stack becomes:

```text
2 → 1 → NULL
```

---

## Stack Representation Summary

```text
Top
 ↓
[3] → [2] → [1] → NULL
```

Only the **head node is accessible directly**, making operations efficient.

---

## Complexity Analysis

| Operation | Time Complexity |
|-----------|----------------|
| isEmpty() | O(1) |
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |

---

## Advantages of Linked List Stack

- Dynamic size (no fixed limit)
- No memory wastage
- Efficient O(1) operations
- No need to resize (unlike ArrayList)

---

## Disadvantages

- Extra memory for pointer (`next`)
- Slight overhead due to node allocation

---

## Important Concept

👉 In Stack using Linked List:
- **Head = Top of Stack**
- All operations happen only at head

This ensures constant time performance.

---

## Interview Definition

> A Stack implemented using a Linked List is a linear data structure where insertion and deletion occur at the head of the list, which represents the Top of the Stack, following the LIFO principle.

---

## Quick Revision

- Stack follows **LIFO**
- Head node = **Top**
- push → insert at head
- pop → delete from head
- peek → read head
- isEmpty → head == null
- All operations → **O(1)**

---

## One-Line Summary

**Stack using Linked List uses the head pointer as the Top, making all operations efficient and dynamic.**