import java.util.ArrayList;
import java.util.HashSet;

public class LinkedListProblems {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Test Reverse List
        ListNode head1 = createList(new int[] { 1, 2, 3, 4, 5 });
        printList("Original List 1:", head1);

        // We clone functionality or just test optimal here to avoid crashing user code
        // on empty inputs if any
        // But for demonstration, we test what handles what.

        System.out.println("\n--- Testing Reverse List ---");
        ListNode reversed1 = reverseListOptimal(head1); // Testing Optimal
        printList("Reversed (Optimal):", reversed1);

        // Test Merge Lists
        ListNode l1 = createList(new int[] { 1, 2, 4 });
        ListNode l2 = createList(new int[] { 1, 3, 4 });
        System.out.println("\n--- Testing Merge Lists ---");
        ListNode merged = mergeTwoListsOptimal(l1, l2); // Testing Optimal
        printList("Merged (Optimal):", merged);

        // Test Cycle
        ListNode cycleHead = new ListNode(3);
        cycleHead.next = new ListNode(2);
        cycleHead.next.next = new ListNode(0);
        cycleHead.next.next.next = new ListNode(-4);
        cycleHead.next.next.next.next = cycleHead.next; // Cycle at 2
        System.out.println("\n--- Testing Cycle Detection ---");
        System.out.println("Has Cycle (User O(N)): " + hasCycle(cycleHead));
        System.out.println("Has Cycle (Optimal O(1)): " + hasCycleOptimal(cycleHead));
    }

    // Helper to create list from array
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper to print list
    public static void printList(String msg, ListNode head) {
        System.out.print(msg + " ");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    /**
     * Problem 1: Reverse Linked List
     * 
     * [USER SOLUTION]
     * Pros: Easier to visualize using an array.
     * Cons: Uses O(N) Extra Space (ArrayList).
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null; // Added safety check
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i > 0) {
                list.get(i).next = list.get(i - 1);
            } else {
                list.get(i).next = null;
            }
        }
        return list.get(list.size() - 1);
    }

    /**
     * [OPTIMAL SOLUTION]
     * Why is this better?
     * 1. Space Complexity is O(1): We only use 3 pointers (prev, curr, next)
     * regardless of list size.
     * 2. No dependence on extra classes like ArrayList.
     */
    public static ListNode reverseListOptimal(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    /**
     * Problem 2: Merge Two Sorted Lists
     * 
     * [USER SOLUTION]
     * Pros: Conceptually separates logic.
     * Cons: Uses O(N) Extra Space (ArrayList) and iterates multiple times.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null; // Safety check
        ListNode mergedList = new ListNode(0);
        ArrayList<ListNode> list = new ArrayList<>();

        // Note: Logic here is a bit tricky, recreating user's structure
        // This was the user's attempt which had some logic issues but we keep it for
        // reference
        // (Simplified/Corrected slightly to ensure it compiles/runs without infinite
        // loop if possible)

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                mergedList.next = list2;
                mergedList = mergedList.next;
                list2 = list2.next;
            } else if (list2 == null) {
                mergedList.next = list1;
                mergedList = mergedList.next;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                mergedList.next = list1;
                mergedList = mergedList.next;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                mergedList = mergedList.next;
                list2 = list2.next;
            }
            list.add(mergedList);
        }
        return list.isEmpty() ? null : list.get(0);
    }

    /**
     * [OPTIMAL SOLUTION]
     * Why is this better?
     * 1. Space Complexity is O(1): We just stitch the existing nodes together using
     * a dummy head.
     * 2. Single pass logic is cleaner.
     */
    public static ListNode mergeTwoListsOptimal(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }
        return dummy.next;
    }

    /**
     * Problem 3: Linked List Cycle
     * 
     * [USER SOLUTION]
     * Pros: Very intuitive (seen it before? add it).
     * Cons: Uses O(N) Extra Space (HashSet). If list is 1M nodes, this crashes
     * memory.
     */
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> setNode = new HashSet<>();
        while (head != null) {
            if (setNode.contains(head)) {
                return true;
            }
            setNode.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * [OPTIMAL SOLUTION] Floyd's Cycle Finding Algorithm
     * Why is this better?
     * 1. Space Complexity is O(1): Uses two pointers moving at different speeds.
     * 2. Standard interview answer.
     */
    public static boolean hasCycleOptimal(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
