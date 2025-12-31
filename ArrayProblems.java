/**
 * ArrayProblems.java
 * This file contains simple exercises to get you comfortable with Arrays in
 * Java.
 */
public class ArrayProblems {

    public static void main(String[] args) {
        int[] myNumbers = { 12, 45, 2, 67, 34, 8 };

        System.out.println("Original Array:");
        printArray(myNumbers);

        // Exercise 1: Find Maximum
        int max = findMax(myNumbers);
        System.out.println("Maximum value: " + max);

        // Exercise 1.5: Find Minimum (User Implemented)
        int min = findMin(myNumbers);
        System.out.println("Minimum value: " + min);

        // Exercise 2: Reverse the Array
        reverseArray(myNumbers);
        System.out.println("Reversed Array:");
        printArray(myNumbers);
    }

    /**
     * Find the maximum element in an array.
     * Time Complexity: O(n)
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Reverse an array in-place.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
