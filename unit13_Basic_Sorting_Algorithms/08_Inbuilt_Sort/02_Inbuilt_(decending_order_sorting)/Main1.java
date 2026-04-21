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
