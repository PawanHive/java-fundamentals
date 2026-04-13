# #1: Output in Java

1. Print 
```java
System.out.print("Hello World");
```

2. println
```java
System.out.println("Hello World");
```

3. "\n"
```Java 
System.out.println("Hello\nWorld");
```
After "`\n`" space also counts

# -------------------------------------------------------------------------------------------------------

# #2: Variables: 

Syntax: 
```java
dataType variableName = value;
```

Example: 
```java
   a = 10
   b = 5 
   2 * (a + b)
```
**Here:**
`2` - is no. literals
`a`, `b` - is known as indentifier

# -------------------------------------------------------------------------------------------------------

# #3: Data Types

### 1. Primitive Data Types:
Primitive data types are the most basic data types in Java.

| Type  | Size     | Example     | Range |
|------|----------|------------|------|
| byte  | 1 byte   | 10         | -128 to 127 |
| short | 2 bytes  | 1000       | -32,768 to 32,767 |
| int   | 4 bytes  | 100000     | most commonly used |
| long  | 8 bytes  | 100000L    | very large numbers |
| float  | 4 bytes  | 5.5f   |
| double | 8 bytes  | 5.5555 |
| char | 2 bytes | 'A', '9', '$' |
| boolean | | true / false |

### 2. Non-Primitive Data Types
These are created using classes and store objects.

**Examples:**
- String  
- Arrays  
- Classes  
- Objects  

# -------------------------------------------------------------------------------------------------------

# #4: Input in Java

## 1. Most Common Way: Scanner Class

Java provides the **Scanner class** in the `java.util` package to take input.

### Step 1: Import Scanner

```java
import java.util.Scanner;
```

### Step 2: Create Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

👉 This means:
- `System.in` = keyboard input stream
- Scanner reads input from keyboard

**Example:**
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // scanner is java class and 'sc' is scanner object

   //  STRING (word only)
    String input = sc.next(); 
    System.out.println(input);

    // STRING (long)
    String name = sc.nextLine();
    System.out.println(name);

   //  INTEGER
    int number = sc.nextInt();
    System.out.println(number);
  }    
}
```

## 2. Important Scanner Methods

| Method        | Use                |
|--------------|--------------------|
| next()       | One word input     |
| nextLine()   | Full sentence      |
| nextInt()    | Integer number     |
| nextDouble() | Decimal number     |
| nextBoolean() | true / false      |

# -------------------------------------------------------------------------------------------------------

# #5: Type Conversion

**Conversion happens when:**
1. type compatible
2. destination type > source type

### 1. Implicit Type Conversion (Widening)
- Done automatically by Java  
- Smaller data type → Larger data type  
- No data loss (safe)

**Example:**
```java
int a = 10;
double b = a;  // here `double b` is destination and `int a` is source; ()
```

#### Flow (Remember this):

```text
byte → short → char → int → long → float → double
```
👉 Conversion happens automatically from left to right

# #6: Type Casting

Java does NOT allow automatic conversion when:
👉 Bigger data type → Smaller data type  

**Example:**
```java
    // NOT allowed
    float a = 45.234f;
    int b = (int) a; // going from bigger data type -> smaller data type. (so we explicitly saying to convert)
    System.out.println(b);
```

# #7: Type Promotion in Expressions

1. **CASE:** Java automatically promotes each by`te, `short`, or `char` operand to `int` when evaluating an expression.

2. **CASE:** If one operand is `long`, `float` or `double` the whole expression is promoted to `long`, `float`, or `double` respectively.


**1st Case Example:**
```java
    // all convert to int (in expression)
    short c = 5;
    byte d = 25;
    char e = 'c';
    // byte bt = a + b + c; // error possibley lossy conversion from int to byte (because of express all different data types converted in to 'int')
    byte bt = (byte) (a + b + c);
    System.out.println(bt); // -56
```

**2nd Case Example:**
```java
    // all covert to bigger data type (in expression automatically)
    int k = 10;
    float l = 20.25f;
    long m = 234;
    double n = 30;
    //int ans = k + l + m + n; // error: possible lossy conversion from double to int (means they automatically converted to biggest data types found in expression which i 'double' in this case)
    double ans = k + l + m + n; 
    System.out.println(ans);// output 294.25
```

