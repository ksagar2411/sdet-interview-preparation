# Running Maximum / Minimum

## Problems using this pattern

Largest Element, Smallest Element, Second Largest, and Maximum Consecutive Ones.

## Core idea

Keep the best value seen so far; some problems also keep a current streak or second-best value.

## Generic template

```java
int best = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > best) best = arr[i];
}
return best;
```

## Common mistakes

- Initializing to `0` when inputs may be negative.
- Returning inside the loop.
- Not defining behavior when a distinct second value is absent.

## Complexity

O(n) time and O(1) space.
