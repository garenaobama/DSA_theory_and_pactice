import java.util.HashMap;
import java.util.Map;

public class RecursionProblems {

    public static void main(String[] args) {
        // --- Factorial ---
        System.out.println("Factorial(5): " + factorial(5)); // 120

        // --- Fibonacci ---
        System.out.println("Fibonacci(10): " + fibonacci(10)); // 55
        System.out.println("Fibonacci Optimal(10): " + fibonacciMemo(10, new HashMap<>())); // 55

        // --- Power ---
        // User Logic (Bug Check)
        try {
            // This would StackOverflow with user code
            System.out.println("Power(2, -2): " + power(2, -2));
        } catch (StackOverflowError e) {
            System.out.println("Power(2, -2): CRASHED (StackOverflow)");
        }

        // Optimal Logic
        System.out.println("Power Optimal(2, -2): " + powerOptimal(2, -2)); // 0.25
        System.out.println("Power Optimal(2, 10): " + powerOptimal(2, 10)); // 1024.0
    }

    /**
     * Problem 1: Factorial (Good!)
     */
    public static int factorial(int n) {
        if (n <= 1)
            return 1; // Slight safety improvement (<=1)
        return n * factorial(n - 1);
    }

    /**
     * Problem 2: Fibonacci (Naive)
     * Pros: Simple definition.
     * Cons: O(2^N) - Extremely slow for N > 40.
     */
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Problem 2: Fibonacci (Memoization - Optimal)
     * Pros: O(N) Time complexity.
     * Uses a HashMap to store results we've already calculated.
     */
    public static int fibonacciMemo(int n, Map<Integer, Integer> memo) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (memo.containsKey(n))
            return memo.get(n);

        int result = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    /**
     * Problem 3: Power (User)
     * Issues:
     * 1. Crashes on negative 'n' (infinite recursion).
     * 2. O(N) complexity (slow for large N).
     */
    public static double power(double x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        return x * power(x, n - 1);
    }

    /**
     * Problem 3: Power (Optimal - Binary Exponentiation)
     * Improvements:
     * 1. Handles negative 'n'.
     * 2. O(log N) complexity using x^n = x^(n/2) * x^(n/2).
     */
    public static double powerOptimal(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            return 1 / powerOptimal(x, -n);
        }
        if (n % 2 == 0) {
            double half = powerOptimal(x, n / 2);
            return half * half;
        } else {
            return x * powerOptimal(x, n - 1);
        }
    }
}
