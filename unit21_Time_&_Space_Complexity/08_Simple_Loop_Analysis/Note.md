
```java
// n = arr.length
void printAll(int[] arr) {
  for (int i = 0; i < n; i++) { // runs n times
    System.out.println(arr[i]); // 1 op per iteration
  }
}
```

Loop runs = `n` times
Work per iteration = `1` operation
Total = `n * 1 = n`  (// as we know we have to ignore constant '1')
Simplified = `O(n)`