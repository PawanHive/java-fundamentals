# Operations on ArrayList in Java

In Java, operations on `ArrayList` means the common actions we perform on it like:
- Adding elements
- Accessing elements
- Updating elements
- Removing elements
- Finding size
- Checking existence

These operations are extremely important because almost every DSA problem uses them.

---

# Main Operations on ArrayList

# 1. Creating an ArrayList

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
```

## Explanation
- `ArrayList` → class
- `Integer` → data type
- `list` → object name

---

# 2. Add Elements → `add()`

Used to insert elements.

## Syntax

```java
list.add(value);
```

## Example

```java
list.add(10);
list.add(20);
list.add(30);
```

## Output

```java
[10, 20, 30]
```

---

# Add at Specific Index

```java
list.add(index, value);
```

## Example

```java
list.add(1, 100);
```

## Output

```java
[10, 100, 20, 30]
```

Because `100` is inserted at index `1`.

---

# 3. Get Elements → `get()`

Used to access elements.

## Syntax

```java
list.get(index);
```

## Example

```java
System.out.println(list.get(2));
```

## Output

```java
20
```

---

# 4. Update Elements → `set()`

Used to change existing values.

## Syntax

```java
list.set(index, newValue);
```

## Example

```java
list.set(1, 500);
```

## Output

```java
[10, 500, 20, 30]
```

---

# 5. Remove Elements → `remove()`

Used to delete elements.

# Remove by Index

```java
list.remove(2);
```

## Output

```java
[10, 500, 30]
```

---

# Remove by Object

```java
list.remove(Integer.valueOf(30));
```

## Output

```java
[10, 500]
```

## Important
- `remove(2)` → removes index
- `remove(Integer.valueOf(2))` → removes value

Very important interview point.

---

# 6. Find Size → `size()`

Used to get number of elements.

## Syntax

```java
list.size();
```

## Example

```java
System.out.println(list.size());
```

## Output

```java
2
```

---

# 7. Print ArrayList

```java
System.out.println(list);
```

## Output

```java
[10, 500]
```

---

# 8. Loop Through ArrayList

# Using for loop

```java
for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

# Using enhanced for loop

```java
for(int num : list) {
    System.out.println(num);
}
```

---

# 9. Check Element Exists → `contains()`

## Syntax

```java
list.contains(value);
```

## Example

```java
System.out.println(list.contains(500));
```

## Output

```java
true
```

---

# 10. Clear Entire ArrayList → `clear()`

```java
list.clear();
```

## Output

```java
[]
```

---

# 11. Check Empty or Not → `isEmpty()`

```java
System.out.println(list.isEmpty());
```

## Output

```java
true
```

---

# Complete Example Program

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // Get
        System.out.println(list.get(1));

        // Set
        list.set(1, 200);

        System.out.println(list);

        // Remove
        list.remove(0);

        System.out.println(list);

        // Size
        System.out.println(list.size());

        // Contains
        System.out.println(list.contains(30));

        // Loop
        for(int num : list) {
            System.out.println(num);
        }
    }
}
```

---

# Time Complexity of Important Operations

| Operation | Complexity |
|---|---|
| add() at end | O(1) average |
| add() in middle | O(n) |
| get() | O(1) |
| set() | O(1) |
| remove() | O(n) |
| contains() | O(n) |

---

# Important Interview Points

# Why is insertion/removal in middle O(n)?

Because elements need shifting.

## Example

```java
[10, 20, 30, 40]
```

Remove `20`:

```java
[10, 30, 40]
```

`30` and `40` shift left.

---

# Most Used Operations in DSA

These are used the most:
- add()
- get()
- set()
- remove()
- size()

Master these first before advanced problems.