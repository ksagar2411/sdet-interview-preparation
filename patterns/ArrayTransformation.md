# Array Transformation

## Problems using this pattern

Copy Array, Reverse Array, Rotate Array by One, Move Zeroes With New Array, and Merge Array.

## Core idea

Build a result array or mutate the input while tracking destination indexes and temporary values.

## Generic template

```java
int[] result = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    result[/* destination index */] = arr[i];
}
```

## Common mistakes

- Confusing source and destination indexes.
- Mutating when a separate result is required.
- Reading index `0` from an empty array.

## Complexity

Usually O(n) time; O(n) extra space for a new result, O(1) when in place.
