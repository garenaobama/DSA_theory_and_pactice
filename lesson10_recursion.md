# Lesson 10: Recursion

## What is Recursion?
**Recursion** is a programming technique where a function calls itself to solve a smaller instance of the problem.
It consists of two essential parts:
1.  **Base Case**: The condition to stop recursion (prevents infinite loops).
2.  **Recursive Case**: The function calls itself with modified parameters to move closer to the base case.

## How it Works (The Call Stack)
Recursion relies on the **Call Stack** (from Lesson 9!).
*   When `func(5)` calls `func(4)`, `func(5)` pauses and is pushed onto the stack.
*   This continues until the **Base Case** is reached.
*   Then, the stack "unwinds", returning values back up the chain.

## Example: Factorial
`5! = 5 * 4 * 3 * 2 * 1`
Recursive definition: `n! = n * (n-1)!`
*   Base Case: `0! = 1`

```java
int factorial(int n) {
    if (n == 0) return 1;      // Base Case
    return n * factorial(n-1); // Recursive Case
}
```

## Pros & Cons

| Feature | Recursion | Iteration (Loops) |
| :--- | :--- | :--- |
| **Code Style** | often cleaner, shorter, easier for Trees/Graphs | can be more verbose |
| **Memory** | **O(N)** (Stack space overhead) | **O(1)** (usually) |
| **Performance** | Slower (function call overhead) | Faster |
| **Risk** | **StackOverflowError** if too deep | Infinite loops check easier |

## Best Practices
*   **Always define a Base Case** first.
*   **Use for Tree/Graph traversals** (DFS) where iterative solutions are complex.
*   **Avoid for simple loops** (like iterating an array) due to memory overhead.
*   **Memoization**: If a recursive function recalculates the same values (like Fibonacci), cache the results to improve performance (Dynamic Programming).

## Practice Problems

1.  **Calculate Factorial**: Compute `n!`.
2.  **Fibonacci Number**: Find the N-th number in the sequence `0, 1, 1, 2, 3, 5...`
    *   *Challenge*: The naive recursive solution is O(2^N). Can you verify this?
3.  **PowerFunction**: Calculate `x` raised to the power of `n` (`x^n`).
