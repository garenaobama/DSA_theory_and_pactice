import java.util.*;

public class TwoPointerProblems {

    public static void main(String[] args) {
        // Test Palindrome
        System.out.println("Is Palindrome 'aba': " + isPalindrome("aba"));
        System.out.println("Is Palindrome 'abc': " + isPalindrome("abc"));

        // Test Two Sum Sorted
        int[] sortedNums = { 2, 7, 11, 15 };
        System.out.println("Two Sum Sorted (9): " + Arrays.toString(twoSumSorted(sortedNums, 9)));

        // Test Max Profit
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max Profit (5): " + maxProfit(prices));

        // Test Longest Substring Without Repeating Characters
        System.out.println("Longest Substring 'abcabcbb' (3): " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Longest Substring 'bbbbb' (1): " + lengthOfLongestSubstring("bbbbb"));
    }

    /**
     * Problem 1: Valid Palindrome (Recap)
     * Use two pointers to check if string is palindrome.
     * 
     * Example 1:
     * Input: s = "aba"
     * Output: true
     * 
     * Example 2:
     * Input: s = "race a car"
     * Output: false (assuming simple alphanumeric check or based on strict rules)
     */
    public static boolean isPalindrome(String s) {
        // TODO: Implement this method using two pointers
        return false;
    }

    /**
     * Problem 2: Two Sum II - Input Array Is Sorted
     * Given a 1-indexed array of integers numbers that is already sorted in
     * non-decreasing order,
     * find two numbers such that they add up to a specific target number.
     * Return the indices of the two numbers (1-indexed).
     * Challenge: Use O(1) extra space.
     * 
     * Example 1:
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2] (2 + 7 = 9)
     * 
     * Example 2:
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3] (2 + 4 = 6)
     */
    public static int[] twoSumSorted(int[] numbers, int target) {
        // TODO: Implement this method using two pointers
        return new int[] { -1, -1 };
    }

    /**
     * Problem 3: Best Time to Buy and Sell Stock
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Example 1:
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5 (Buy at 1, sell at 6)
     * 
     * Example 2:
     * Input: prices = [7,6,4,3,1]
     * Output: 0 (No profit possible)
     */
    public static int maxProfit(int[] prices) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Problem 4: Longest Substring Without Repeating Characters
     * Given a string s, find the length of the longest substring without repeating
     * characters.
     * Hint: Use Sliding Window with a Set or Map.
     */
    public static int lengthOfLongestSubstring(String s) {
        // TODO: Implement this method using Sliding Window
        return 0;
    }
}
