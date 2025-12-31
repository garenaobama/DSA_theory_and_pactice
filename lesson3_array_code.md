# Lesson 3: Practical Arrays

Let's dive into some code! We've created `ArrayProblems.java` with two classic exercises:

## 1. Finding the Maximum Element
To find the max, we assume the first element is the max and then compare it with every other element.
- **Time Complexity**: **O(n)** because we visit each element once.
- **Space Complexity**: **O(1)** because we only store one variable (`max`).

## 2. Reversing an Array
We use the **Two Pointers** technique here. 
- One pointer starts at the beginning (`start`).
- One pointer starts at the end (`end`).
- We swap them and move towards the middle.
- **Time Complexity**: **O(n/2)** which simplifies to **O(n)**.
- **Space Complexity**: **O(1)** as we swap "in-place" without creating a new array.

## How to run this (once Java is ready)
1. Open your terminal in `d:/dsa`.
2. Compile the code:
   ```bash
   javac ArrayProblems.java
   ```
3. Run it:
   ```bash
   java ArrayProblems
   ```

## Challenge for you
Can you modify `ArrayProblems.java` to also find the **Minimum** element? It's very similar to `findMax`!

---
Next: We'll talk about **Dynamic Arrays** (ArrayList in Java).
