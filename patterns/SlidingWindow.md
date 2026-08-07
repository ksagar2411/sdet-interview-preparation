# Sliding Window

## Problems using this pattern

Not yet used in `src/`.

## When to recognize it

Use it for a contiguous subarray or substring whose bounds change while maintaining a condition.

## Invariant

The maintained state describes exactly the current window from `left` through `right`.

## Typical algorithm

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
