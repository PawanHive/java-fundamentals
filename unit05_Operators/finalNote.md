# #1: Types of Operators:

- Arithmetic Operators (Binary / Unary)
- Relational Operators
- Logical Operators
- Bitwise Opertors 
- Assignment Operators

# #2: Arithmetic Operators:

### Binary Operator: (2 Operands)
`+` 
`-`
`*` 
`/` 
`% ` (modulo) -> give reminder (5 % 3 = 2)

### Unary Operator: (only 1 Operands)

### `++` (increment operator)  -> (a = a + 1)
`++a` (pre-increment)
`a++` (post-increment)

### `--` (decrement operator) -> (a = a - 1)
`--a` (pre-decrement)
`a++` (post-decrement)

**Example:**
```java
// pre-increment
    int a = 10;
    int b = ++a; // (change then assign)
    System.out.println("pre-increment = " + a); // 11
    System.out.println("pre-increment = " + b); // 11

    // post-increment
    int c = 10;
    int d = c++; // (assign then change
    System.out.println("post-increment = " + c); // 11
    System.out.println("post-increment = " + d); // 10

    // pre-decrement
    int e = 10;
    int f = --e; // (change then assign)
    System.out.println("pre-decrement = " + e); // 9
    System.out.println("pre-decrement = " + f); // 9

    // post-decrement
    int g = 10;
    int h = g--; // (assign then change)
    System.out.println("post-decrement = " + g); // 11
    System.out.println("post-decrement = " + h);
```

# #2: Relational Operators

`==` (equal to)
`!=` (not equal to)
`>` (less than)
`<` (greater than)
`>=` (greater than equla to)
`<=`less than equal to

# #3: Logical Operators

`&&` (Logical AND) -> (both should true)
`||` (Logical OR) -> (any one should true)
`!` (Logical NOT)

# #4: Assignment Operator

`= `
`+=` (a = a + 10) -> (a += 10)
`-=` (a = a - 10) -> (a -= 10)
`*=` (a = a * 10) -> (a *= 10)
`/=` (a = a / 10) -> (a /= 10)
