/*
Fractional Knapsak

Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

value = [60, 100, 120]
weight = [10, 20, 30]

W = 50 

ans = 240
*/

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
  public static void main(String[] args) {
    int val[] = {60, 100, 120};
    int weight[] = {10, 20, 30};
    int W = 50; // knapsack capacity

    double ratio[][] = new double[val.length][2];
    // 0th col => index; 1st col => ratio

    for (int i=0; i<val.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = val[i] / (double)weight[i];
    }

    // lambda function to sort
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // sorting on the basis of 1st col and in acsending order of ratio

    // but we want in desending order
    int capacity = W;
    int finalVal = 0;
    
    for(int i=ratio.length-1; i>=0; i--) {
      int idx = (int)ratio[i][0];
      if(capacity >= weight[idx]) {
        finalVal += val[idx];
        capacity -= weight[idx];
      } else {
        // include fractional item
        finalVal += (ratio[i][1] * capacity);
        capacity = 0;
        break;
      }
    }
    System.out.println("final value = " + finalVal);
  }
}
