# #1: What is Sorting:

### Basic Algorithms

1. **Bubble Sort**  
**Idea**: Repeatedly swap adjacent elements if they are in the wrong order.

2. **Selection Sort**  
**Idea**: Find the smallest element and place it at the beginning.

3. **Insertion Sort**
**Idea**: Pick one element and place it in the correct position.

4. **Counting Sort**
**Idea**: Divide array into halves, sort, then merge.

# -------------------------------------------------------------------------------------------------------

# #3: Bubble Sort Code:

## 📌 Problem Statement
Given an array, sort it in **ascending order** using Bubble Sort.

---

## 🧠 Idea

Bubble Sort repeatedly compares **adjacent elements** and swaps them if they are in the wrong order.

👉 After each pass:
- The largest element moves (bubbles) to the end of the array.

---

## ⚙️ Algorithm

1. Run outer loop for total passes: `n - 1`
2. Run inner loop to compare adjacent elements
3. Swap if left element > right element
4. Reduce inner loop range after each pass
5. Repeat until array is sorted

---

## ⏱️ Time Complexity

| Case | Complexity |
|------|------------|
| Worst Case | O(n²) |
| Average Case | O(n²) |
| Best Case (already sorted) | O(n²) |

## ⚠️ Important Points

- Largest element moves to the end after each pass / turn 
- Adjacent swapping is used
- Not efficient for large datasets
# -------------------------------------------------------------------------------------------------------

# #4: Selection Sort

## 📌 Problem Statement
Given an array, sort it in **ascending order** using Selection Sort.

---

## 🧠 Idea

Selection Sort works by repeatedly selecting the **smallest element** from the unsorted part of the array and placing it at the beginning.

👉 After each pass:
- One element is placed in its correct position.

---

## ⚙️ Algorithm

1. Assume current index `i` is the minimum position
2. Find the smallest element in the remaining array (`i+1 → n`)
3. Store its index in `minPos`
4. Swap `arr[i]` and `arr[minPos]`
5. Repeat for all positions

---

# ------------------------------------------------------------------------------------------------------

# #5: Insertion Sort

## 📌 Problem Statement
Given an array, sort it in **ascending order** using Insertion Sort.

---

## 🧠 Idea

Insertion Sort builds the sorted array **one element at a time**.

👉 It takes one element and inserts it into its **correct position** in the already sorted part.

---

## ⚙️ Algorithm

1. Start from index `1` (second element)
2. Store current element as `curr`
3. Compare it with elements in the sorted part (left side)
4. Shift larger elements to the right
5. Insert `curr` at its correct position
6. Repeat for all elements

---

## ⚠️ Important Points

- Works well for **small or nearly sorted arrays**
- Shifts elements instead of swapping repeatedly
- Maintains relative order → **Stable Sort**

# ------------------------------------------------------------------------------------------------------

# #6: Java Inbuilt Sorting (ASCENDING ORDER):

# -----------------
# FIRST: 1. Syntax: (sort entire array)
# -----------------
A built-in Java method that sorts an entire array in **ascending order**.
- Modifies the original array (in-place sorting) 

```java 
Arrays.sort(arr);
```

## This package must imported
```java
import java.util.Arrays;
```

## 🧠 Internal Working (IMPORTANT to note)
- For primitive types (`int`, `char`, etc.) → Dual-Pivot QuickSort  
- Time Complexity:
  - Best/Average: O(n log n)   

## Example

```java 
import java.util.Arrays; // this package must impoted

public class Main {
  public static void main(String[] args) {
    int arr[] = {5, 4, 1, 3, 2} ;
    Arrays.sort(arr); // REMEMBER: this is inbuilt sorting algorithm

    // print sorted array (below is IMPORTANT to print inbuilt sorting array)
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
```
# -----------------
# SECOND: 2. Syntax: (sort specific portion of array)
# -----------------

Sorts a **specific portion (range)** of an array. 

```java
Arrays.sort(arr, startingIndex, endingIndex);
```

## This package must imported
```java
import java.util.Arrays;

## ⚠️ Important Rule
- startingIndex → inclusive  
- endingIndex → exclusive  

👉 Actual range = startingIndex to endingIndex - 1  

## Example

```java
// inbuilt sorting but for specific portion of a given array.
// want to sort a portion form index '0' to index '3' (3rd index will not include)

import java.util.Arrays;

public class Main1 {
  public static void main(String[] args) {
    int arr[] = {5, 4, 1, 3, 2};
    Arrays.sort(arr, 0, 3);

    // print sort array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
```

# #7: Java Inbuilt Sorting (DESCENDING ORDER):

# -----------------
# FIRST: 1. Syntax: (sort entire array)
# -----------------

Used to sort an array in **descending order**.

```java
Arrays.sort(arr, Collections.reverseOrder());
```


## MUST import

```java
// import java.util.*;  // this used to import all packages at once.

import java.util.Arrays;
import java.util.Collections;
```

## ⚠️ Important Condition
✔ Works ONLY with object arrays  
❌ Not valid for primitive arrays (int[])

## 🧠 Why?
Because:
- `Collections.reverseOrder()` works with **Objects**
- Primitive arrays (int, char) do not support comparators


## Correct Example (should use `Integer` instead of `int`)

```java
// using inbuilt sort but (DECENDING ORDER)

// import java.util.*;  // this used to import all packages at once.

import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Integer arr[] = {5, 4, 1, 3, 2};
    Arrays.sort(arr, Collections.reverseOrder()); // make array sort in descending order

    // print sort array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
```


# -----------------
# SECOND: 2. Syntax: (sort specific portion of array)
# -----------------

It basically sort specific portin of array but also in (DESCENDING ORDER)

```java
Arrays.sort(arr, startIndex, endIndex, Collections.reverseOrder());
```

## MUST import

```java
// import java.util.*;  // this used to import all packages at once.

import java.util.Arrays;
import java.util.Collections;
```

## Example

```java
// Using inbuilt sorting but for specific portion (DESCENDING ORDER)
// here we want to sort the given array from index '1' to index '4' (4th index will not include)

// import java.util.*;  // this used to import all packages at once.

import java.util.Arrays;
import java.util.Collections;

public class Main1 {
  public static void main(String[] args) {
    Integer arr[] = {5, 4, 1, 3, 2};
    Arrays.sort(arr, 1, 4, Collections.reverseOrder());

    // print sort array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " "); // output should be {5, 4, 3, 1, 2}
    }
  }
}
```

# ------------------------------------------------------------------------------------------------------

# #9: Counting Sort

## 📌 Problem Statement
Given an array of integers, sort it in **ascending order** using Counting Sort.

---

## 🧠 Idea

Counting Sort is a **non-comparison based sorting algorithm**.

👉 Instead of comparing elements, it:
- Counts how many times each element appears
- Uses that frequency to rebuild the sorted array

---

## ⚙️ Algorithm

1. Find the **largest element** in the array.
2. Create a `count[]` array of size `largest + 1`.
3. Store frequency of each element in `count[]`.
4. Reconstruct the original array using the frequency array.

---

## 📦 Space Complexity

- Count array → O(n + k)

Where:
- `n` = number of elements  
- `k` = range of input values  

## ⚠️ Important Points

- Works only for **non-negative integers**
- Efficient when range (`k`) is not too large
- Not a comparison-based sorting algorithm
- Stable version exists (with prefix sum modification)