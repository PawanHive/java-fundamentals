import java.util.*;

public class Main {

  public static void selectionSort( int arr[]) {
    //outer loop
    for (int i = 0; i < arr.length; i++) {
      int minPos = i; // "minPos" represent set current position for smallest element found;
      for (int j=i+1; j < arr.length; j++) {
        if(arr[minPos] > arr[j]) { // make array in increase order, if we make this condition opposite then this will give array in decreasing order.
          minPos = j;
        }
      }

      // SWAP
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
    }
  }

  public static void printSelection(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print( arr[i] + " ");
    }
  }


  public static void main(String[] args) {
    int arr[] = {5, 4, 1, 3, 2};
  selectionSort(arr);
  printSelection(arr);
  }
}