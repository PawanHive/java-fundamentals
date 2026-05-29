# Multi-Dimensional ArrayList in Java (Complete Notes)

## What is Multi-Dimensional ArrayList?

A Multi-Dimensional ArrayList in Java is:
> An ArrayList that stores other ArrayLists inside it.

It is basically a **dynamic 2D structure**.

---

## Simple Definition

- 1D ArrayList → stores values
- 2D ArrayList → stores ArrayLists (rows of data)

---

## Syntax

~~~java
ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
~~~

Meaning:
- Outer ArrayList → stores inner ArrayLists
- Inner ArrayLists → store actual values

---

## Example Structure

```
mainList
   |
   |--> [1, 2, 3, 4, 5]
   |--> [2, 4, 6, 8, 10]
   |--> [3, 6, 9, 12, 15]
```

Each element of `mainList` is itself an ArrayList.

---

## Why Use Multi-Dimensional ArrayList?

We use it when:
- Size is not fixed
- We need dynamic rows and columns
- We are solving matrix-like problems
- We are handling graphs or nested data structures

---

## How It Works Internally

- Outer ArrayList stores references
- Each reference points to another ArrayList
- Inner ArrayList stores actual values

So structure is:
> ArrayList → ArrayList → Elements

---

## Example Concept

~~~java
list1: 1, 2, 3, 4, 5  
list2: 2, 4, 6, 8, 10  
list3: 3, 6, 9, 12, 15  
~~~

Then:
~~~java
mainList = [list1, list2, list3];
~~~

---

## Accessing Elements

~~~java
mainList.get(i).get(j);
~~~

Explanation:
- `get(i)` → selects a row (inner list)
- `get(j)` → selects element inside that row

---

## Looping Concept

### Outer Loop
- Iterates over each list (row)

### Inner Loop
- Iterates over elements inside each list (column)

~~~java
for (int i = 0; i < mainList.size(); i++) {
    ArrayList<Integer> currList = mainList.get(i);

    for (int j = 0; j < currList.size(); j++) {
        System.out.print(currList.get(j) + " ");
    }

    System.out.println();
}
~~~

---

## Advantages

- Dynamic size
- Flexible structure
- Easy row manipulation
- Useful in real-world and DSA problems

---

## Disadvantages

- Slower than arrays
- More memory usage
- Slightly complex structure

---

## Time Complexity

| Operation | Complexity |
|-----------|-----------|
| Access row | O(1) |
| Access element | O(1) |
| Full traversal | O(n × m) |

Where:
- n = number of lists
- m = average size of each list

---

## Important Interview Points

- NOT a true 2D array
- It is a nested dynamic structure
- Each row can have different size
- Internally uses references to ArrayLists

---

## Final Summary

Multi-Dimensional ArrayList =

A dynamic structure where:
> An ArrayList stores multiple ArrayLists, used to represent flexible 2D data in Java.
