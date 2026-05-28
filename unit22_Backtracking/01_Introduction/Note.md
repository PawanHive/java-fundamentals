# Backtracking

## What is Backtracking?

Backtracking is a technique where you build a solution step by step, and whenever you reach a point where the current path can't lead to a valid answer, you undo the last step and try a different option.

Think of it like navigating a maze.

- You walk down a corridor
- If you hit a dead end, you don't start over from scratch
- You go back to the last junction and try a different turn

That "going back" is called **backtracking**.

---

## How Backtracking Works

In code, backtracking is usually implemented using **recursion**.

At each step:

1. Make a choice
2. Recurse deeper
3. If it doesn't work out, undo the choice (**backtrack**) and try the next one

---

# Core Pattern of Backtracking

Every backtracking solution follows this general skeleton:

```java
solve(current_state):

    if current_state is a valid complete solution:
        record/return it

    for each possible choice:

        make the choice

        solve(next_state)      # recurse

        undo the choice        # backtrack
```
