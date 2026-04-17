# #1: Function Syntax:

**Syntax:**
```java
returnType methodName(parameters) {
    // code to be executed
    return value; // optional (depends on returnType)
}
```
**Breakdown**
`returnType` → what the function returns (`int`, `double`, `String`, `void`, etc.)
`methodName` → name of the function
`parameters` → inputs (optional)
`return` → sends value back (only if returnType is not `void`)

**Example:**

```java
  public static void printHelloWorld() {
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
  }
```

# #2: Syntax with Paramters:

**Syntax:**
```java
returnType name (type param1, type param2) {
  // body
return value;
};
```

# #3: Paramters vs Arguments

```java
returnTpe functionName (type param1, type param2) { // parameters or formal parameters
  // body
  return value;
}

functionName(argument);  // arguments or actual parameters
```

# #4: Call by Value (in Java):
A copy of the value is passed to the function, not the original variable.

**Example:**

```java
public class Main {
  
  public static void swap(int a, int b) {
    // swap 
    int temp = a;
    a = b;
    b = temp;

    // These changes are only happening to COPIES
    System.out.println("Inside swap:");
    System.out.println("a = " + a); // 10
    System.out.println("b = " + b); // 5

  }
  public static void main(String[] args) {
    // Swap - values exchage
    int a = 5;
    int b= 10;

    System.out.println("Before swap:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // Passing values → Java creates COPIES of a and b
    swap(a, b);

    // Original values remain unchanged
    // because Java uses CALL BY VALUE
    System.out.println("After swap in main function:");
    System.out.println("a = " + a); // still 5
    System.out.println("b = " + b); // still 10
  }
}

```
- Java passes **copy of values**, not original variables
- `swap(a, b)` → copies of `a` and `b` go into method
- Changes inside `swap()` **do not affect original values**

# #5: Function Overloading: 
**means:**
You can create multiple methods with the same name but with different parameters.

## 1: Function Overloading using Parameters:

**Example:**
```java
public class Main {
  // func to calc sum of 2 numbers
  public static int add(int a, int b) {
    return a + b;
  }
  // func to calc sum of 3 numbers
  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    System.out.println(add(2, 3));
    System.out.println(add(9, 8, 5));
  }
}
```
### What is happening here?

- `add(int, int)` → adds 2 numbers  
- `add(int, int, int)` → adds 3 numbers  

👉 Same name: `add()`  
👉 Different parameters

## 2: Function Overloading using Data Types:

**Example:**
```java
public class Main {
  // func to calc int sum
  public static int sum(int a, int b) {
    return a + b;
  }
  
  // func to calc float sum
  public static float sum(float a, float b) {
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println(sum(3, 5));
    System.out.println(sum(3.3f, 4.5f));
  }
}
```
- `add(int, int)` → adds 2 int numbers  
- `add(float, float)` → adds 2 float numbers  

👉 Same name: `add()`  
👉 Different Data Types


# #6: Check if a numbr is Prime or not?

**Stick to to Wall**
```java
public class Main {

  //is number prime or not?

  // only for n >= 2
  public static boolean isPrime(int n) {
    // corner cases //2
    if(n == 2) {
      return true;
    }

    for(int i = 2; i <= n-1; i++) {
      if(n % i == 0) { //completely dividing
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }
}
```