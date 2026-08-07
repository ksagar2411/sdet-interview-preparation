# Running Minimum

## When to recognize it

Use it for the smallest value seen so far, cheapest earlier price, or minimum prefix value.

## Invariant

`minSoFar` is the smallest valid value from earlier processed positions.

## Typical algorithm

Initialize from the first value. Scan left to right, use the current minimum to evaluate the current value, then update the minimum for later positions as required by the problem.

## Common mistakes

- Comparing only with the previous value.
- Using a minimum that occurs after the current sale/value.
- Accessing the first element without an empty-input contract.

## Representative problems

- Smallest Element
- Best Time to Buy and Sell Stock

## Complexity

O(n) time and O(1) auxiliary space.
