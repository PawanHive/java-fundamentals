import java.util.*;

public class Main {

  public static void insertionSort(int arr[]) {

    // Outer loop: picks elements one by one
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i]; // current element to insert
      int prev = i - 1;  // index of last sorted element
      
      // shift elements of sorted part to the right
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }

      // place current element at correct position
      arr[prev + 1] = curr;
    }
  }

  // print fuction
  public static void printInsertion(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {5, 4, 1, 3, 2};

    insertionSort(arr);
    printInsertion(arr);  
  }
}