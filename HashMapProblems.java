import java.util.*;

public class HashMapProblems {

    public static void main(String[] args) {
        // Test Contains Duplicate
        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println("Contains Duplicate (true): " + containsDuplicate(nums1));

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Contains Duplicate (false): " + containsDuplicate(nums2));

        // Test First Unique Character
        String s1 = "leetcode";
        System.out.println("First Unique Char (0): " + firstUniqChar(s1));
        System.out.println("First Unique Char Optimal (0): " + firstUniqCharOptimal(s1));

        String s2 = "loveleetcode";
        System.out.println("First Unique Char (2): " + firstUniqChar(s2));
        System.out.println("First Unique Char Optimal (2): " + firstUniqCharOptimal(s2));

        String s3 = "aabb";
        System.out.println("First Unique Char (-1): " + firstUniqChar(s3));
        System.out.println("First Unique Char Optimal (-1): " + firstUniqCharOptimal(s3));

        // Test Intersection
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        System.out.println("Intersection [2]: " + Arrays.toString(intersection(arr1, arr2)));
        System.out.println("Intersection Optimal [2]: " + Arrays.toString(intersectionOptimal(arr1, arr2)));

        int[] arr3 = { 4, 9, 5 };
        int[] arr4 = { 9, 4, 9, 8, 4 };
        System.out.println("Intersection [9, 4]: " + Arrays.toString(intersection(arr3, arr4)));
        System.out.println("Intersection Optimal [9, 4]: " + Arrays.toString(intersectionOptimal(arr3, arr4)));
    }

    /**
     * Problem 1: Contains Duplicate
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /**
     * Problem 2: First Unique Character in a String
     */
    public static int firstUniqChar(String s) {
        // Corrected logic for the original method using HashMap
        HashMap<Character, Integer> countMap = new HashMap<>();
        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        // Find first with count 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Problem 2 (Optimized): First Unique Character in a String
     * Uses an integer array for better performance with ASCII/lowercase letters.
     */
    public static int firstUniqCharOptimal(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Problem 3: Intersection of Two Arrays
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
            if (i < nums1.length) {
                hs1.add(nums1[i]);
            }
            if (i < nums2.length) {
                hs2.add(nums2[i]);
            }
        }

        for (int i : hs1) {
            if (hs2.contains(i)) {
                result.add(i);
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }

    /**
     * Problem 3 (Optimized): Intersection of Two Arrays
     * Uses a single HashSet to store unique elements of the first array,
     * then iterates the second array to find matches. This reduces space and
     * overhead.
     */
    public static int[] intersectionOptimal(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                intersection.add(n);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }
        return result;
    }
}
