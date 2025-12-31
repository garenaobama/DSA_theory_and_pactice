# Lesson 9: Stacks and Queues

## 1. The Stack (LIFO)
A **Stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. The last element added is the first one removed (like a stack of plates).

### Common Operations
*   `push(x)`: Add `x` to the top.
*   `pop()`: Remove and return the top element.
*   `peek()`: Look at the top element without removing.
*   `isEmpty()`: Check if stack is empty.

### Real-World Use Cases
*   **Function Call Stack**: Tracking function calls and recursion (e.g., if main() calls foo(), foo() is pushed on top).
*   **Undo/Redo**: Editors store actions in a stack. Ctrl+Z pops the last action.
*   **Browser History**: The "Back" button functions like a stack.

## 2. The Queue (FIFO)
A **Queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle. The first element added is the first one removed (like a line at a store).

### Common Operations
*   `enqueue(x)` / `add(x)` / `offer(x)`: Add `x` to the back.
*   `dequeue()` / `remove()` / `poll()`: Remove and return the front element.
*   `peek()`: Look at the front element.

### Real-World Use Cases
*   **Printer Jobs**: Documents are printed in the order they were sent.
*   **Web Server Requests**: Handling incoming user requests in order.
*   **Breadth-First Search (BFS)**: Graph algorithm that explores neighbors first.

## 3. Comparison & Best Practices

| Feature | Stack (LIFO) | Queue (FIFO) |
| :--- | :--- | :--- |
| **Insertion** | `push` (Top) | `offer` (Rear) |
| **Deletion** | `pop` (Top) | `poll` (Front) |
| **Java Interface** | `Stack` (Legacy) or `Deque` (`ArrayDeque`) | `Queue` (`LinkedList`, `ArrayDeque`) |

### Pros & Cons
*   **Pros**: Both provide **O(1)** time complexity for adding and removing elements. They are specialized tools for specific ordering problems.
*   **Cons**: No random access. You cannot access the *i-th* element directly O(1) index access without removing others.

### Best Practice
*   Use **Stacks** for problems involving "matching" (parentheses), "reversing", or "backtracking".
*   Use **Queues** for problems involving "ordering", "buffering", or "level-by-level processing" (BFS).

## Practice Problems

1.  **Valid Parentheses** (Stack): Check if `()[]{}` string is valid.
2.  **Implement Queue using Stacks** (Stack Design): Use two stacks to mimic a FIFO queue.
3.  **Min Stack** (Design): Design a stack that retrieves the minimum element in O(1).
