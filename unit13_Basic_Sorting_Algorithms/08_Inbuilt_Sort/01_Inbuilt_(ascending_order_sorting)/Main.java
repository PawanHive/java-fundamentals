// using INBUILT sort algorithm (ASCENDING ORDER)

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


/*
we can also print just using single line: 

//  System.out.println(Arrays.toString(arr));
*/