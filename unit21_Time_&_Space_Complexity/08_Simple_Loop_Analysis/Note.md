
# How to find time and space complexity theoretically.

## The core idea -- ask 3 Questions:

- `step 1:` How many times does the loop run?
- `step 2:` How much work happens inside each iteration?
- `step 3:` Multiply them -> that's your total operations

## Exmaple 1 -- basic loop -> `O(n)`

```java
// n = arr.length
void printAll(int[] arr) {
  for (int i = 0; i < n; i++) { // runs n times
    System.out.println(arr[i]); // 1 operation per iteration
  }
}
```
| WHAT  | COUNT |
|-------|-------|
| Loop runs | `n` times |    
|  Work per iteration | `1` operation | 
|  Total | `n * 1 = n`  | 
|  simplified | `O(n)`  | 

# -------------------------------------------------------------------------------------------------------

## Exmaple 2 -- loop with constant work -> `O(n)`

```java
void process(int[] arr) {
  for (int i = 0; i < n; i++) { // runs n times
    int x = arr[i] * 2; // op 1
    int y = x + 10; // op 2
    System.out.println(y); // op 3
  }
}
```

| WHAT  | COUNT |
|-------|-------|
| Loop runs | `n` times |    
|  Work per iteration | `3` operation | 
|  Total | `n * 3 = 3n`  | 
|  Drop Constant | `3n --> n`  | 
|  simplified | `O(n)`  | 

**Even though there are 3 operations inside, constants are dropped. Still `O(n)`.**

# -------------------------------------------------------------------------------------------------------

## Example 3 -- loop that steps by 2 -> O(n)

```java
void skipOne(int[] arr) {
  for (int i = 0; i < n; i += 2) { // steps by 2
    System.out.println(arr[i]);
  }
}
// i = 0, 2, 4, 6 ... → runs n/2 times
```

| WHAT  | COUNT |
|-------|-------|
| Loop runs | `n/2` times |    
|  Work per iteration | `1` operation | 
|  Total | `n/2 * 1 = n/2`  | 
|  Drop Constant | `n/2 --> n`  | 
|  simplified | `O(n)`  | 

**Stepping by 2 only halves the iterations -- still linear growth. n/2 -> O(n) after dropping the constant.**

# -------------------------------------------------------------------------------------------------------

## Example 4 -- loop that halves -> O(log n)

```java
void halvingLoop(int n) {
  for (int i = n; i >= 1; i = i / 2) { // halves each time
    System.out.println(i);
  }
}
// n=16: i = 16→8→4→2→1 (4 steps = log₂16)
```
- n = 16 -> 16, 8, 4, 2, 1 --> **4 Iteration**($\log_2(16)$ = 4)
- n = 32 -> 32, 16, 8, 4, 2, 1 --> **5 Iteration** ($\log_2(16)$ = 5)
- n = 1024 -> **10 iteration** -->  ($\log_2(16)$ = 10)


| WHAT  | COUNT |
|-------|-------|
| Loop runs | `log n` times |    
|  Work per iteration | `1` operation | 
|  simplified | `O(log n)`  |

# -------------------------------------------------------------------------------------------------------


## Example 5 -- two separate loops -> o(n)

```java
void twoLoops(int[] arr) {
  for (int i = 0; i < n; i++) { // n ops
    System.out.println(arr[i]);
  }
  for (int i = 0; i < n; i++) { // n ops
    System.out.println(arr[i] * 2);
  }
}
```

| WHAT  | COUNT |
|-------|-------|
| First Loop | `n` operation |    
| Second Loop | `n` operation |     
|  Total | `n + n = 2n`  | 
|  Drop Constant | `2n --> n`  | 
|  simplified | `O(n)`  | 