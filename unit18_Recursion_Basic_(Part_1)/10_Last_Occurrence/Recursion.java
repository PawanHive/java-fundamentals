// Write a function to find the LAST occurence of an element in an array

public class Recursion {
  public static int lastOccurence(int arr[], int key, int i) {
    if (i == arr.length) { // base case
      return -1;
    }

    // go deeper first
    int isFound = lastOccurence(arr, key, i+1);

    // if found later, return that ... otherwise check current position
    if(isFound == -1 && arr[i] == key) {
      return i;
    }

    return isFound;
  }
  public static void main(String[] args) {
    int arr[] = {5, 5, 5, 5};
    System.out.println(lastOccurence(arr, 5, 0));
  }
}
