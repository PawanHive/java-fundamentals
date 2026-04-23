

# #4: Creation of 2D Arrays

`n` - represents `rows`
`m` - represents `columns`

`n = matrix.length;`
`m = matrix[0].length;`

# -------------------------------------------------------------------------------------------------------

# #7: Spiral Matrix 

## 📌 Problem Statement
Given a 2D matrix, print all elements in **spiral order (clockwise)**.

---

## 🧠 Idea

We traverse the matrix layer by layer using boundaries:

- `startRow` → top row
- `endRow` → bottom row
- `startCol` → left column
- `endCol` → right column

👉 In each loop, we print:
1. Top boundary (left → right)
2. Right boundary (top → bottom)
3. Bottom boundary (right → left)
4. Left boundary (bottom → top)

Then we shrink the boundaries inward.

---

## ⚙️ Algorithm

1. Initialize:
   - `startRow = 0`
   - `startCol = 0`
   - `endRow = n - 1`
   - `endCol = m - 1`

2. While `startRow <= endRow` AND `startCol <= endCol`:
   - Print top row
   - Print right column
   - Print bottom row (if valid)
   - Print left column (if valid)
   - Shrink boundaries

---

# -------------------------------------------------------------------------------------------------------

# #8: Diagonal Sum

## 📌 Problem Statement
Given a **square matrix**, find the **sum of its primary and secondary diagonals**.

---

## 🧠 Key Concepts

- **Primary Diagonal** → elements where `i == j`  
  👉 Top-left → Bottom-right  

- **Secondary Diagonal** → elements where `i + j == n - 1`  
  👉 Top-right → Bottom-left  


# ------------------------
# 🐢 Brute Force Approach
# ------------------------

## ⚙️ Idea
Traverse the entire matrix and check:
- If `i == j` → add primary diagonal  
- If `i + j == n - 1` → add secondary diagonal  

## ⏱️ Complexity
- Time → **O(n²)**  

# ------------------------
# ⚡ Optimized Approach
# ------------------------

## 🧠 Idea

- Directly access diagonal elements using index
- Avoid full traversal
- Avoid double counting of middle element


## ⚙️ Algorithm

1. Traverse only one loop (`i = 0 → n-1`)
2. Add primary diagonal → `matrix[i][i]`
3. Add secondary diagonal → `matrix[i][n-1-i]`
4. If both indices point to same element, add only once

## ⏱️ Complexity
- Time → **O(n)** 