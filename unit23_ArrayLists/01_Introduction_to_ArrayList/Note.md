# ArrayList in Java

## What is an ArrayList?

In Java, an `ArrayList` is a **dynamic array**.

That means:
- It works like an array
- But its size can grow or shrink automatically

---

# 1. What is an Array?

An array stores multiple values of the same type in contiguous memory.

## Example

```java
int arr[] = new int[5];
```

This array can store only 5 integers.

## Problem
- Size is fixed
- You cannot increase or decrease size later

## Example

```java
arr[5] = 10; // Error
```

---

# 2. What is an ArrayList?

`ArrayList` is a class present in:

```java
import java.util.ArrayList;
```

## Example

```java
ArrayList<Integer> list = new ArrayList<>();
```

Now you can:
- Add elements dynamically
- Remove elements dynamically
- Size changes automatically

## Example

```java
list.add(10);
list.add(20);
list.add(30);
```

No need to define size beforehand.

---

# 3. Real-Life Analogy

## Array
Like a fixed-size hostel room with exactly 5 beds.

If a 6th person comes:
- No space

---

## ArrayList
Like a hotel where new rooms can be added when needed.

---

# 4. Main Difference Between Array and ArrayList

| Feature | Array | ArrayList |
|---|---|---|
| Size | Fixed | Dynamic |
| Can grow/shrink | ❌ No | ✅ Yes |
| Stores primitives directly | ✅ Yes | ❌ Wrapper classes needed |
| Built-in methods | Very few | Many useful methods |
| Faster | Slightly faster | Slightly slower |
| Part of | Core language | Collection Framework |

---

# 5. Syntax Difference

## Array

```java
int arr[] = new int[5];
```

---

## ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

## Notice
- `Integer` instead of `int`
- Because `ArrayList` works with objects

---

# 6. Accessing Elements

## Array

```java
arr[0];
```

---

## ArrayList

```java
list.get(0);
```

---

# 7. Updating Elements

## Array

```java
arr[1] = 50;
```

---

## ArrayList

```java
list.set(1, 50);
```

---

# 8. Size Finding

## Array

```java
arr.length
```

---

## ArrayList

```java
list.size();
```

---

# 9. Important ArrayList Methods

| Method | Work |
|---|---|
| add() | Insert element |
| get() | Access element |
| set() | Update element |
| remove() | Delete element |
| size() | Find size |
| contains() | Check existence |

---

# 10. Internally How ArrayList Works

Very important interview concept.

Internally:
- `ArrayList` uses an array itself
- When array becomes full:
  - Java creates a bigger array
  - Copies old elements
  - Adds new elements

So it behaves dynamically.

---

# 11. Time Complexity

| Operation | Complexity |
|---|---|
| Access | O(1) |
| Add at end | O(1) average |
| Insert in middle | O(n) |
| Delete in middle | O(n) |

---

# 12. Simple Example Program

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1, 50);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.size());
    }
}
```

## Output

```java
[10, 20, 30]
20
[10, 50, 30]
[50, 30]
2
```

---

# When to Use What?

## Use Array when:
- Size is fixed
- Performance is very critical

---

## Use ArrayList when:
- Size changes dynamically
- You need easy insertion/deletion
- You want built-in methods

In most real-world Java applications, developers use `ArrayList` much more frequently than normal arrays.