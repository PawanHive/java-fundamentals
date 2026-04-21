// inbuilt sorting but for specific portion of a given array. (ASCENDING ORDER)
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


/*
we can also print just using single line: 

//  System.out.println(Arrays.toString(arr));
*/