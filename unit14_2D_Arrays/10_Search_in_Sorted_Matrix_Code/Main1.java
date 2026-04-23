

public class Main1 {

  // // this was my solution, complexity: O(n^2)
  // public static int sumSecondRow(int nums[][]) {
  //   int sum = 0;
  //   for (int i = 1; i <= nums.length-2; i++) {
  //     for (int j = 0; j < nums[0].length; j++) {
  //       sum = sum + nums[i][j];
  //     }
  //   }
  //   return sum;
  // }  

  // OPTIMAL SOLUTION:
  public static int sumSecondRow(int nums[][]) {
    int sum = 0;
    int i = 1; // second row

    for (int j = 0; j < nums[i].length; j++) {
      sum += nums[i][j];
    }
    return sum;
  }
  public static void main(String[] args) {
    int nums[][] = {
      {1, 4, 9}, 
      {11, 4, 3}, 
      {2, 2, 3}
    };

    System.out.println(sumSecondRow(nums));
  }

}