/*
Activity Selection:

You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that person can only work on a single activity at a time. Activities are sorted according to end time.

start = {1, 3, 0, 5, 8, 5};
end = {2, 4, 6, 7, 9, 9};

output: we want: 
max activities = 4
A0 A1 A3 A4 

Time Complexity : O(n)

# Similar Questions comes in interview on this same approach is : 
- Disjoint Set
- maximum Meetings in a room
*/

import java.util.ArrayList;

public class Greedy {

  public static void main(String[] args) {
    int start[] = {1, 3, 0, 5, 8, 5};
    int end[] = {2, 4, 6, 7, 9, 9};

    // end time basis sorted
    int maxAct = 0; // maximum activity;
    ArrayList<Integer> ans = new ArrayList<>();

    // 1st Activity
    maxAct = 1;
    ans.add(0);
    int lastEnd = end[0];
    
    for (int i=1; i<end.length; i++) {
      if(start[i] >= lastEnd) {
        // activity select
        maxAct++;
        ans.add(i);
        lastEnd = end[i];
      }
    }

    System.out.println("max activities = " + maxAct);
    for(int i=0; i<ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");
    }
    System.out.println();
  }
}