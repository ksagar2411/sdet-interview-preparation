# Brute Force Pairs

## Problems using this pattern

Two Sum.

## Core idea

Use nested loops to test every unique pair; start the inner loop at `i + 1`.

## Generic template

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (/* pair matches */) return new int[] { i, j };
    }
}
```

## Common mistakes

- Repeating pairs or using the same index twice.
- No documented no-match result.

## Complexity

O(n²) time and O(1) auxiliary space.
