# Missing Number

## Problems using this pattern

Find Missing Number Brute Force, Summation, Formula, and XOR.

## When to recognize it

Use it when exactly one value is missing from a declared complete range.

## Invariant

The expected-range state and actual processed values differ only by the missing number.

## Typical algorithm

Compare the expected complete range `1..n` with the supplied values.

## Generic template

```java
int n = arr.length + 1;
int expected = n * (n + 1) / 2;
int actual = 0;
for (int value : arr) actual += value;
return expected - actual;
```

## Common mistakes

- Mixing logical `n` with array length.
- Reading `n - 1` values into an `n`-length array.
- Overflow in the sum formula.
- Applying XOR when the one-missing/no-duplicate contract is not met.

## Complexity

Brute force is O(n²). Formula and XOR are O(n), all with O(1) auxiliary space.
