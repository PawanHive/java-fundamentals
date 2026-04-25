## 🔹 Lexicographic Order + `compareTo()` in Java (Very Important)

---

## 🔸 What is Lexicographic Order?

Lexicographic order means **dictionary order** (like in a dictionary).

👉 Java compares strings **character by character (ASCII / Unicode order)**

### Example:
- `"apple"` comes before `"banana"`
- `"abc"` comes before `"abd"`

---

## 🔸 What is `compareTo()`?

`compareTo()` is used to **compare two strings lexicographically**.

---

## 🔹 Syntax

~~~java
str1.compareTo(str2);
~~~

---

## 🔸 Return Values of `compareTo()`

| Condition | Result |
|----------|--------|
| str1 == str2 | 0 |
| str1 > str2 (lexicographically) | +ve value |
| str1 < str2 | -ve value |

---
