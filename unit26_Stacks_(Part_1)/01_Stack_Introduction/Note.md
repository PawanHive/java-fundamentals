# Stack Introduction

## What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.

> The element inserted last is removed first.

### Real-Life Example

Think of a stack of plates:

```text
Top
 ↓
Plate 3
Plate 2
Plate 1
```

- Add a plate from the **Top**
- Remove a plate from the **Top**
- Last plate added is the first one removed

---

## LIFO Principle

Example:

~~~java
Push(10);
Push(20);
Push(30);
~~~

Stack:

```text
Top
 ↓
30
20
10
```

After:

~~~java
Pop();
~~~

Removed Element:

```text
30
```

Because **30 was inserted last**.

---

## Basic Operations

### 1. Push

Adds an element to the Top.

```text
Before:

Top
 ↓
20
10

Push(30)

After:

Top
 ↓
30
20
10
```

**Time Complexity:** O(1)

---

### 2. Pop

Removes the Top element.

```text
Before:

Top
 ↓
30
20
10

Pop()

After:

Top
 ↓
20
10
```

**Time Complexity:** O(1)

---

### 3. Peek

Returns the Top element without removing it.

```text
Top
 ↓
30
20
10

Peek() → 30
```

**Time Complexity:** O(1)

---

### 4. IsEmpty

Checks whether the Stack is empty.

~~~java
stack.isEmpty();
~~~

Returns:

```text
true  -> Stack is empty
false -> Stack contains elements
```

**Time Complexity:** O(1)

---

## Stack Representation

```text
Top
 ↓
40
30
20
10
```

Only the **Top** element is directly accessible.

To remove `20`, you must first remove `40` and `30`.

---

## Applications of Stack

### Function Calls

Java uses a **Call Stack**.

~~~java
main()
  ↓
fun1()
  ↓
fun2()
~~~

Execution returns in reverse order:

```text
fun2()
fun1()
main()
```

---

### Undo Operations

```text
Type A
Type B
Type C
```

Undo Order:

```text
C
B
A
```

---

### Browser Back Button

```text
Google
→ YouTube
→ GitHub
```

Press Back:

```text
GitHub removed
Go to YouTube
```

Press Back Again:

```text
YouTube removed
Go to Google
```

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| IsEmpty | O(1) |

---

## Interview Definition

> A Stack is a linear data structure that follows the **Last In First Out (LIFO)** principle, where insertion and deletion occur only at one end called the **Top**.

---

## Quick Revision

- Stack follows **LIFO**
- Insertion = **Push**
- Deletion = **Pop**
- Top element access = **Peek**
- Empty check = **IsEmpty**
- All operations happen at the **Top**
- Push, Pop, Peek → **O(1)**

### One-Line Summary

**Stack = LIFO data structure where all operations happen at the Top.**