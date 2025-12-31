# Lesson 1: Introduction to Big O Notation

In Data Structures and Algorithms, we don't just care if a solution works; we care about **how well** it works as the input grows. This is where Big O notation comes in.

## What is Big O?
Big O notation is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity. In DSA, it's used to classify algorithms according to how their run time or space requirements grow as the input size ($n$) grows.

## Common Time Complexities

| Notation | Name | Example |
| :--- | :--- | :--- |
| **O(1)** | Constant Time | Accessing an array element by index. |
| **O(log n)** | Logarithmic Time | Binary Search. |
| **O(n)** | Linear Time | Single loop through an array. |
| **O(n log n)** | Linearithmic Time | Efficient sorting (Merge Sort, Quick Sort). |
| **O(n²)** | Quadratic Time | Nested loops (Bubble Sort). |
| **O(2ⁿ)** | Exponential Time | Simple recursive Fibonacci. |
| **O(n!)** | Factorial Time | Generating all permutations. |

## Why it Matters
Imagine you have a list of names and you want to find one.
- If you check every name one by one (**O(n)**), and there are 1,000,000 names, it might take some time.
- If the list is sorted and you use Binary Search (**O(log n)**), you'll find the name in about 20 steps.

## Exercise
Think about a simple loop that prints numbers from 1 to $n$. What is its time complexity? (Answer: it's O(n) because the number of operations grows linearly with $n$).

---
Next, we'll set up our Java environment and implement our first simple algorithm!
