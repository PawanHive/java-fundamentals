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


/*
we can also print just using single line: 

//  System.out.println(Arrays.toString(arr));
*/