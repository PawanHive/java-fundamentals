

public class Main {

  public static int binarySearch(int numbers[], int key) {
    int start = 0, end = numbers.length-1;   // REMEMBER  this line ( will be same always)

    while (start <= end) {
      int mid = (start + end) / 2;     // REMEMBER this

      // comparison
      if (numbers[mid] == key) { // if found
        return mid;
      }

      if (numbers[mid] < key) { // search right side
        start = mid + 1;
      } else { // search left side
        end = mid -1;
      }

    }
    return -1; // if not found
  }

  public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    int key = 10;  // here we want to find the index of this key.

    System.out.println("Index for key is : " + binarySearch (numbers, key));
  }
}
