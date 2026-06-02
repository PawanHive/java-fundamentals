/*
Next Greater Element (right side)

The next greater element of some element x in an array is the first greater element that is to the 
right of X in the same array

input: arr = [6, 8, 0, 1, 3]
output: next Greater = [8, -1, 1, 3, -1]

TC is : O(n)
*/

import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {
    int arr[] = {6, 8, 0, 1, 3};
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];

    for (int i=arr.length-1; i>=0; i--) {
      // STEP 1: while loop running from righ to left
      while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }

      // STEP 2: if-else
        if(s.isEmpty()) {
          nextGreater[i] = -1; // if no greater element the print -1
        } else {
          nextGreater[i] = arr[s.peek()]; // if greater element exit then print that
        }

      // STEP 3: push in s
      s.push(i);  
    }

    // Print next greater
    for (int i=0; i<nextGreater.length; i++) {
      System.out.print(nextGreater[i] + " ");
    }
    System.out.println(); //output: 8 -1 1 3 -1 
  }
}


/*
Different form of the same questions: 

// next greater (right side) element
// next greater (left side) element
// next smaller (right side) element
// next smaller (left side) element
*/