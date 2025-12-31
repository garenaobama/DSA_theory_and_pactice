import java.util.*;

public class HardArrayProblems {

    public static void main(String[] args) {
        // Test Two Sum
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println("Two Sum for 9: " + Arrays.toString(twoSum(nums, target)));

        // Test Rotate
        int[] rotateMe = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(rotateMe, 3);
        System.out.println("Rotated by 3: " + Arrays.toString(rotateMe));

        // Test Kadane's
        int[] kadaneNums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Max Subarray Sum (Original): " + maxSubArray(kadaneNums));
        System.out.println("Max Subarray Sum (Optimized): " + maxSubArrayOptimized(kadaneNums));
    }

    /**
     * Problem 1: Two Sum
     * Indices of the two numbers that add up to target.
     * CHALLENGE: Try to use a HashMap for O(n) time!
     */
    public static int[] twoSum(int[] nums, int target) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    /**
     * Problem 2: Rotate Array
     * Rotate array right by k steps.
     * CHALLENGE: Do it in-place O(1) space!
     */
    public static void rotate(int[] nums, int k) {
        // Your code here
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Problem 3: Kadane's Algorithm
     * Find the maximum sum of a contiguous subarray.
     * CHALLENGE: Solve in O(n) time.
     */
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for (int j = 0; j < nums.length; j++) {
            for (int i = j; i < nums.length; i++) {
                sum += nums[i];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            sum = nums[j];
        }
        return maxSum;
    }

    /**
     * Problem 3.1: Kadane's Algorithm (Optimized)
     * Find the maximum sum of a contiguous subarray.
     * Time Complexity: O(n)
     */
    public static int maxSubArrayOptimized(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Logic: Either extend the previous subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
