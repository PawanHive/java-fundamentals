import java.util.*;

public class Main {

  public static void max_subarray_sum(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    // outer loop
    for (int i = 0; i < numbers.length; i++) {
      int start = i; 
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        currSum = 0; // current sum reset here after every array
        for (int k = start; k <= end; k++) {
          // Subarray sum
          currSum = currSum + numbers[k];

        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
        // System.out.println();
      }
    } 
    System.out.println("Max sum = " + maxSum);
  }

  public static void main(String[] args) {
    int numbers[] = {1, -2, 6, -1, 3};
    max_subarray_sum(numbers);
    // System.out.println(numbers.length);

  }
}