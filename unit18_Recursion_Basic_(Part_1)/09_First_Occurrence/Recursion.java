// Write a function to find the FIRST occurence of an element in an array

public class Recursion {
  public static int firstOccurence(int arr[], int key, int i) {
    if (i == arr.length-1) { // base case condition
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstOccurence(arr, key, i+1); // recursive function
    
  }
  public static void main(String[] args) {
    int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
    System.out.println(firstOccurence(arr, 5, 0));// output: 4    // means at 4th index first time key = 5 occur
  }
}
