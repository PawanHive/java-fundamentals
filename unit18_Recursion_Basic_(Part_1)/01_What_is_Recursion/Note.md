# What is Recursion?

Recursion is a method of solving a computational problem where the solution depends on solutions to **smaller instances of the same problem**.

# 📘 Recursion in Java (DSA Notes)

---

## 🔁 What is Recursion?

Recursion is a programming technique where a function **calls itself** to solve a problem.

Instead of solving the entire problem at once:
- Break it into **smaller subproblems**
- Solve each using the same function

---

## 🧠 Core Idea

> “If I can solve a smaller version of the problem, I can solve the bigger one.”

---

## ⚙️ Structure of Recursion

Every recursive function has **2 parts**:

### 1. Base Case (Stopping Condition)
- Condition where recursion stops
- Prevents infinite calls

### 2. Recursive Case
- Function calls itself with smaller input

## 📦 Call Stack Concept

- Each recursive call is stored in **stack memory**
- Calls wait until the base case is reached
- Then results return step-by-step

---

## ⚠️ Important Rules

- Always define a **base case**
- Always move toward the base case
- Reduce problem size in each call

---

## 🚫 Common Mistakes

- Missing base case → Infinite recursion
- Wrong base condition
- Not reducing input size
- Too many recursive calls (inefficient)

## 🧠 Final Intuition

Recursion is like:

📦 A box inside a box inside a box  
→ Reach smallest box (base case)  
→ Then open them one by one (return phase)
