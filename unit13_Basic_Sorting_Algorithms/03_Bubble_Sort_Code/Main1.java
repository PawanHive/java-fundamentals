// bubble sort algorithm to already sorted array eg.: {1, 2, 3, 4, 5};

public class Main1 {
  
  public static void bubbleSort(int arr[]) {
    int totalSwap = 0;

    //outer loop
    for (int turn = 0; turn < arr.length-1; turn++) {
      int swap = 0; // reset for each pass

      // inner loop - compare adjacent elements
      for (int j = 0; j < arr.length-1-turn; j++) {
        if (arr[j] > arr[j+1]) { // arr[j] represent the index of the current element 
          // SWAP
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swap++;
          totalSwap++;
        }
      }

      if (swap == 0) {
        System.out.println("Array was already sorted");
        break;
      }

    }
    System.out.println("Total swaps happened: " + totalSwap);
  }
  
  public static void printBubble(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    bubbleSort(arr);
    printBubble(arr);
  }
}