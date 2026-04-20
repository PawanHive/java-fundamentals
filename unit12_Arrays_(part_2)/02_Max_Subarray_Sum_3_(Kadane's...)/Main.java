// Max Subarray Sum using (Kadane's algorithm) 
import java.util.*;

public class Main {

  public static void kandanes(int numbers[]) {
    int cs = 0; // "cs" represent 'current Sum'
    int ms = Integer.MIN_VALUE; // "ms" represent 'max Sum'

    for (int i = 0; i < numbers.length; i++) {
      cs = cs + numbers[i];
      if(cs < 0) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }

    System.out.println("our max subarray sum is : " + ms);
  }
  public static void main(String[] args) {
    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    kandanes(numbers);  
  }
}
