import java.util.HashMap;
import java.util.Stack;

public class StackQueueProblems {

    public static void main(String[] args) {
        // --- Test Valid Parentheses ---
        System.out.println("--- Valid Parentheses ---");
        // User Logic (Might crash on edge cases like "]" or "())")
        try {
            System.out.println("User Input ']': " + isValid("]"));
        } catch (Exception e) {
            System.out.println("User Input ']': CRASHED (" + e + ")");
        }

        // Optimal Logic
        System.out.println("Optimal Input ']': " + isValidOptimal("]")); // false (Correct)
        System.out.println("Optimal Input '()': " + isValidOptimal("()")); // true

        // --- Test Queue ---
        System.out.println("\n--- Queue Implementation ---");

        // User Queue (Behaves like Stack)
        System.out.println("Testing User's MyQueue:");
        MyQueue q1 = new MyQueue();
        q1.push(1);
        q1.push(2);
        System.out.println("Peek (Expected 1): " + q1.peek()); // returns 2 (Wrong, LIFO)
        System.out.println("Pop (Expected 1): " + q1.pop()); // returns -1 (Wrong implementation)

        // Optimal Queue (Behaves like Queue)
        System.out.println("\nTesting MyQueueOptimal:");
        MyQueueOptimal q2 = new MyQueueOptimal();
        q2.push(1);
        q2.push(2);
        System.out.println("Peek (Expected 1): " + q2.peek()); // returns 1 (Correct)
        System.out.println("Pop (Expected 1): " + q2.pop()); // returns 1 (Correct)
        System.out.println("Peek (Expected 2): " + q2.peek()); // returns 2 (Correct)
    }

    /**
     * Problem 1: Valid Parentheses (USER VERSION)
     * 
     * ISSUES:
     * 1. Complexity: Uses multiple HashMaps which is overkill.
     * 2. CRITICAL BUG: `stack.peek()` throws EmptyStackException if the stack is
     * empty.
     * Example: Input "]" will crash because it tries to peek immediately.
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeSet = new HashMap<>();
        closeSet.put(')', '(');
        closeSet.put(']', '[');
        closeSet.put('}', '{');
        HashMap<Character, Character> openSet = new HashMap<>();
        openSet.put('(', ')');
        openSet.put('[', ']');
        openSet.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            if (openSet.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (closeSet.containsKey(s.charAt(i))) {
                // FAILURE POINT: If stack is empty, peek() throws exception
                if (stack.peek() == closeSet.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * Problem 1: Valid Parentheses (OPTIMAL VERSION)
     * 
     * IMPROVEMENTS:
     * 1. Check `stack.isEmpty()` before popping.
     * 2. Cleaner logic: Push the *expected* closing char. matching becomes simple
     * equality check.
     */
    public static boolean isValidOptimal(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    /**
     * Problem 2: Queue using Stacks (USER VERSION)
     * 
     * ISSUES:
     * 1. Logic Error: This implements a Stack (LIFO), not a Queue (FIFO).
     * Queue: First In First Out. Stack: Last In First Out.
     * 2. Return Value: pop() returns -1, losing the data.
     */
    static class MyQueue {
        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            s1.pop(); // Removes top (newest) element = LIFO behavior
            return -1; // Specific bug in user code
        }

        public int peek() {
            return s1.peek(); // Returns top (newest) element
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }

    /**
     * Problem 2: Queue using Stacks (OPTIMAL VERSION)
     * 
     * IMPROVEMENTS:
     * 1. Uses Two Stacks to reverse order (LIFO + LIFO = FIFO).
     * 2. Amortized O(1) complexity.
     */
    static class MyQueueOptimal {
        Stack<Integer> input;
        Stack<Integer> output;

        public MyQueueOptimal() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            peek();
            return output.pop();
        }

        public int peek() {
            if (output.isEmpty()) {
                // Move everything from input to output
                // This reverses the order: [1, 2] -> [2, 1]
                // So popping from output gives 1 (First In)
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
