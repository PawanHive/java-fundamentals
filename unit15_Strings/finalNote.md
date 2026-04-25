# #1: What is String;

### 🔹 Ways to Create String

#### 1. Using String Literal (Most common)

~~~java
String str = "Hello";
~~~

#### 2. Using `new` keyword

~~~java
String str = new String("Hello");
~~~

---

### 🔹 String is Immutable (🔥 Key Concept)

Once a string is created, **it cannot be changed**.

#### Example:

~~~java
String str = "Hello";
str = str + " World";
~~~

👉 Here:
- `"Hello"` is NOT changed  
- A **new string** `"Hello World"` is created  

# #2: Input Output:

## 🔹 String Input (Java)

- `sc.next()` → takes **single word** (stops at space)  
- `sc.nextLine()` → takes **full line (with spaces)**  

~~~java
String name = sc.next();
String fullName = sc.nextLine();
~~~

# #3: String Length: 
**String length** means the **number of characters** present in a string.

`length()` is a method, so we use `()`

# #5: String charAt method:
The charAt() method is used to get a character at a specific index from a string.
```java
str.charAt(index);
```

# #6: Check if a String is Palindrome:
## 📌 Problem Statement
Given a string, check whether it is a **palindrome** or not.

👉 A string is a palindrome if it reads the same:
- From left to right  
- And right to left  

Example:
```
"noon", "madam", "racecar"
```

---

## 🧠 Idea

We compare characters from both ends of the string:
- Start from index `0`
- End from index `n - 1`
- Move towards the middle

👉 If any mismatch is found → not a palindrome  
👉 If all match → palindrome

---

## ⚙️ Algorithm

1. Get the length of the string `n`
2. Loop from `i = 0` to `n/2`
3. Compare:
   - `str[i]` with `str[n - 1 - i]`
4. If mismatch found → return `false`
5. If loop completes → return `true`

-
## Complexity: O(n)

# #7: Question - Shortest Path

## 📌 Problem Statement
Given a string containing directions:
- `N` → North
- `S` → South
- `E` → East
- `W` → West  

Find the **shortest distance from the origin (0,0)** after following all directions.

---

## 🧠 Idea

We only track the **final position (x, y)** instead of full movement path.

Then apply distance formula:
```
√(x² + y²)
```

---

## ⚙️ Algorithm

1. Initialize `x = 0`, `y = 0` (starting point).
2. Traverse each character of the string.
3. For each direction:
   - If `N` → increment `y`
   - If `S` → decrement `y`
   - If `E` → increment `x`
   - If `W` → decrement `x`
4. After traversal, compute:
   - `x² + y²`
5. Return square root of the result.

---

# #8: String_Functions-compare

## 🔹 String `.equals()` in Java

- `.equals()` is used to compare **string content (value)**  
- `==` compares **memory location**, not value  
- `.equals()` is **case-sensitive**

~~~java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b)); // true
~~~

# #9: String Functions substring() 

## 🔹 substring() in Java

- `substring()` is used to **extract part of a string**  
- `substring(start)` → from start to end  
- `substring(start, end)` → from start to end-1  
- Index starts from 0  

~~~java
String str = "HelloWorld";
System.out.println(str.substring(0, 5)); // Hello
~~~

# #10: Print largest String (lexicographically): 

- Lexicographic order = **dictionary order**
- `compareTo()` compares strings **character by character**
- Returns:
  - `0` → equal
  - `+ve` → first string is greater
  - `-ve` → first string is smaller

  ## 🔸 Return Values of `compareTo()`

| Condition | Result |
|----------|--------|
| str1 == str2 | 0 |
| str1 > str2 (lexicographically) | +ve value |
| str1 < str2 | -ve value |

---

~~~java
String a = "apple";
String b = "banana";

System.out.println(a.compareTo(b)); // negative value
~~~

# #12: StringBuilder

### 🔸 What is StringBuilder?

`StringBuilder` is a **mutable class in Java** used to create and modify strings efficiently without creating new objects every time.

👉 Used when we do **many string modifications**

---

## 🔸 Why StringBuilder?

- String is immutable → creates new object every time  
- StringBuilder modifies the **same object**  
- Faster and **memory efficient**

---

## 🔸 How to Create

~~~java
StringBuilder sb = new StringBuilder("Hello");
~~~

---

## 🔸 Common Methods

- `append()` → add text  
- `insert()` → insert at index  
- `delete()` → remove part  
- `reverse()` → reverse string  

---

# #13: Convert Letter to Uppercase

## 📌 Problem Statement
Given a string, convert the **first letter of each word to uppercase**.

Example:
```
Input  → "hi, i am shradha"
Output → "Hi, I Am Shradha"
```

---

## 🧠 Idea

- Convert the **first character** to uppercase
- Then for every character:
  - If previous character is a **space**
  - Convert current character to uppercase

---

## ⚙️ Algorithm

1. If string is empty → return it
2. Create a `StringBuilder` for result
3. Convert first character to uppercase and add to result
4. Traverse string from index `1`
5. For each character:
   - If previous character is space and current is not space  
     → convert to uppercase  
   - Else → add character as it is
6. Return final string

---

# #14: String Compression:

## 📌 Problem Statement
Given a string, compress it by replacing **repeating characters** with:
- character + count

👉 Only add count if it is greater than 1.

Example:
```
Input  → "aaabbcccdd"
Output → "a3b2c3d2"
```

---

## 🧠 Idea

- Traverse the string
- Count consecutive repeating characters
- Append:
  - character
  - count (only if > 1)

---

## ⚙️ Algorithm

1. Create a `StringBuilder` for result
2. Traverse the string using index `i`
3. Initialize `count = 1`
4. While next character is same:
   - increment `count`
   - move index forward
5. Append current character to result
6. If `count > 1`, append count
7. Repeat for all characters
8. Return final string

---
## ⏱️ Time Complexity

- **O(n)** → single traversal