# Pair Sum -1 (Brute Force Approach) - Complete Notes

## Problem Statement

Given a sorted ArrayList:

~~~java
list = [1, 2, 3, 4, 5, 6]
target = 5
~~~

Goal:
> Find if any pair of elements has sum equal to target.

Example:

~~~java
1 + 4 = 5
~~~

So output:
~~~java
true
~~~

---

# Brute Force Approach

Idea:
> Check every possible pair in the ArrayList.

For every pair:
1. Add two elements
2. Compare with target
3. If equal → return true
4. Otherwise continue checking

---

# Algorithm

## Step 1
Take first element using loop `i`

## Step 2
Take second element using loop `j`

## Step 3
Check:

~~~java
list.get(i) + list.get(j) == target
~~~

## Step 4
If condition becomes true:
~~~java
return true;
~~~

## Step 5
If no pair found after complete traversal:
~~~java
return false;
~~~

---

# Code

~~~java
import java.util.ArrayList;

public class Main {

    // Brute Force Approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1, 2, 3, 4, 5, 6

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}
~~~

---

# Output

~~~java
true
~~~

---

# Dry Run

Array:

~~~java
[1, 2, 3, 4, 5, 6]
~~~

Target:

~~~java
5
~~~

---

## Iteration 1

~~~java
i = 0 → 1
j = 1 → 2
~~~

Sum:

~~~java
1 + 2 = 3
~~~

Not target.

---

## Iteration 2

~~~java
i = 0 → 1
j = 2 → 3
~~~

Sum:

~~~java
1 + 3 = 4
~~~

Not target.

---

## Iteration 3

~~~java
i = 0 → 1
j = 3 → 4
~~~

Sum:

~~~java
1 + 4 = 5
~~~

Condition becomes true:

~~~java
return true;
~~~

---

# Why `j = i + 1`?

~~~java
for(int j = i + 1; j < list.size(); j++)
~~~

Reason:
- Avoid checking same element twice
- Avoid duplicate pairs

Example avoided:
~~~java
(1,1)
(2,2)
(1,2) and (2,1)
~~~

---

# Time Complexity

Two nested loops:

~~~java
for(i)
   for(j)
~~~

Total complexity:

~~~java
O(n²)
~~~

Because:
- Every pair is checked.

---

# Space Complexity

~~~java
O(1)
~~~

No extra space used.

---

# Important Concepts

## 1. Pair Checking

Every unique pair is checked once.

---

## 2. Early Return Optimization

~~~java
return true;
~~~

As soon as pair found:
- Program stops immediately
- Saves unnecessary computation

---

# Why Brute Force is Slow?

Because:
- Every pair is checked
- Many repeated comparisons happen

For large input:
~~~java
O(n²)
~~~

becomes inefficient.

---

# Optimization

Since array is sorted:
> Two Pointer Approach can solve this in O(n)

---

# Brute Force vs Two Pointer

| Approach | Time Complexity |
|-----------|----------------|
| Brute Force | O(n²) |
| Two Pointer | O(n) |

---

# Important Interview Points

- Brute force checks all pairs
- Uses nested loops
- Works for sorted and unsorted arrays
- Not optimized
- Easy to understand and implement
