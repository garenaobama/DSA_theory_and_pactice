# Lesson 8: Linked Lists

## What is a Linked List?
A **Linked List** is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element (called a **Node**) points to the next element using a reference (or pointer).

### Structure of a Node
A standard Singly Linked List node contains:
1.  **Data**: The value stored.
2.  **Next**: A pointer/reference to the next node in the sequence.

```java
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
```

## Arrays vs. Linked Lists

| Feature | Array | Linked List |
| :--- | :--- | :--- |
| **Memory** | Contiguous | Non-contiguous (scattered) |
| **Size** | Fixed (usually) | Dynamic |
| **Access** | O(1) Random Access | O(N) Sequential Access |
| **Insertion/Deletion** | O(N) (shifting needed) | O(1) (if pointer is known) |

## Real-World Use Cases
Understanding *why* we use Linked Lists is crucial.
1.  **Dynamic Data Structures**: Stacks and Queues are often implemented using Linked Lists because they require frequent efficient insertion and deletion at the ends.
2.  **Undo/Redo Functionality**: Software like Word or Photoshop uses Doubly Linked Lists to navigate back and forward through states.
3.  **Music Playlists**: A playlist uses a Doubly Linked List so you can go to the "Next" or "Previous" song efficiently.
4.  **Browser History**: Similar to playlists, storing visited pages.
5.  **Hash Map Collision Handling**: In Chaining, each bucket in the hash table is a Linked List.
6.  **Operating Systems**: Kernel memory management often uses linked lists to track free and allocated memory blocks.

## Pros & Cons
### Pros
*   **Dynamic Size**: You can add as many elements as you want (until memory runs out) without pre-allocating a large block.
*   **Efficient Insertions/Deletions**: Adding or removing from the beginning is O(1). If you have a reference to a node, removing it is also O(1) (for doubly linked lists).
*   **No Memory Waste**: You don't allocate memory you don't use (unlike an array where you might size it for 100 items but only use 10).

### Cons
*   **Search Speed**: Finding an element (e.g., "get the 5th item") is O(N) because you must walk from the head. Arrays do this in O(1).
*   **Extra Memory Overhead**: Each node needs extra memory to store the pointer/reference (usually 4 or 8 bytes).
*   **Cache Performance**: Arrays have great cache locality because they are contiguous. Linked Lists are scattered in memory, causing more cache misses and generally slower performance in practice for iteration.

## Best Practices
*   **Use when**: You only need to scan sequentially (iteration) or insert/delete at the head frequently.
*   **Use when**: You don't know the size of data beforehand.
*   **Avoid when**: You need to access items by index (e.g., `list.get(500)`).
*   **Avoid when**: You are memory constrained and storing very small data types (e.g., storing `byte`s in a linked list is wasteful purely due to pointer overhead).

## Common Operations

### 1. Traversal
Iterate through the list starting from the `head` until `curr` becomes `null`.
```java
ListNode curr = head;
while (curr != null) {
    System.out.println(curr.val);
    curr = curr.next;
}
```

### 2. Insertion
*   **At Head**: Create new node, set its `next` to current `head`, update `head`.
*   **At Tail**: Traverse to the last node, set its `next` to the new node.

### 3. Deletion
*   Find the node *before* the target.
*   Change its `next` pointer to skip the target node: `prev.next = prev.next.next`.

## Practice Problems

1.  **Reverse Linked List**: Reverse a singly linked list.
2.  **Linked List Cycle**: Determine if a linked list has a cycle in it.
3.  **Merge Two Sorted Lists**: Merge two sorted linked lists and return it as a sorted list.
