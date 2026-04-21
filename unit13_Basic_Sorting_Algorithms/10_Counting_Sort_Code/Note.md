# 🧠 Counting Sort (DSA Notes)

---

# 📌 What is Counting Sort?

Counting Sort is a **non-comparison based sorting algorithm**.

Instead of comparing elements like Bubble Sort or Insertion Sort, it:
- Counts frequency of each element
- Reconstructs the sorted array using those counts

---

# ⚙️ Core Idea

👉 “Count occurrences of each number, then rebuild the array in sorted order.”

---

# 🧩 When to Use Counting Sort?

✔ Works best when:
- Range of numbers is small  
- Elements are non-negative integers  

❌ Not suitable when:
- Range is very large  
- Negative numbers are present (needs modification)

---

# 🔍 Example

Input:
arr = [1, 4, 1, 3, 2, 4, 3, 7]

---

# 🧠 Step 1: Find Maximum Element

max = 7

---

# 🧠 Step 2: Create Count Array

Create an array of size (max + 1):

count[0 → 7]

Initial:
[0, 0, 0, 0, 0, 0, 0, 0]

---

# 🧠 Step 3: Count Frequencies

After counting occurrences:

| Number | Frequency |
|--------|----------|
| 1 | 2 |
| 2 | 1 |
| 3 | 2 |
| 4 | 2 |
| 7 | 1 |

Count array becomes:
[0, 2, 1, 2, 2, 0, 0, 1]

---

# 🧠 Step 4: Rebuild the Array

Traverse the count array and place elements back:

Final Output:
[1, 1, 2, 3, 3, 4, 4, 7]

---

# 💻 Java Implementation

public class Main {

  public static void countingSort(int arr[]) {

    int max = arr[0];

    // find maximum element
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    // create count array
    int count[] = new int[max + 1];

    // store frequency
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // rebuild original array
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

    countingSort(arr);
    printArr(arr);
  }
}

---

# ⏱ Time Complexity

| Case | Complexity |
|------|-----------|
| Best | O(n + k) |
| Worst | O(n + k) |

Where:
- n = number of elements  
- k = range of input values  

---

# 📦 Space Complexity

O(k)

(extra array for counting frequencies)

---

# 💡 Advantages

✔ Very fast for small range inputs  
✔ No comparisons needed  
✔ Simple logic  

---

# ❌ Disadvantages

❌ Uses extra space  
❌ Not efficient for large ranges  
❌ Cannot handle negative numbers directly  

---

# 🧠 One-line Memory Trick

👉 “Counting Sort = Count frequencies → Rebuild array”

---

