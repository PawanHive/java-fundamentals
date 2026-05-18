// Merge Sort using Recursion.

public class DividenConquer {

  // Print final array
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int arr[], int si, int ei) {

    // base case
    if(si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2; // we can also write (si + ei) / 2;    ....// si = starting index, ei = ending index.
    mergeSort(arr, si, mid); // left part array
    mergeSort(arr, mid+1, ei); // right part array
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    // left(0, 3) = 4 elements, right(4, 6) = 3 elements, total = 7 elements ... here 6=ei and 0=si 
    int temp[] = new int[ei - si + 1]; // REMEMBER: this way to define temp array size. ei. (6 - 0 + 1) = 7 elements ... adding '+1' is very important
    int i = si; // iterator for left part array
    int j = mid+1; // iterator for right part array
    int k = 0; // iterator for temp array

    while (i <= mid && j <= ei) {
      if(arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    // remaining element to left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    // remaining element to right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // copy temp to original arr
    for (k=0, i=si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }
  public static void main(String[] args) {
    int arr[] = {6, 3, 9, 5, 2, 8};
    mergeSort(arr, 0, arr.length-1);
    printArr(arr); // output: 2 3 5 6 8 9
  }
}