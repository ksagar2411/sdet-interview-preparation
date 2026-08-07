# Read/Write Pointer

## When to recognize it

Use it when values must be removed, moved, compacted, or filtered in place while preserving accepted-value order.

## Invariant

The prefix ending at `write - 1` contains exactly the accepted values in their required order. `read` points to the value being inspected.

## Typical algorithm

Scan every value with `read`. When it satisfies the rule, write it at `write` and advance `write`. The remaining suffix can be filled or ignored according to the result contract.

## Common mistakes

- Advancing `write` for rejected values.
- Moving `read` and `write` together.
- Using adjacent duplicate comparison on an unsorted array.

## Representative problems

- Remove Duplicates from Sorted Array
- Move Zeroes
- Unique Number Count

## Complexity

O(n) time and O(1) auxiliary space.
