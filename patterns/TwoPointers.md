# Two Pointers

## When to recognize it

Use two pointers for mirrored positions, pairs, or two sorted inputs that must be processed in order.

## Invariant

For inward scans, values outside the pointers are already finalized. For a merge, each pointer identifies the first unprocessed value and the output prefix is sorted.

## Typical algorithm

Move pointers inward for reverse/palindrome work. For a merge, copy the smaller current value while both inputs remain, then copy either remainder.

## Common mistakes

- Forgetting to move a pointer.
- Using the wrong stopping condition.
- Omitting a remainder-copy phase in a merge.
- Losing stable order when a problem requires it.

## Representative problems

- Reverse Array
- Merge Two Sorted Arrays
- Pair Sum / Two Sum variants

## Complexity

Usually O(n) or O(n + m) time and O(1) auxiliary space, excluding an output array.
