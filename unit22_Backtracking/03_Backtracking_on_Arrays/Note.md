# Backtracking on Arrays

## Problem Statement

We have to create this array during recursion:

```text
[1, 2, 3, 4, 5]
```

and convert it into this array during backtracking:

```text
[-1, 0, 1, 2, 3]
```

This is done by subtracting `2` from each element while backtracking.

---

# Main Idea

Backtracking on arrays means:

```text
Modify array during recursion
Undo/change array while returning back
```

The recursion phase fills the array.

The backtracking phase modifies the array while recursion returns.

---

# Java Code

```java
/*
We have to create this array: [1, 2, 3, 4, 5] while recursion and convert it
into this array:[-1, 0, 1, 2, 3] while backtracking means we subtract by 2 while backtrack from each
element value.
*/

public class Backtracking {

    public static void changeArr(int arr[], int i, int val) {

        // Base Case
        if (i == arr.length) {
            printArr(arr); // print array after recursion
            return;
        }

        // Recursion Step
        arr[i] = val;

        changeArr(arr, i + 1, val + 1);

        // Backtracking Step
        arr[i] = arr[i] - 2;
    }

    // Helper function to print array
    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = new int[5];

        changeArr(arr, 0, 1);

        printArr(arr); // print array after backtracking
    }
}
```

---

# Recursion Phase

Initially:

```text
[0, 0, 0, 0, 0]
```

During recursion:

| Step | Array State |
|---|---|
| arr[0] = 1 | [1, 0, 0, 0, 0] |
| arr[1] = 2 | [1, 2, 0, 0, 0] |
| arr[2] = 3 | [1, 2, 3, 0, 0] |
| arr[3] = 4 | [1, 2, 3, 4, 0] |
| arr[4] = 5 | [1, 2, 3, 4, 5] |

Base case reached:

```text
[1, 2, 3, 4, 5]
```

This array gets printed first.

---

# Backtracking Phase

Now recursion starts returning backward.

This line performs the backtracking:

```java
arr[i] = arr[i] - 2;
```

Changes happen like this:

| Index | Before (val) | After (val) |
|---|---|---|
| 4 | 5 | 3 |
| 3 | 4 | 2 |
| 2 | 3 | 1 |
| 1 | 2 | 0 |
| 0 | 1 | -1 |

Final array:

```text
[-1, 0, 1, 2, 3]
```

---

# Final Output

```text
1 2 3 4 5
-1 0 1 2 3
```

---

# Time and Space Complexity:
- `O(n)` for both.

# Important Observation

This line goes deeper into recursion:

```java
changeArr(arr, i + 1, val + 1);
```

This line runs while returning back from recursion:

```java
arr[i] = arr[i] - 2;
```

That returning phase is called:

```text
Backtracking
```
