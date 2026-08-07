# Linear Scan

## Problems using this pattern

Sum/Average of Array, Count Occurrences, Linear Search, Largest/Smallest, Second Largest, Sorted Array Checker, Vowel Count, and Consonant Count.

## When to recognize it

Use it when every element must be inspected once and the answer can be maintained as small state.

## Invariant

The state variable correctly summarizes all values processed so far.

## Typical algorithm

Visit every element once while maintaining small state: a sum, count, best value, or boolean.

## Generic template

```java
int state = initialValue;
for (int i = 0; i < arr.length; i++) {
    // update state using arr[i]
}
return state;
```

## Common mistakes

- Using `arr.length` as an index.
- Wrong initial state for negative values.
- Returning before the scan completes.

## Complexity

O(n) time and O(1) extra space.
