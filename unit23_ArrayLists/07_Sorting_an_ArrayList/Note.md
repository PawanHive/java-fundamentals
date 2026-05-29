# Sorting ArrayList in Java (Complete Notes)

## Introduction

In Java, sorting of an `ArrayList` is done using the `Collections` utility class.

We can sort:
- Ascending order
- Descending order

---

# Full Code Example

~~~java
import java.util.ArrayList;
import java.util.Collections;

/*
Collections ==> class
Collection  ==> interface
*/

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(6);

        System.out.println("Original List: " + list);

        // Ascending Order
        Collections.sort(list);
        System.out.println("Ascending Order: " + list);

        // Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: " + list);
    }
}
~~~

---

# Output

~~~
Original List: [2, 3, 9, 5, 6]
Ascending Order: [2, 3, 5, 6, 9]
Descending Order: [9, 6, 5, 3, 2]
~~~

---

# Key Concepts

## 1. ArrayList

- Dynamic array in Java
- Part of Collection Framework
- Grows automatically

~~~java
ArrayList<Integer> list = new ArrayList<>();
~~~

---

## 2. Collections vs Collection

| Term | Meaning |
|------|--------|
| Collections | Utility class (sorting, reversing, etc.) |
| Collection | Interface (parent of ArrayList, List, etc.) |

---

## 3. Sorting in ArrayList

### Ascending Order

~~~java
Collections.sort(list);
~~~

- Sorts elements in increasing order
- Uses **TimSort**
- Time Complexity: **O(n log n)**

---

### Descending Order

~~~java
Collections.sort(list, Collections.reverseOrder());
~~~ 
OR we can also write like below line
```java
Collections.reverseOrder(list);
```

- Uses Comparator internally
- Sorts elements in decreasing order

---

## 4. reverseOrder()

~~~java
Collections.reverseOrder()
~~~

- Returns a Comparator
- Used for descending order sorting

---

## 5. Internal Working of Sorting

Java uses:
- **TimSort algorithm**
  - Combination of Merge Sort + Insertion Sort
  - Very optimized for real-world data

---

## 6. Time Complexity

| Operation | Complexity |
|-----------|-----------|
| Sort (Ascending) | O(n log n) |
| Sort (Descending) | O(n log n) |

---

## 7. Important Points

- ArrayList is dynamic (size changes automatically)
- Sorting is handled by `Collections` class
- `reverseOrder()` is used for descending sort
- Sorting is stable and optimized in Java

---

## 8. Interview Notes

- `Collections.sort()` → ascending sort
- `Collections.sort(list, Collections.reverseOrder())` → descending sort
- Sorting is NOT done manually; Java handles it internally
- Most commonly used sorting method in DSA problems