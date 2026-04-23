# #8: Diagonal Sum

## 📌 Problem Statement
Given a **square matrix**, find the **sum of its primary and secondary diagonals**.

---

## 🧠 Key Concepts

- **Primary Diagonal** → elements where `i == j`  
  👉 Top-left → Bottom-right  

- **Secondary Diagonal** → elements where `i + j == n - 1`  
  👉 Top-right → Bottom-left  

---


# ------------------------
# 🐢 Brute Force Approach

## ⚙️ Idea
Traverse the entire matrix and check:
- If `i == j` → add primary diagonal  
- If `i + j == n - 1` → add secondary diagonal  

---

## ⏱️ Complexity
- Time → **O(n²)**  


---

# ------------------------
# ⚡ Optimized Approach
# ------------------------

## 🧠 Idea

- Directly access diagonal elements using index
- Avoid full traversal
- Avoid double counting of middle element

---

## ⚙️ Algorithm

1. Traverse only one loop (`i = 0 → n-1`)
2. Add primary diagonal → `matrix[i][i]`
3. Add secondary diagonal → `matrix[i][n-1-i]`
4. If both indices point to same element, add only once

---
## ⏱️ Complexity
- Time → **O(n)** 