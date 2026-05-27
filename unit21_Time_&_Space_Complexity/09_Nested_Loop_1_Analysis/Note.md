# Nested Loops & Time Complexity

## The golden rule of nested loops:
- Nested loops multiply.
- Sequential loops add.

# -------------------------------------------------------------------------------------------------------

##  Example 1 — Basic Nested Loop → O(n²)

```java
void printPairs(int n) {
  for (int i = 0; i < n; i++) { // runs n times
    for (int j = 0; j < n; j++) { // runs n times each
      System.out.println(i + " " + j); // 1 op
    }
  }
}
```

### Visualising for n = 4

Every `(i, j)` pair gets printed:

```text
0,0
0,1
0,2
0,3
1,0
1,1
1,2
1,3
2,0
2,1
2,2
2,3
3,0
3,1
3,2
3,3
```

`4 × 4 = 16` total pairs printed

| What | Count |
|---|---|
| Outer loop | `n` times |
| Inner loop per outer iteration | `n` times |
| Total | `n × n = n²` |
| Simplified | `O(n²)` |

# -------------------------------------------------------------------------------------------------------

## Example 2 — Inner Loop Depends on Outer → O(n²)

```java
void triangle(int n) {
  for (int i = 0; i < n; i++) { // runs n times
    for (int j = 0; j < i; j++) { // runs i times!
      System.out.println(i + " " + j);
    }
  }
}
```

`i = 0 → 0 times`  
`i = 1 → 1 time`  
`i = 2 → 2 times`  
and so on...

### Visualising for n = 4 (Triangle Shape)

```text
-
-
-
-
1,0
-
-
-
2,0
2,1
-
-
3,0
3,1
3,2
-
```

`0 + 1 + 2 + 3 = 6`

Formula:

```text
`n(n - 1) / 2 ≈ n² / 2`
```

| What | Count |
|---|---|
| Total iterations | `0 + 1 + 2 + ... + (n - 1) = n(n - 1)/2` |
| Simplified | `n²/2 → drop constant` |
| Result | `O(n²)` |

**Even though the inner loop runs fewer times (triangle, not square), it's still `O(n²)` because constants are ignored.**

# -------------------------------------------------------------------------------------------------------


# Example 3 — Triple Nested Loop → O(n³)

```java
void tripleLoop(int n) {
  for (int i = 0; i < n; i++) { // n times
    for (int j = 0; j < n; j++) { // n times
      for (int k = 0; k < n; k++) { // n times
        System.out.println(i + j + k);
      }
    }
  }
}
```

| What | Count |
|---|---|
| Outer loop | `n` times |
| Middle loop | `n times each |
| Inner loop | `n` times each |
| Total |` n × n × n = n³` |
| Simplified |` O(n³)` |

**Every extra nesting level multiplies by another `n`.**

- 2 loops → `O(n²)`
- 3 loops → `O(n³)`

**Triple nested loops become very slow for large inputs.**

# -------------------------------------------------------------------------------------------------------


# Example 4 — Outer O(n), Inner O(log n) → O(n log n)

```java
void nLogN(int n) {
  for (int i = 0; i < n; i++) { // n times
    for (int j = 1; j < n; j = j * 2) { // log n times
      System.out.println(i + " " + j);
    }
  }
}
```

| What | Count |
|---|---|
| Outer loop | `n` times |
| Inner loop (`j *= 2`) | `log n` times |
| Total | `n × log n `|
| Simplified | `O(n log n)` |

## Why is inner loop O(log n)?

Because `j` doubles every iteration:

```text
1 → 2 → 4 → 8 → 16 ...
```

This grows exponentially, so total iterations become `log n`.

Nested loops multiply:

```text
`O(n) × O(log n) = O(n log n)`
```

This is the same complexity used in algorithms like Merge Sort.

---