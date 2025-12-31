# Lesson 7: Two Pointers & Sliding Window

## 1. Two Pointers
The **Two Pointers** pattern allows us to process an array or string by using two indices usually moving at different speeds or directions.

### Common Scenarios
1.  **Start & End**: One pointer starts at the beginning, one at the end. They move towards each other.
    *   *Usage*: Reversing arrays, checking palindromes, Two Sum (sorted).
2.  **Slow & Fast**: Both pointers start at the beginning, but one moves faster.
    *   *Usage*: Finding cycle in Linked List, removing duplicates sorted array.

## 2. Sliding Window
The **Sliding Window** pattern is used to perform operations on a specific window size of an array or string.

### How it works
Instead of re-calculating the sum/condition for every subarray (which is often O(n*k) or O(n²)), we "slide" the window by adding the new element and removing the old element.

**Example: Max Sum of Subarray of size k**
```java
int maxSum = 0, windowSum = 0;
// First window
for (int i=0; i<k; i++) windowSum += nums[i];
maxSum = windowSum;

// Slide window
for (int i=k; i<nums.length; i++) {
    windowSum += nums[i] - nums[i-k]; // Add new, remove old
    maxSum = Math.max(maxSum, windowSum);
}
```

---

# Practice Task: TwoPointerProblems.java
- [ ] Implement `isPalindrome` (Recap: Start/End pointers)
- [ ] Implement `twoSumSorted` (Input is sorted! O(n) time, O(1) space)
- [ ] Implement `maxProfit` (Buy low, sell high - single pass)
- [ ] Implement `lengthOfLongestSubstring` (Sliding Window without repeating chars)
