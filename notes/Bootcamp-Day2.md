# Bootcamp Day 2

## Cold Retest — Completed

Re-solved from memory without referring to notes:

- Missing Number using XOR
- Remove Duplicates from Sorted Array
- Best Time to Buy and Sell Stock

All three patterns were retained successfully.

## New Problems Completed

- **Second Largest Element:** single-pass Running Maximum with distinct-value handling.
- **Merge Two Sorted Arrays:** canonical three-pointer, three-phase merge.
- **Intersection of Two Arrays:** brute-force nested comparison with array-based duplicate removal.

## Patterns Learned

- Running Maximum
- Merge Pattern
- Nested Comparison Pattern
- Recognizing when a `HashSet` is needed
- Loop invariants: describe what remains true after every iteration

## Key Learnings

- Day 1 concepts were successfully retained under cold-retest conditions.
- Identify a pattern before writing the loop.
- Derive canonical algorithms from pointer invariants instead of memorizing special cases.
- Treat edge cases and result contracts as part of an interview-quality solution.

## Mistakes Worth Remembering

### Second Largest

Duplicate handling is required to find the second **distinct** value.

### Merge

The canonical approach has three phases: compare while both inputs remain, then copy each possible remainder. Avoid special handling for the first element and verify the source array in each final copy loop.

### Intersection

Allocate only enough result capacity, then track the populated prefix. Array-only duplicate removal is possible but requires another loop; use a `HashSet` once Collections are in scope.
