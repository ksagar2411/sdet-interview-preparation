# Formula and XOR

## Problems using this pattern

- [`FindMissingNoUsingFormula.java`](../src/arrays/FindMissingNoUsingFormula.java) — subtracts the actual sum from `n * (n + 1) / 2`.
- [`FindMissingUsingXOR.java`](../src/arrays/FindMissingUsingXOR.java) — XORs values in `1..n` and the supplied array.
- [`FindMissingNoOptimised.java`](../src/arrays/FindMissingNoOptimised.java) — uses the same summation idea, calculating the expected sum with a loop.

## When to recognize it

Use it for a known complete integer range with exactly one missing value.

## Invariant

The accumulator represents the difference or XOR cancellation between the expected range and processed values.

## Typical algorithm

For values `1..n` with exactly one missing value, compare the expected complete range with the supplied values. Summation uses arithmetic-series subtraction; XOR uses cancellation.

## Generic template

```java
int expected = n * (n + 1) / 2;
int actual = 0;
for (int value : arr) actual += value;
return expected - actual;
```

```java
int xor = 0;
for (int i = 1; i <= n; i++) xor ^= i;
for (int value : arr) xor ^= value;
return xor;
```

## Common mistakes

- Inconsistent logical `n` and physical array length.
- Formula overflow with `int`.
- Applying either solution when duplicates, multiple omissions, or out-of-range values are allowed.

## Complexity

Both run in O(n) time and O(1) auxiliary space. XOR avoids arithmetic overflow.
