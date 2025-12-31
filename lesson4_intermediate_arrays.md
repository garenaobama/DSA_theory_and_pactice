# Lesson 4: Intermediate Array Problems

Since `findMin` was too easy, let's step up the difficulty! We'll look at two famous problems that require better than "just lopping through" logic.

## 1. Two Sum Problem
**Goal**: Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

- **Brute Force (Easy)**: Use two nested loops to check every pair.
  - **Complexity**: O(n²)
- **Optimized (Harder)**: Use a `HashMap` to store the numbers you've already seen.
  - **Complexity**: O(n) Time, O(n) Space.

## 2. Rotate Array
**Goal**: Rotate an array to the right by `k` steps, where `k` is non-negative.
Example: `[1,2,3,4,5]` rotated by `k=2` becomes `[4,5,1,2,3]`.

- **Hard Challenge**: Can you do it **in-place** with **O(1)** extra space? (Hint: Think about reversing parts of the array).

## 3. Kadane's Algorithm (Maximum Subarray Sum)
**Goal**: Find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example: `[-2,1,-3,4,-1,2,1,-5,4]` -> `[4,-1,2,1]` has sum `6`.

---

# Practice Task: HardArrayProblems.java
I've created `HardArrayProblems.java` for you. It has the boilerplate for these problems. Your goal is to implement them!

- [ ] Implement `twoSum` (try the O(n) approach if you can!).
- [ ] Implement `rotate` (try the in-place reversal trick).
- [ ] Implement `maxSubArray` (Kadane's).

**Note**: Since we use `HashMap` in `twoSum`, you'll see `import java.util.*;` at the top.
