
```java
// n = arr.length
void printPairs(int[] arr) {
  for (int i = 0; i < n; i++) {      // runs n times
    for (int j = 0; j < n; j++) {    // runs n times for each i
      System.out.println(i + ", " + j);
    }
  }
}
```