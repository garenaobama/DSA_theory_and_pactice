# Lesson 6: HashMaps & Sets

## 1. Introduction
HashMaps and Sets are essential for efficient data retrieval.
They provide **O(1)** average time complexity for:
- Inserting an element
- Checking if an element exists (Lookup)
- Removing an element

## 2. HashMap (Key-Value)
Stores data in pairs: `Key -> Value`. Keys must be unique.

```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);

System.out.println(scores.get("Alice")); // 90
System.out.println(scores.containsKey("Charlie")); // false
```

## 3. HashSet (Unique Collection)
Stores only unique elements. Good for checking duplicates.

```java
HashSet<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1); // Ignored, already exists

System.out.println(set.contains(1)); // true
```

## 4. When to use?
- Use **HashMap** when you need to map one value to another (e.g., counting frequencies, mapping ID to User).
- Use **HashSet** when you just need to check presence or uniqueness.

---

# Practice Task: HashMapProblems.java
- [ ] Implement `containsDuplicate` (Time: O(n))
- [ ] Implement `firstUniqChar` (Time: O(n))
- [ ] Implement `intersection` (Time: O(n+m))
