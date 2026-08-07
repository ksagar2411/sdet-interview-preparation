# Interview Notes

## Answer Framework

Explain the input contract, pattern, invariant, complexity, edge cases, and any optimized follow-up before walking through code.

## Common Follow-ups

### Second Largest

- Must the result be distinct?
- What should happen when no second distinct value exists?

### Merge Two Sorted Arrays

- Can the merge be done in place when the first array has spare capacity?
- Why are three phases required after one input is exhausted?

### Best Time to Buy and Sell Stock

- Return buy/sell indexes as well as profit.
- How does the solution change for multiple transactions?

### Leaders in Array

- Are equal values leaders?
- Should results be returned in input order or discovery order?

### Move Zeroes

- Must non-zero values retain their relative order?
- Is a new output array allowed, or is O(1) auxiliary space required?

### Pivot Index

- Why does `rightSum = totalSum - leftSum - currentValue` work?
- Can the pivot be the first or last index?

### Product of Array Except Self

- Can it be solved without division?
- Can the O(n) output be produced with O(1) extra space beyond that output?
- How should zeroes and integer overflow be handled?
