# Running Maximum

## When to recognize it

Use this pattern for largest value, best score, second-largest distinct value, or an element that must exceed all values on one side.

## Invariant

`maxSoFar` is the greatest value in the processed prefix. In a reverse scan, `maxRight` is the greatest value in the processed suffix.

## Typical algorithm

Initialize from the first valid value, scan once, and update the tracked maximum when the current value is larger. For leaders, scan right to left and record an element before replacing `maxRight`.

## Common mistakes

- Initializing to `0` when negative values are valid.
- Returning before the scan is complete.
- Treating duplicate maxima as a second distinct value.
- Forgetting to define whether equal values are leaders.

## Representative problems

- Largest Element
- Second Largest Distinct Element
- Leaders in Array (reverse running maximum)

## Complexity

O(n) time and O(1) auxiliary space, excluding any output collection.
