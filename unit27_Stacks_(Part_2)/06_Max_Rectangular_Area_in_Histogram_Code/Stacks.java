/*
Max Area in Histogram

Given an array of integers heights representing the histogram's bar height where the 
width of each bar is 1, return the area of the largest reactangle in the histogram.

input: heights = [2, 1, 5, 6, 2, 3]

output: 10

Time Complexity: O(n)
*/

import java.util.Stack;

public class Stacks {
  public static void maxArea (int arr[]) {
    int maxArea = 0;
    int nsr[] = new int[arr.length]; // nsr stand for (next smaller right)
    int nsl[] = new int[arr.length]; // nsl stand for (next smaller left)

    // -------------------------- STEP 1: Next Smaller Right -- TC: O(n) --------------------------------------
    Stack<Integer> s = new Stack<>();

    for (int i=arr.length-1; i>=0; i--) { // loop running from right to left
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }

      if(s.isEmpty()) { 
        nsr[i] = arr.length; // means = n
      } else {
        nsr[i] = s.peek();
      }

      s.push(i);
    }

    // ---------------------------- STEP 2: Next Smaller left -- TC: O(n) ---------------------------------
    s = new Stack<>();

    for (int i=0; i<arr.length; i++) { // loop running from left to right
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }

      if(s.isEmpty()) { 
        nsl[i] = -1;
      } else {
        nsl[i] = s.peek();
      }

      s.push(i);
    }

    // ------------------------- STEP 3: Current Area -- TC: O(n) ---------------------------------------
    // widht = j-i-1 = nsr[i]-nsl[i]-1, and height we can directly access
    for (int i=0; i<arr.length; i++) {
      int height = arr[i];
      int widht = nsr[i] - nsl[i] -1;
      int currArea = height * widht;
      maxArea = Math.max(currArea, maxArea);
    }

    System.out.println("max area in histogram = " + maxArea);
  }
  public static void main(String[] args) {
    int arr[] = {2, 1, 5, 6, 2, 3}; // heights in histogram
    maxArea(arr);
  }
}
