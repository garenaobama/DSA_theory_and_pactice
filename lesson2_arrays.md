# Lesson 2: Arrays and Strings

Now that we understand Big O, let's look at our first Data Structure: the **Array**.

## What is an Array?
An array is a collection of items stored at contiguous memory locations. In Java, arrays are objects that store a fixed number of values of a single type.

### Memory Layout
Imagine a row of lockers. Each locker has an index (0, 1, 2...). Because they are right next to each other, if you know the starting address and the index, you can jump directly to any element in **O(1)** time.

### Time Complexity of Array Operations:
- **Access**: O(1) -> If you know the index, it's instant.
- **Search**: O(n) -> You might have to check every element.
- **Insertion**: O(n) -> If you insert at the beginning, you have to shift everyone else.
- **Deletion**: O(n) -> You have to shift elements to fill the gap.

## Arrays in Java
```java
public class ArrayBasics {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] numbers = new int[5]; // size is fixed
        numbers[0] = 10;
        numbers[1] = 20;

        // Iteration (O(n))
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
```

## Strings
In Java, `String` is an object that wraps an array of `char`. **Strings are immutable**, meaning once created, they cannot be changed. If you "modify" a string, Java creates a whole new string.

- For frequent modifications, we use `StringBuilder` (which is like a dynamic array for characters).

## Exercise
If an array has 1,000,000 elements, how many operations (roughly) are needed to find an element if it's at the very end? (Answer: 1,000,000 or O(n)).

---
Next: We'll implement a few Array problems (Reversing an array, Finding Max/Min) once your Java setup is ready!
