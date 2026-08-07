# Arrays

This is the master notebook for solved array problems. Pattern pages contain the reusable algorithm; this file records the problem-level contract and edge cases.

## Problem Index

| Problem | LeetCode | Pattern Used | Key Idea | Invariant | Time | Space | Edge Cases |
|---|---:|---|---|---|---|---|---|
| Array Sum / Average | N/A | Linear Scan | Accumulate every value once | `sum` is the total of processed values | O(n) | O(1) | Empty input; integer division for average |
| Largest / Smallest Element | N/A | Running Maximum / Minimum | Keep the best value seen | `best` is the extreme of the processed prefix | O(n) | O(1) | Negative values; empty input |
| Second Largest Distinct | N/A | Running Maximum | Track largest and second distinct largest | Both variables describe the processed prefix | O(n) | O(1) | Duplicates; all-equal; fewer than two values |
| Linear Search | 704 variant | Linear Scan | Return on the first match | Earlier values have been checked | O(n) | O(1) | Empty input; no match |
| Count Occurrences | N/A | Running Count | Increment for each target match | `count` equals matches processed so far | O(n) | O(1) | No matches |
| Maximum Consecutive Ones | 485 | Running Count | Reset a current streak when it ends | `current` is the active streak; `best` is the best completed/active streak | O(n) | O(1) | All zeroes; ending streak |
| Sorted Array Checker | N/A | Adjacent Scan | Compare each value with its predecessor | All checked adjacent pairs are sorted | O(n) | O(1) | Empty/single element; duplicates |
| Copy Array | N/A | Array Transformation | Copy each source value to the same destination index | Prefix of copy equals source prefix | O(n) | O(n) | Empty input |
| Reverse Array | 344 variant | Two Pointers | Swap mirrored values | Outside the pointers is already reversed | O(n) | O(1) | Empty; odd length |
| Rotate Array by One | N/A | Array Transformation | Save final value, shift, then restore | Shifted prefix preserves its required predecessor | O(n) | O(1) | Empty; one element |
| Merge Arrays | N/A | Array Transformation | Copy the first input then the second | Output prefix contains all copied values in order | O(n + m) | O(n + m) | Either input empty |
| Merge Two Sorted Arrays | 88 variant | Two Pointers | Copy the smaller current value | Output prefix is sorted; pointers mark first unprocessed values | O(n + m) | O(n + m) | Equal values; one input exhausts first |
| Array Intersection | 349 variant | Nested Comparison | Find common values and prevent duplicate output | Result prefix contains unique matches | O(n * m) | O(min(n, m)) | Empty input; duplicate values |
| Two Sum | 1 | Brute Force Pairs | Test each unique pair | All earlier pairs have been considered once | O(n^2) | O(1) | No solution; duplicate values |
| Remove Duplicates / Unique Count | 26 | Read/Write Pointer | Compact accepted sorted values in place | Prefix through `write` contains the unique values | O(n) | O(1) | Empty; all duplicates; unsorted input is invalid |
| Move Zeroes | 283 | Read/Write Pointer | Compact non-zero values while preserving order | Values before `write` are stable non-zero values | O(n) | O(1) | All zeroes; no zeroes; stable order |
| Missing Number (brute force) | 268 variant | Nested Comparison | Check each expected range value | All earlier candidates were tested | O(n^2) | O(1) | Missing first/last; range contract |
| Missing Number (sum/formula/XOR) | 268 | Formula / XOR | Compare expected range with supplied values | Accumulator represents the range difference/cancellation so far | O(n) | O(1) | One missing value only; formula overflow |
| Best Time to Buy and Sell Stock | 121 | Running Minimum | Compare each price with the cheapest earlier price | `minPrice` is the lowest valid buy price so far | O(n) | O(1) | Descending prices; one price; no profitable trade |
| Leaders in Array | N/A | Reverse Running Maximum | Scan from right and retain the largest right-side value | `maxRight` is the maximum seen to the right | O(n) | O(n) output | Rightmost value; duplicates; result order |
| Running Sum of 1D Array | 1480 | Prefix Sum | Reuse the preceding cumulative total | `prefix[i]` is the sum from index `0` through `i` | O(n) | O(n) | Empty input; negative values |
| Pivot Index | 724 | Prefix Sum | Derive right sum from total and left sum | `leftSum` contains values strictly before the pivot | O(n) | O(1) | First/last pivot; one element; no pivot |
| Product of Array Except Self | 238 | Prefix Product + Suffix Product | Combine products before and after each index | Prefix/suffix values exclude the current index | O(n) | O(n) | One/multiple zeroes; one element; overflow |

## Key Problem Notes

### Second Largest Distinct

The result contract matters: a single-element or all-equal array has no second distinct value. Do not use `Integer.MIN_VALUE` as an undocumented sentinel because it can be a valid input.

### Merge Two Sorted Arrays

Use three phases: compare while both inputs remain, copy the first remainder, then copy the second remainder. This is the standard merge operation used by Merge Sort.

### Leaders in Array

The brute-force solution checks every element to the right. The optimized solution reverses the viewpoint: an element is a leader when it is at least `maxRight`; then update `maxRight`. Define whether equality counts as a leader and return the result in the requested order.

### Running Sum and Pivot Index

Prefix Sum replaces repeated summation with stored state. For Pivot Index, compute `rightSum = totalSum - leftSum - value` and compare before updating `leftSum`.

### Product of Array Except Self

`prefix[0] = 1` and `suffix[last] = 1` express the empty-product identity. The O(1) auxiliary-space follow-up can reuse the result array and is a later optimization.
