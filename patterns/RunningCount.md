# Running Count

## Problems using this pattern

- [`CountOccurences.java`](../src/arrays/CountOccurences.java) — increments for every target match.
- [`MaxConsecutive1Count.java`](../src/arrays/MaxConsecutive1Count.java) — maintains a current count and resets it when the streak ends.
- `VowelsCount` and `ConsonantsCount` use the same idea but are string programs, not array programs.

## When to recognize it

Use it for frequencies, consecutive runs, and totals accumulated during one scan.

## Invariant

The counter represents the required count for the processed prefix or active streak.

## Typical algorithm

Maintain a counter while scanning. Increment on an accepted value; reset it when a streak-ending value appears.

## Generic template

```java
int count = 0;
for (int value : arr) {
    if (/* accepted */) count++;
}
return count;
```

## Common mistakes

- Forgetting to reset a streak counter.
- Updating the total when the condition is false.
- Confusing a current count with the best count seen so far.

## Complexity

O(n) time and O(1) space.
