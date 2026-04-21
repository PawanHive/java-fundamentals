// bubble sort algorithm

public class Main {

  public static void bubbleSort(int arr[]){
    for (int turn = 0; turn < arr.length-1; turn++) {
      for (int j = 0; j < arr.length-1-turn; j++) {
        if (arr[j] > arr[j+1]) {
          // SWAP
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  // print sorted array
  public static void printBubble(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {5, 4, 1, 3, 2};
    bubbleSort(arr);
    printBubble(arr);
  }
}
