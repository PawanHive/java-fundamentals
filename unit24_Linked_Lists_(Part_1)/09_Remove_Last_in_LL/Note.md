# ![](LL.AllOperations.png)

# Singly Linked List Operations

## 📌 What is a Singly Linked List?

A Singly Linked List (LL) is a linear data structure where each node contains:

1. **Data**
2. **Address of Next Node (next)**

Structure of a Node:

~~~java
class Node {
    int data;
    Node next;
}
~~~

Example:

```text
Head
 ↓
[10|•] → [20|•] → [30|NULL]
                      ↑
                     Tail
```

- **Head** → First node of the Linked List
- **Tail** → Last node of the Linked List
- **Size** → Total number of nodes present in the Linked List

---

# 1️⃣ Add First (Insert at Beginning)

## 📌 Idea

Insert a new node at the beginning of the Linked List.

### Steps

1. Create a new node.
2. Point new node's next to current head.
3. Move head to the new node.
4. If LL was empty, head and tail both point to new node.
5. Increase size.

---

### Example

Before:

```text
Head
 ↓
10 → 20 → 30 → NULL
                ↑
               Tail
```

Insert 5 at beginning:

```text
Head
 ↓
5 → 10 → 20 → 30 → NULL
                    ↑
                   Tail
```

---

### Code

~~~java
public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;

    if(head == null) {
        head = tail = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}
~~~

### Time Complexity

```text
O(1)
```

---

# 2️⃣ Add Last (Insert at End)

## 📌 Idea

Insert a new node at the end of the Linked List.

### Steps

1. Create a new node.
2. Connect current tail to new node.
3. Move tail to new node.
4. If LL is empty, head and tail point to new node.
5. Increase size.

---

### Example

Before:

```text
Head
 ↓
5 → 10 → 20 → NULL
             ↑
            Tail
```

Insert 30:

```text
Head
 ↓
5 → 10 → 20 → 30 → NULL
                  ↑
                 Tail
```

---

### Code

~~~java
public void addLast(int data) {
    Node newNode = new Node(data);
    size++;

    if(head == null) {
        head = tail = newNode;
        return;
    }

    tail.next = newNode;
    tail = newNode;
}
~~~

### Time Complexity

```text
O(1)
```

---

# 3️⃣ Print a Linked List

## 📌 Idea

Traverse from Head to NULL and print each node.

### Steps

1. Create a temporary node.
2. Start from head.
3. Print current node data.
4. Move to next node.
5. Repeat until NULL.

---

### Example

```text
Head
 ↓
5 → 10 → 20 → 30 → NULL
```

Output:

```text
5 --> 10 --> 20 --> 30 --> null
```

---

### Code

~~~java
public void print() {

    if(head == null) {
        System.out.println("LL is empty");
        return;
    }

    Node temp = head;

    while(temp != null) {
        System.out.print(temp.data + " --> ");
        temp = temp.next;
    }

    System.out.println("null");
}
~~~

### Time Complexity

```text
O(n)
```

---

# 4️⃣ Add in the Middle

## 📌 Idea

Insert a node at a specific index.

### Steps

1. If index = 0, call addFirst().
2. Traverse till (index - 1).
3. Make newNode.next = temp.next.
4. Make temp.next = newNode.
5. Increase size.

---

### Example

Before:

```text
Index: 0    1    2    3

       1 → 2 → 3 → 4 → NULL
```

Insert 9 at index 2:

```text
Index: 0    1    2    3    4

       1 → 2 → 9 → 3 → 4 → NULL
```

---

### Code

~~~java
public void addMiddle(int idx, int data) {

    if(idx == 0) {
        addFirst(data);
        return;
    }

    Node newNode = new Node(data);
    size++;

    Node temp = head;
    int i = 0;

    while(i < idx - 1) {
        temp = temp.next;
        i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}
~~~

### Time Complexity

```text
O(n)
```

---

# 5️⃣ Size of a Linked List

## 📌 Idea

Size stores total number of nodes in the Linked List.

### Rules

- Increase size whenever a node is inserted.
- Decrease size whenever a node is deleted.

---

### Example

```text
5 → 10 → 20 → 30 → 40 → NULL
```

```text
size = 5
```

---

### Code

~~~java
public static int size;
~~~

Insertion:

~~~java
size++;
~~~

Deletion:

~~~java
size--;
~~~

### Time Complexity

```text
O(1)
```

---

# 6️⃣ Remove First Node

## 📌 Idea

Delete the first node and move head to next node.

### Steps

1. If LL is empty → return.
2. If only one node exists:
   - head = tail = null
3. Store head data.
4. Move head to head.next.
5. Decrease size.
6. Return deleted value.

---

### Example

Before:

```text
Head
 ↓
5 → 10 → 20 → 30 → NULL
```

After removeFirst():

```text
Head
 ↓
10 → 20 → 30 → NULL
```

---

### Code

~~~java
public int removeFirst() {

    if(size == 0) {
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }

    else if(size == 1) {
        int val = head.data;

        head = tail = null;
        size = 0;

        return val;
    }

    int val = head.data;

    head = head.next;

    size--;

    return val;
}
~~~

### Time Complexity

```text
O(1)
```

---

# 7️⃣ Remove Last Node

## 📌 Idea

Delete the last node of the Linked List.

Since this is a Singly Linked List, we must find the node before the tail.

### Steps

1. If LL is empty → return.
2. If only one node exists:
   - head = tail = null
3. Traverse to (size - 2) node.
4. Store tail data.
5. Make previous.next = null.
6. Update tail.
7. Decrease size.
8. Return deleted value.

---

### Example

Before:

```text
Head
 ↓
10 → 20 → 30 → 40 → NULL
                  ↑
                 Tail
```

After removeLast():

```text
Head
 ↓
10 → 20 → 30 → NULL
             ↑
            Tail
```

---

### Code

~~~java
public int removeLast() {

    if(size == 0) {
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }

    else if(size == 1) {

        int val = head.data;

        head = tail = null;
        size = 0;

        return val;
    }

    Node prev = head;

    for(int i=0; i<size-2; i++) {
        prev = prev.next;
    }

    int val = prev.next.data;

    prev.next = null;
    tail = prev;

    size--;

    return val;
}
~~~

### Time Complexity

```text
O(n)
```

---

# 8️⃣ Remove Last Node of Linked List

## 📌 Idea

This operation is exactly the same as **Remove Last()**.

Because the last node is the Tail node.

### Example

Before:

```text
1 → 2 → 3 → 4 → 5 → NULL
                ↑
               Tail
```

After removing last node:

```text
1 → 2 → 3 → 4 → NULL
            ↑
           Tail
```

---

### Time Complexity

```text
O(n)
```

---

# 🎯 Complete Complexity Table

| Operation | Time Complexity |
|------------|----------------|
| Add First | O(1) |
| Add Last | O(1) |
| Print LL | O(n) |
| Add Middle | O(n) |
| Size | O(1) |
| Remove First | O(1) |
| Remove Last | O(n) |
| Remove Last Node | O(n) |

---

# 📌 Interview Quick Revision

### Add First

```text
newNode.next = head
head = newNode
```

### Add Last

```text
tail.next = newNode
tail = newNode
```

### Add Middle

```text
newNode.next = temp.next
temp.next = newNode
```

### Remove First

```text
head = head.next
```

### Remove Last

```text
prev.next = null
tail = prev
```

### Print

```text
Traverse from Head → NULL
```

### Size

```text
Insertion  → size++
Deletion   → size--
```