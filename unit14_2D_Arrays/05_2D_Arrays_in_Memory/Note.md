# 2D Arrays in Memory (Java)

## 📌 What is a 2D Array?

A 2D array in Java is **not a single continuous block**.  
It is an **array of arrays**.

---

## 🧠 Memory Structure

Example:
```java
int matrix[][] = {
  {1, 2, 3},
  {4, 5, 6}
};
```

### 🔹 How it looks in memory:

```
matrix
  ↓
[ ref0 ][ ref1 ]   ← outer array (rows)
   ↓        ↓
[1 2 3]  [4 5 6]   ← inner arrays (columns)
```

- Outer array stores **references (addresses)**
- Each row is a **separate array in memory**

---

## 📌 Key Properties

- `matrix.length` → number of rows  
- `matrix[i].length` → number of columns in that row  
- Rows are **not continuous with each other**
- Elements inside a row **are continuous**

---

## ⚠️ Jagged Arrays (Important)

Rows can have different sizes:

```java
int arr[][] = {
  {1, 2},
  {3, 4, 5},
  {6}
};
```

---

# 🔁 Difference: 1D vs 2D Array Memory

## 🔹 1D Array

```java
int arr[] = {10, 20, 30};
```

### Memory:
```
[10][20][30]
```

✔ Continuous memory  
✔ Direct address calculation  
✔ Faster access (O(1))

---

## 🔹 2D Array

```java
int matrix[][] = {
  {1, 2, 3},
  {4, 5, 6}
};
```

### Memory:
```
[ref][ref]
  ↓     ↓
[1 2 3] [4 5 6]
```

❌ Not fully continuous  
✔ Array of arrays  
✔ Flexible (jagged allowed)

---

# 🔥 Final Summary

- 1D array → **single continuous block**
- 2D array → **array of references to rows**
- Java 2D arrays are **not true matrices in memory**
```