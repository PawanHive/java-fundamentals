# Detecting Loop/Cycle in Linked List

## What is a Cycle in a Linked List?

A cycle (or loop) exists in a linked list when a node points back to a previously visited node instead of pointing to `null`.

### Example

```
1 -> 2 -> 3
     ^    |
     |____|
```

In the above linked list:

- Node `3` points back to node `2`.
- Traversal never reaches `null`.
- Therefore, a cycle exists.

---

# Floyd's Cycle Finding Algorithm (Tortoise and Hare Algorithm)

This is the most efficient way to detect a cycle in a linked list.

## Idea

Use two pointers:

### Slow Pointer

- Moves one step at a time.

```java
slow = slow.next;
```

### Fast Pointer

- Moves two steps at a time.

```java
fast = fast.next.next;
```

---

## Why Does It Work?

### Case 1: Cycle Exists

Since the fast pointer moves faster than the slow pointer, it will eventually catch up with the slow pointer inside the cycle.

```
slow == fast
```

Cycle detected.

---

### Case 2: No Cycle Exists

The fast pointer will eventually reach:

```java
null
```

or

```java
fast.next == null
```

which means the linked list ends normally.

No cycle exists.

---

# Algorithm

### Step 1

Initialize:

```java
Node slow = head;
Node fast = head;
```

### Step 2

Repeat while:

```java
fast != null && fast.next != null
```

### Step 3

Move pointers:

```java
slow = slow.next;
fast = fast.next.next;
```

### Step 4

Check:

```java
if (slow == fast)
```

If true:

```java
return true;
```

Cycle found.

### Step 5

If loop ends:

```java
return false;
```

No cycle found.

---

# Dry Run Example

Linked List:

```
1 -> 2 -> 3
     ^    |
     |____|
```

## Initial State

| Step | Slow | Fast |
|--------|--------|--------|
| 0 | 1 | 1 |

---

## First Iteration

Slow moves 1 step:

```
1 -> 2
```

Fast moves 2 steps:

```
1 -> 2 -> 3
```

| Step | Slow | Fast |
|--------|--------|--------|
| 1 | 2 | 3 |

---

## Second Iteration

Slow moves:

```
2 -> 3
```

Fast moves:

```
3 -> 2
```

| Step | Slow | Fast |
|--------|--------|--------|
| 2 | 3 | 2 |

---

## Third Iteration

Slow moves:

```
3 -> 2
```

Fast moves:

```
2 -> 3 -> 2
```

| Step | Slow | Fast |
|--------|--------|--------|
| 3 | 2 | 2 |

Now:

```java
slow == fast
```

Therefore:

```java
return true;
```

Cycle detected.

---

# Java Implementation

```java
public static boolean isCycle() {

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }

    return false;
}
```

---

# Complete Example

```java
public static void main(String[] args) {

    head = new Node(1);

    Node temp = new Node(2);
    head.next = temp;

    head.next.next = new Node(3);

    head.next.next.next = temp;

    System.out.println(isCycle());
}
```

### Structure

```
1 -> 2 -> 3
     ^    |
     |____|
```

### Output

```text
true
```

---

# Complexity Analysis

## Time Complexity

```text
O(n)
```

Reason:

- At most each node is visited a constant number of times.

---

## Space Complexity

```text
O(1)
```

Reason:

- Only two pointers are used.
- No extra data structure is required.

---

# Key Points for Interviews

1. Floyd's Algorithm is also called:
   - Tortoise and Hare Algorithm

2. Uses two pointers:
   - Slow → 1 step
   - Fast → 2 steps

3. If cycle exists:
   - Slow and Fast will definitely meet.

4. If cycle doesn't exist:
   - Fast reaches `null`.

5. Time Complexity:
   - `O(n)`

6. Space Complexity:
   - `O(1)`

7. Preferred interview solution because it requires constant extra space.

---

# Visualization

```
Cycle Exists

1 -> 2 -> 3
     ^    |
     |____|

Result: true
```

```
No Cycle

1 -> 2 -> 3 -> 4 -> null

Result: false
```