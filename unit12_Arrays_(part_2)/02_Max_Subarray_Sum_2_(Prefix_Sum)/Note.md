# code snippet explained

```java
// Max Subarray Sum using Prefix Sum Technique

import java.util.*;

public class Main {

  public static void max_subarray_sum(int numbers[]) {

    // stores sum of current subarray
    int currSum = 0;

    // stores maximum subarray sum found so far
    int maxSum = Integer.MIN_VALUE;

    // prefix array to store cumulative sum
    int prefix[] = new int[numbers.length];

    // initialize first element of prefix array
    prefix[0] = numbers[0];

    // build prefix sum array
    // prefix[i] = sum of elements from 0 to i
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + numbers[i];
    }

    // fix starting index of subarray
    for (int i = 0; i < numbers.length; i++) {

      int start = i;

      // fix ending index of subarray
      for (int j = i; j < numbers.length; j++) {

        int end = j;

        // calculate subarray sum using prefix sum formula
        // case 1: subarray starts from index 0
        if (start == 0) {
          currSum = prefix[end];
        } 
        // case 2: subarray starts from index > 0
        else {
          currSum = prefix[end] - prefix[start - 1];
        }

        // update maximum sum if current sum is greater
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }

    // print final maximum subarray sum
    System.out.println("max sum = " + maxSum);
  }

  public static void main(String[] args) {

    // input array
    int numbers[] = {1, -2, 6, -1, 3};

    // function call
    max_subarray_sum(numbers);
  }
}
```