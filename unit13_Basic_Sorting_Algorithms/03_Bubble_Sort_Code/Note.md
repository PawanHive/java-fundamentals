# Bubble Sort Code

**Idea:** 
large elements come to the end of array by swapping with adjacent elements


# `Main.java` Code nippet explained 

```java
// Bubble Sort Algorithm
// Repeatedly compares adjacent elements and swaps them if they are in wrong order
// Largest element "bubbles up" to the end in each pass

public class Main {

  public static void bubbleSort(int arr[]) {

    // Outer loop = number of passes (turns)
    // Each pass places the next largest element at correct position
    for (int turn = 0; turn < arr.length - 1; turn++) {

      // Inner loop = compares adjacent elements
      // After each turn, last 'turn' elements are already sorted, so we reduce range
      for (int j = 0; j < arr.length - 1 - turn; j++) {

        // If current element is greater than next element, swap them
        if (arr[j] > arr[j + 1]) {

          // Swap logic
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // Function to print array elements
  public static void printBubble(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(); // move to next line after printing
  }

  public static void main(String[] args) {

    // Input array (unsorted)
    int arr[] = {5, 4, 1, 3, 2};

    // Call bubble sort function
    bubbleSort(arr);

    // Print sorted array
    printBubble(arr);
  }
}
```