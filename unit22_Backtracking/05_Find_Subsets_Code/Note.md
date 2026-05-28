# Find Subsets (Power Set)

We have to find and print all subsets of a string.

Example:

```text
Input: "abc"
```

Output:

```text
"", a, b, c, ab, ac, bc, abc
```

The empty string `""` is also a subset.

---

# What is a Subset?

A subset means:

```text
Choose some characters and ignore others
```

For every character, we have 2 choices:

```text
1. Include it
2. Exclude it
```

That’s why subsets are a perfect backtracking problem.

---

# Decision Tree Idea

For `"abc"`:

---

## Character 'a'

Choices:

```text
Take 'a'
Don't take 'a'
```

---

## Character 'b'

Again:

```text
Take 'b'
Don't take 'b'
```

---

## Character 'c'

Again:

```text
Take 'c'
Don't take 'c'
```

---

# Total Number of Subsets

Each character has 2 choices.

For `n` characters:

```text
2^n
```

For `"abc"`:

```text
2^3 = 8
```

So total subsets = `8`.


# Java Code

```java
public class Backtraking {
  public static void findSubsets(String str, String ans, int i) {
    // base case
    if(i == str.length()) {
      if(ans.length() == 0) {
        System.out.println("null");
      } else { 
        System.out.println(ans); 
      }
      return;
    }

    // RECURSION
    // Yes choice
    findSubsets(str, ans+str.charAt(i), i+1);
    // No Choice
    findSubsets(str, ans, i+1);
  }
  public static void main(String[] args) {
    String str = "abc";
    findSubsets(str, "", 0);
  }
}
```

---

# Parameters Meaning

| Parameter | Meaning |
|---|---|
| `str` | Original string |
| `ans` | Current subset being formed |
| `i` | Current index |

---

# Dry Run

Initial call:

```java
findSubsets("abc", "", 0);
```

---

# Step 1 → Character 'a'

Two choices:

```text
Take 'a'
Skip 'a'
```

---

# Step 2 → Character 'b'

Again two choices.

---

# Step 3 → Character 'c'

Again two choices.

---

# Recursion Tree

```text
                    ""
                 /      \
               a          ""
             /   \       /   \
           ab     a     b     ""
          / \    / \   / \    / \
       abc  ab  ac  a bc  b  c  ""
```

---

# Output

```text
abc
ab
ac
a
bc
b
c
""
```

Order may vary depending on recursion.

---

# Why This is Backtracking

Because:

- We make a choice
- Go deeper recursively
- Return and try another choice

Pattern:

```java
choose

recurse

undo implicitly by returning
```

---

# Important Observation

In subsets:

```text
Backtracking happens automatically
```

Why?

Because strings are immutable in Java.

We are creating new strings:

```java
ans + str.charAt(i)
```

So no manual undo step is needed.

---

# Time Complexity

For every character:

- 2 choices

So complexity is:

```text
O(2^n)
```

---

# Space Complexity

Maximum recursion depth:

```text
O(n)
```
