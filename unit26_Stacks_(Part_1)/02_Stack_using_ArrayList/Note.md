# Stack using ArrayList

## Overview

A Stack can be implemented using Java's **ArrayList** because:

- ArrayList allows insertion at the end in O(1) amortized time.
- ArrayList allows deletion from the end in O(1) time.
- The last element of the ArrayList can act as the **Top** of the Stack.

Since a Stack follows the **LIFO (Last In First Out)** principle, performing all operations at the end of the ArrayList makes implementation efficient.

---

## Structure

~~~java
static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();
}
~~~

Here:

- `ArrayList` stores all stack elements.
- The last index of the ArrayList represents the **Top** of the Stack.

Example:

```text
ArrayList:

Index:  0   1   2
Value: [1,  2,  3]

Top = 3
```

Stack Representation:

```text
Top
 ↓
3
2
1
```

---

## 1. isEmpty()

Checks whether the Stack contains any elements.

### Code

~~~java
public static boolean isEmpty() {
    return list.size() == 0;
}
~~~

### Working

If size becomes 0:

```text
[]
```

The stack is empty.

### Time Complexity

```text
O(1)
```

---

## 2. push()

Adds a new element to the Top of the Stack.

### Code

~~~java
public static void push(int data) {
    list.add(data);
}
~~~

### Example

~~~java
push(1);
push(2);
push(3);
~~~

ArrayList:

```text
[1, 2, 3]
```

Stack:

```text
Top
 ↓
3
2
1
```

### Why add at the end?

Because the end of the ArrayList acts as the Top of the Stack.

### Time Complexity

```text
O(1) Amortized
```

---

## 3. pop()

Removes and returns the Top element.

### Code

~~~java
public static int pop() {

    if(isEmpty()) {
        return -1;
    }

    int top = list.get(list.size()-1);
    list.remove(list.size()-1);

    return top;
}
~~~

### Working

Initial Stack:

```text
Top
 ↓
3
2
1
```

After:

~~~java
pop();
~~~

Removed:

```text
3
```

Remaining Stack:

```text
Top
 ↓
2
1
```

### Steps

1. Get the last element.
2. Remove the last element.
3. Return the removed value.

### Time Complexity

```text
O(1)
```

---

## 4. peek()

Returns the Top element without removing it.

### Code

~~~java
public static int peek() {

    if(isEmpty()) {
        return -1;
    }

    return list.get(list.size()-1);
}
~~~

### Example

Stack:

```text
Top
 ↓
3
2
1
```

~~~java
peek();
~~~

Returns:

```text
3
```

Stack remains unchanged.

### Time Complexity

```text
O(1)
```

---

## Dry Run

### Push Operations

~~~java
push(1);
~~~

```text
[1]
```

---

~~~java
push(2);
~~~

```text
[1, 2]
```

---

~~~java
push(3);
~~~

```text
[1, 2, 3]
```

---

### Peek

~~~java
peek();
~~~

Returns:

```text
3
```

ArrayList remains:

```text
[1, 2, 3]
```

---

### Pop

~~~java
pop();
~~~

Returns:

```text
3
```

ArrayList becomes:

```text
[1, 2]
```

---

### Pop Again

~~~java
pop();
~~~

Returns:

```text
2
```

ArrayList becomes:

```text
[1]
```

---

## Main Function

~~~java
public static void main(String[] args) {

    Stack s = new Stack();

    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
}
~~~

### Output

```text
3
2
1
```

Explanation:

- 3 is removed first.
- 2 is removed second.
- 1 is removed last.

This proves that Stack follows **LIFO**.

---

## Complexity Analysis

| Operation | Time Complexity |
|------------|----------------|
| isEmpty() | O(1) |
| push() | O(1) Amortized |
| pop() | O(1) |
| peek() | O(1) |

---

## Important Observation

The Top element is always stored at:

~~~java
list.get(list.size()-1)
~~~

Therefore:

- Push → Add at end
- Pop → Remove from end
- Peek → Access last element

All operations become efficient.

---

## Limitations of Current Implementation

Since everything is declared as `static`:

~~~java
static ArrayList<Integer> list = new ArrayList<>();
~~~

All Stack objects share the same ArrayList.

~~~java
Stack s1 = new Stack();
Stack s2 = new Stack();
~~~

Both stacks will use the same storage.

For a true object-oriented implementation, remove the `static` keyword from the ArrayList and methods.

---

## Interview Point

Why is ArrayList suitable for Stack implementation?

**Answer:**

ArrayList provides efficient insertion, deletion, and access at the last index. Since Stack operations occur only at the Top, the last element of the ArrayList can be treated as the Top of the Stack, making Push, Pop, and Peek operations efficient.

---

## Quick Revision

- Stack follows **LIFO**
- Last index of ArrayList acts as **Top**
- `push()` → add at end
- `pop()` → remove from end
- `peek()` → access last element
- `isEmpty()` → checks size == 0
- Push, Pop, Peek → O(1)

### One-Line Summary

**Stack using ArrayList is implemented by treating the last element of the ArrayList as the Top of the Stack.**