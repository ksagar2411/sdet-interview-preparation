# Sliding Window

## Problems using this pattern

Not yet used in `src/`.

## Core idea

Maintain a contiguous range; expand right, then shrink left until the range satisfies its constraint.

## Generic template

```java
int left = 0;
for (int right = 0; right < arr.length; right++) {
    // add arr[right]
    while (/* invalid */) {
        // remove arr[left++]
    }
}
```

## Common mistakes

- Failing to remove state while shrinking.
- Applying it to non-contiguous problems.

## Complexity

Typically O(n) time and O(1) to O(k) space.
