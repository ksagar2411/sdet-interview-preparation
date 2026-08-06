# 🧠 DSA Pattern Recognition Cheat Sheet
### SDET Interview Preparation

> Goal: Before writing code, identify the pattern first.

---

# 1. Running Minimum

## Pattern Identifiers

- Best Buy Price
- Lowest Cost
- Minimum So Far
- Cheapest
- Smallest Prefix

## Invariant

```
minSoFar always stores the smallest element seen till current index.
```

## Template

```java
int min = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] < min)
        min = arr[i];

}
```

---

# 2. Running Maximum

## Pattern Identifiers

- Largest Element
- Second Largest
- Maximum So Far
- Highest Score

## Invariant

```
maxSoFar stores the largest element seen till current index.
```

## Template

```java
int max = arr[0];

for (int x : arr) {

    if (x > max)
        max = x;

}
```

---

# 3. Running Maximum (Reverse Traversal)

## Pattern Identifiers

- Leaders in Array
- Maximum on Right
- Suffix Maximum

## Invariant

```
maxRight stores the largest element seen while traversing from right to left.
```

## Template

```java
int maxRight = Integer.MIN_VALUE;

for (int i = arr.length - 1; i >= 0; i--) {

    if (arr[i] >= maxRight) {

        // Leader

        maxRight = arr[i];

    }

}
```

---

# 4. Read / Write Pointer

## Pattern Identifiers

- Remove Duplicates
- Move Zeroes
- Compact Array
- Filter Elements

## Invariant

```
write always points to the next valid insertion position.
```

## Template

```java
int write = 0;

for (int read = 0; read < arr.length; read++) {

    if (condition) {

        arr[write++] = arr[read];

    }

}
```

---

# 5. Two Pointers (Same Direction)

## Pattern Identifiers

- Merge Sorted Arrays
- Merge Lists
- Compare Two Sorted Arrays

## Invariant

```
Both pointers always point to the first unprocessed element.
```

## Template

```java
while (i < arr1.length && j < arr2.length) {

    if (arr1[i] <= arr2[j]) {

        merged[k++] = arr1[i++];

    } else {

        merged[k++] = arr2[j++];

    }

}
```

---

# 6. Two Pointers (Opposite Direction)

## Pattern Identifiers

- Pair Sum
- Reverse Array
- Palindrome
- Container With Most Water

## Invariant

```
Left and Right move towards each other.
```

## Template

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {

    ...

}
```

---

# 7. Running Count

## Pattern Identifiers

- Consecutive Ones
- Longest Streak
- Continuous Sequence

## Invariant

```
currentCount stores current streak length.
```

## Template

```java
int count = 0;

for (...) {

    if (condition)

        count++;

    else

        count = 0;

}
```

---

# 8. HashMap Frequency

## Pattern Identifiers

- Majority Element
- Frequency Count
- Occurrence
- Anagram
- Character Count

## Invariant

```
Map stores frequency of elements processed so far.
```

## Template

```java
Map<Integer,Integer> map = new HashMap<>();

for (int x : arr) {

    map.put(x, map.getOrDefault(x,0)+1);

}
```

---

# 9. HashSet Lookup

## Pattern Identifiers

- Duplicate Detection
- Unique Elements
- Intersection
- Visited

## Invariant

```
Set stores processed elements.
```

## Template

```java
Set<Integer> set = new HashSet<>();

for (int x : arr) {

    if (set.contains(x)) {

        ...

    }

    set.add(x);

}
```

---

# 10. XOR Pattern

## Pattern Identifiers

- Missing Number
- Single Number
- Odd Occurrence
- Unique Element

## Invariant

```
Equal numbers cancel each other.
```

## Template

```java
int xor = 0;

for (...) {

    xor ^= value;

}
```

---

# 11. Sliding Window

## Pattern Identifiers

- Subarray
- Window
- Longest
- Shortest
- Continuous

## Invariant

```
Window always satisfies the required condition.
```

## Template

```java
int left = 0;

for (int right = 0; right < n; right++) {

    while (condition) {

        left++;

    }

}
```

---

# 🚀 Interview Recognition Table

| If Question Says... | Think... |
|----------------------|-----------|
| Lowest / Cheapest / Buy | Running Minimum |
| Largest / Maximum | Running Maximum |
| Right Side | Reverse Traversal |
| Consecutive | Running Count |
| Duplicate | HashSet |
| Frequency | HashMap |
| Sorted Arrays | Two Pointers |
| Merge | Two Pointers |
| Remove / Move | Read-Write Pointer |
| Missing Number | XOR |
| Single Number | XOR |
| Subarray | Sliding Window |
| Longest Window | Sliding Window |
| Smallest Window | Sliding Window |

---

# 📌 Problem Solving Checklist (Mandatory)

Before writing code, answer these:

### 1. Pattern?

Example:

```
Running Minimum
```

---

### 2. Invariant?

Example:

```
minPrice always stores the minimum price seen so far.
```

---

### 3. Complexity Goal?

Example:

```
Time : O(n)

Space : O(1)
```

---

# 💡 Bootcamp Rule

Never ask:

> "How do I solve this?"

Instead ask:

> "Which pattern does this belong to?"

Once the pattern is identified,
the implementation usually becomes straightforward.
