# Lesson 5: Strings in Java

Strings are one of the most used data types. In Java, they are special!

## 1. Immutability
In Java, `String` objects are **immutable**.  
Once created, a String object cannot be changed.
```java
String s = "Hello";
s = s + " World"; // This creates a NEW String object "Hello World"
```

## 2. StringBuilder
Because of immutability, using `+` in a loop is very slow (O(n²)).
Instead, use `StringBuilder` which is mutable.

```java
StringBuilder sb = new StringBuilder();
for(int i=0; i<10; i++) {
    sb.append(i); // Efficient
}
String result = sb.toString();
```

## 3. Common Problems
### A. Valid Palindrome
Check if a string reads the same forwards and backwards.
**Tip**: Use "Two Pointers" (start and end).

### B. Reverse String
Reverse the characters of a string.
**Tip**: If input is `char[]`, swap start and end while moving towards center.

---

# Practice Task: StringProblems.java
- [ ] Implement `isPalindrome` (Time: O(n), Space: O(1))
- [ ] Implement `reverseString` (in-place for char array)
