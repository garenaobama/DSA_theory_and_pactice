import java.util.*;

public class StringProblems {

    public static void main(String[] args) {
        // Test Palindrome
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome: " + isPalindrome(s1)); // Should be true

        String s2 = "race a car";
        System.out.println("Is Palindrome: " + isPalindrome(s2)); // Should be false

        // Test Reverse String
        char[] s3 = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s3);
        System.out.println("Reversed: " + Arrays.toString(s3));
    }

    /**
     * Problem 1: Valid Palindrome
     * Given a string, determine if it is a palindrome, considering only
     * alphanumeric characters and ignoring cases.
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left forward if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right backward if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Problem 2: Reverse String
     * Write a function that reverses a string. The input string is given as an
     * array of characters s.
     * You must do this by modifying the input array in-place with O(1) extra
     * memory.
     */
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
