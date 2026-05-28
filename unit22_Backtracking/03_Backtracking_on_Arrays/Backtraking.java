/*
We have to create this array: [1, 2, 3, 4, 5] while recursion and convert it
into this array:[-1, 0, 1, 2, 3] while backtracking means we subtract by 2 while backtrack from each 
element value.
*/

public class Backtraking {

  public static void changeArr(int arr[], int i, int val) {
    // base case
    if(i == arr.length) {
      printArr(arr); // print basecase array (after recursion)
      return;
    }

    // recursion
    arr[i] = val;
    changeArr(arr, i+1, val+1); // recursive function call
    arr[i] = arr[i] - 2; // backtracking step

  }

  // help to print different array after recursion and backtracking.
  public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = new int[5];
    changeArr(arr, 0, 1);
    printArr(arr); // print array (after backtracking)
  }
}