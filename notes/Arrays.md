# Arrays

## Revision checklist

- [x] Traversal, aggregation, searching, copying, and transformations
- [x] Two pointers, running maximum, and missing-number variants
- [ ] HashMap Two Sum and binary search

## Sum of Array (`SumOfArray`, `ArraySumViaMethod`)

### Problem Statement
Sum all integer values in an array.
### Approach
Linear scan with a running sum; the method version separates input, output, and calculation.
### Algorithm
Initialize `sum = 0`, add each element, then return or print it.
### Time Complexity
O(n)
### Space Complexity
O(1) auxiliary space.
### Edge Cases
An empty array produces `0`; a large total can overflow `int`.
### Interview Follow-up
When should `long` be used? What does a stream solution trade for readability?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Average of Array (`AverageOfArray`)

### Problem Statement
Calculate the average of integer array values.
### Approach
Sum values, then divide by the array length.
### Algorithm
Accumulate `sum`; return `sum / arr.length`.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Empty input divides by zero. The `int` return type truncates fractions: `[1, 2]` returns `1`.
### Interview Follow-up
How would you return an exact fractional average and prevent sum overflow?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Copy Array (`CopyArray`)

### Problem Statement
Create a separate array containing input values.
### Approach
Allocate equal capacity and copy by index.
### Algorithm
Create `copiedArray`; assign `copiedArray[i] = arr[i]` for every index.
### Time Complexity
O(n)
### Space Complexity
O(n)
### Edge Cases
The current demonstration overwrites the first copied value with `999`, so it is not an unchanged copy and empty input fails.
### Interview Follow-up
Compare manual copying with `Arrays.copyOf` and `System.arraycopy`.
### Related Pattern
[Array Transformation](../patterns/ArrayTransformation.md)

## Count Occurrences (`CountOccurences`)

### Problem Statement
Count the instances of a target value.
### Approach
One scan with a counter.
### Algorithm
Increment `count` only when the current value equals the target.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Empty input or an absent target returns `0`.
### Interview Follow-up
How would many count queries be optimized?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Missing Number — Brute Force (`FindMissingNoBruteForce`)

### Problem Statement
Find one missing value from the range `1..n`.
### Brute Force Approach
Test each expected number by searching the entire array.
### Optimal Approach
Prefer summation or XOR for O(n) time when the input meets the one-missing-number contract.
### Algorithm
For each candidate in `1..n`, scan for a match; return the first absent candidate.
### Time Complexity
O(n²)
### Space Complexity
O(1)
### Edge Cases
The program allocates `n` positions but reads `n - 1`, leaving a default `0`; this is confusing even though `0` is outside the expected range.
### Interview Follow-up
How can this become O(n) without extra memory?
### Related Pattern
[Missing Number](../patterns/MissingNumber.md)

## Missing Number — Summation (`FindMissingNoOptimised`, `FindMissingNoUsingFormula`)

### Problem Statement
Find one missing value from `1..n`.
### Brute Force Approach
Test each expected number against every array value, which costs O(n²).
### Optimal Approach
Subtract the actual sum from the expected arithmetic-series sum. One version loops for expected sum; one uses `n * (n + 1) / 2`.
### Algorithm
Find `n`, calculate expected sum, calculate actual sum, and subtract.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Formula arithmetic can overflow `int`. `FindMissingNoOptimised` currently allocates `n` slots but reads `n - 1` values, leaving a default `0` outside the expected range.
### Interview Follow-up
Why might XOR be safer than summation?
### Related Pattern
[Missing Number](../patterns/MissingNumber.md)

## Find Missing Number — Formula (`FindMissingNoUsingFormula`)

### Problem Statement
Find one missing value from the expected range `1..n`.
### Brute Force Approach
For every value in `1..n`, scan the array to find an absence: O(n²) time.
### Optimal Approach
Compute the arithmetic-series total `n * (n + 1) / 2`, subtract the array sum, and return the difference.
### Algorithm
Set `n = arr.length + 1`; calculate the expected sum and actual element sum; return `expected - actual`.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
The supplied array must contain exactly `n - 1` values from `1..n` with one missing value. Use `long` for large `n` to avoid integer overflow.
### Interview Follow-up
Why does the formula work? When is XOR a better choice?
### Related Pattern
[Formula and XOR](../patterns/FormulaAndXOR.md)

## Missing Number — XOR (`FindMissingUsingXOR`)

### Problem Statement
Find the missing value by XOR cancellation.
### Brute Force Approach
Check every candidate value against every array element: O(n²) time.
### Optimal Approach
XOR expected values and actual values; equal values cancel.
### Algorithm
XOR the expected range, XOR all elements, then return the accumulated XOR.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
The implementation correctly allocates `n - 1` input values and XORs the range `1..n`. It requires exactly one missing number and no duplicate or out-of-range values.
### Interview Follow-up
Why does `x ^ x` cancel to zero, and what input contract does this require?
### Related Pattern
[Missing Number](../patterns/MissingNumber.md)

## Largest and Smallest Element (`LargestElement`, `SmallestElement`)

### Problem Statement
Find the maximum or minimum in an unsorted array.
### Approach
Use the first value as the current best and update it while scanning.
### Algorithm
Initialize `best = arr[0]`; compare each remaining element and update best.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Both methods require non-empty input. Initializing to `0` would fail for all-negative input.
### Interview Follow-up
How can min and max be found in one pass? Why is `return` outside the loop?
### Related Pattern
[Running Maximum](../patterns/RunningMaximum.md)

## Second Largest Distinct Element (`SecondLargest`)

### Problem Statement
Find the second-largest distinct value without sorting.
### Approach
Track largest and second-largest values in a single traversal.
### Algorithm
Promote a new largest; otherwise update the second-largest only for a distinct intermediate value.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Empty input fails. Without a distinct second value, the current method returns `Integer.MIN_VALUE`, an unclear contract.
### Interview Follow-up
How could `OptionalInt` express no result?
### Related Pattern
[Running Maximum](../patterns/RunningMaximum.md)

## Linear Search (`LinearSearch`)

### Problem Statement
Return the first target index, or `-1` if absent.
### Approach
Scan left to right and return as soon as a match is final.
### Algorithm
Compare each element; return its index on match, otherwise `-1` after the loop.
### Time Complexity
O(n), O(1) best case.
### Space Complexity
O(1)
### Edge Cases
Empty input returns `-1`; duplicates return the first index.
### Interview Follow-up
When is binary search valid?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Check Sorted Array (`SortedArrayChecker`)

### Problem Statement
Check whether values are in non-decreasing order.
### Approach
Compare adjacent values and stop at the first inversion.
### Algorithm
From index `1`, return `false` if `arr[i] < arr[i - 1]`; otherwise return `true` after the scan.
### Time Complexity
O(n), with early exit.
### Space Complexity
O(1)
### Edge Cases
Empty and one-element arrays are sorted; equal values are allowed.
### Interview Follow-up
How do strictly increasing and descending versions differ?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Reverse Array — New Array (`ReverseArray`)

### Problem Statement
Return a reversed copy without modifying the input.
### Approach
Write input elements into a new result array at mirrored positions.
### Algorithm
Traverse from the last index to zero and append each value to the result's next index.
### Time Complexity
O(n)
### Space Complexity
O(n)
### Edge Cases
Works for empty and one-element input if the supplied `size` agrees with the array length.
### Interview Follow-up
How can the reversal be done in place?
### Related Pattern
[Array Transformation](../patterns/ArrayTransformation.md)

## Reverse Array — In Place (`ReverseArrayUsing2Pointer`)

### Problem Statement
Reverse an array with no result array.
### Approach
Swap values at start and end pointers, then move them inward.
### Algorithm
While `left < right`, swap `arr[left]` and `arr[right]`, then increment/decrement pointers.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Empty, single-value, and odd-length arrays work; the input is mutated.
### Interview Follow-up
Why is `left < right` preferred over `left <= right`?
### Related Pattern
[Two Pointers](../patterns/TwoPointers.md)

## Rotate Array Left by One (`RotateArrayBy1`)

### Problem Statement
Shift every value left and move the first to the final index.
### Approach
Save the first value before shifting.
### Algorithm
Store `arr[0]`, assign each `arr[i]` to `arr[i - 1]`, then write the saved value at the end.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Empty input fails because `arr[0]` is read; one element remains unchanged.
### Interview Follow-up
How would you rotate by `k` efficiently?
### Related Pattern
[Array Transformation](../patterns/ArrayTransformation.md)

## Move Zeroes (`MoveZeroesWithNewArray`, `MoveZeroesWithoutNewArray`)

### Problem Statement
Move zeroes to the end while preserving non-zero order.
### Approach
The first version writes non-zero values to a new zero-initialized array; the second uses a write index and swaps forward in place.
### Algorithm
Scan values and place every non-zero at the next write position.
### Time Complexity
O(n)
### Space Complexity
O(n) for the new-array version; O(1) for the in-place version.
### Edge Cases
All-zero and no-zero arrays work. The in-place version mutates the input.
### Interview Follow-up
Why does the in-place method preserve order?
### Related Pattern
[Two Pointers](../patterns/TwoPointers.md)

## Maximum Consecutive Ones (`MaxConsecutive1Count`)

### Problem Statement
Find the longest contiguous streak of `1`s.
### Approach
Maintain current streak and the maximum streak.
### Algorithm
Increment the current count for `1`, reset otherwise, and update the maximum.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Empty input returns `0`; every non-`1` value ends a streak.
### Interview Follow-up
How can this find the longest run of any target value?
### Related Pattern
[Running Maximum](../patterns/RunningMaximum.md)

## Merge Two Arrays (`MergeArray`)

### Problem Statement
Concatenate two arrays.
### Approach
Allocate combined capacity, then copy the first and second arrays in order.
### Algorithm
Copy the first array, then append the second using a write index.
### Time Complexity
O(n + m)
### Space Complexity
O(n + m)
### Edge Cases
Either array can be empty. This is concatenation, not sorted merge.
### Interview Follow-up
How would sorted merge use two pointers?
### Related Pattern
[Array Transformation](../patterns/ArrayTransformation.md)

## Two Sum — Brute Force (`TwoSum`)

### Problem Statement
Return indexes of two values adding to a target.
### Approach
Use nested loops, beginning the inner loop at `i + 1`.
### Algorithm
Test every unique pair and return `[i, j]` at the first target sum.
### Time Complexity
O(n²)
### Space Complexity
O(1) auxiliary space, excluding the returned pair.
### Edge Cases
For no match, the current method returns the original array but `main` assumes an index pair; short inputs can fail. Define a no-solution result.
### Interview Follow-up
How does a HashMap reduce time to O(n)?
### Related Pattern
[Brute Force Pairs](../patterns/BruteForcePairs.md); [HashMap](../patterns/HashMap.md)

## Remove Duplicates from Sorted Array (`UniqueNoCount`)

### Problem Statement
Remove duplicates in place from a sorted array and return the count of unique values.
### Brute Force Approach
Use a separate array or collection to retain the first occurrence of each value, requiring O(n) extra space.
### Optimal Approach
Use a read pointer to inspect values and a write pointer to mark the final unique prefix.
### Algorithm
Return `0` for empty input. Set `write = 0`; for every `read` from `1`, increment `write` and copy `arr[read]` only when it differs from `arr[write]`.
### Time Complexity
O(n)
### Space Complexity
O(1) auxiliary space.
### Edge Cases
Empty input returns `0`; all equal values return `1`; the input must be sorted. Only `arr[0..uniqueCount-1]` is guaranteed to contain unique values.
### Interview Follow-up
How would you remove duplicates from an unsorted array? How would the method return the unique array rather than its count?
### Related Pattern
[Read/Write Pointer](../patterns/ReadWritePointer.md); [Two Pointers](../patterns/TwoPointers.md)

## Best Time to Buy and Sell Stock (`BuySellStock`)

### Problem Statement
Find the maximum profit from one buy followed by one later sell.
### Brute Force Approach
Test every buy day against every later sell day and retain the largest difference: O(n²) time.
### Optimal Approach
Track the minimum price seen before the current day and calculate today's potential profit from that running minimum.
### Algorithm
Initialize `minPrice` to the first price and `maxProfit` to `0`. For each later price, update `minPrice` if it is lower, compute `price - minPrice`, and update `maxProfit`.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
The current method assumes a non-empty array. Descending prices return `0`, representing no transaction. A sell must occur after its buy because the running minimum comes from earlier days.
### Interview Follow-up
How would you return the buy/sell indexes? How does the solution change when multiple transactions are allowed?
### Related Pattern
[Running Minimum](../patterns/RunningMinimum.md)

---

# Bootcamp Day 2

## Second Largest Element (`SecondLargest`)

### Problem Statement

Return the second-largest **distinct** value in an integer array.

### Brute Force Approach

Use two traversals: first find the largest value, then find the largest value strictly smaller than it.

### Optimal Approach

Use the Running Maximum pattern in one traversal, maintaining `largest` and `secondLargest`.

### Invariant

After processing each element, `largest` is the greatest value seen so far and `secondLargest` is the second-greatest distinct value seen so far.

### Algorithm

Initialize `largest` from the first array value. For each remaining value, promote it when it is larger than `largest`; otherwise update `secondLargest` only when it falls strictly between the two tracked values.

### Time Complexity

O(n)

### Space Complexity

O(1)

### Edge Cases

- Duplicate largest values must not become the second-largest distinct value.
- A single-element or all-equal array has no distinct answer.
- `-1` is a clearer result only if negative values are disallowed; `Integer.MIN_VALUE` can also be a valid input. Define the contract explicitly.

### Common Mistakes

- Initializing `largest` to `0` instead of an array value.
- Forgetting the distinctness check (`arr[i] != largest`).
- Processing the first element again after using it for initialization.

### Learning

Running Maximum is the opposite of the running-minimum technique used for stock profit.

### Related Pattern

[Running Maximum](../patterns/RunningMaximum.md)

## Merge Two Sorted Arrays (`MergeSortedArray`)

### Problem Statement

Merge two ascending arrays into one ascending array.

### Pattern

Three-pointer merge: `arr1Index`, `arr2Index`, and `mergedArrayIndex`.

### Invariant

The merged prefix is always sorted, and each pointer refers to the first unprocessed element in its array.

### Algorithm

1. While both arrays have unprocessed values, copy the smaller current value.
2. Copy any remaining values from the first array.
3. Copy any remaining values from the second array.

### Time Complexity

O(n + m)

### Space Complexity

O(n + m) for the merged output.

### Edge Cases

- Either input can be empty.
- Equal values are retained in sorted order.
- One input can be fully consumed before the other.

### Mistakes Made

- Special-casing the first output element instead of applying the same comparison rule.
- Attempting one `for` loop instead of the three canonical merge phases.
- Copying from `arr1` instead of `arr2` in the final remaining-elements loop.

### Learning

This is the standard merge operation reused by Merge Sort.

### Related Pattern

Merge pattern / two pointers with a third output pointer.

## Intersection of Two Arrays — Brute Force (`ArrayIntersection`)

### Problem Statement

Return the distinct values that occur in both input arrays.

### Brute Force Approach

For each value in the first array, use a nested loop to search the second array. Before adding a match, scan the result prefix to prevent duplicates.

### Algorithm

1. Allocate a result buffer of `min(arr1.length, arr2.length)`.
2. For each first-array value, search the second array for a match.
3. If found, ensure it has not already been added, then append it.
4. Return only the populated portion of the result buffer.

### Time Complexity

O(n × m) in the worst case; duplicate checking remains within that bound.

### Space Complexity

O(min(n, m)) for the result buffer.

### Edge Cases

- Empty input produces an empty intersection.
- Duplicate values should appear once in the result.
- Result order follows the first array.

### Discussion

Removing duplicates with only arrays requires another scan of the result. A `HashSet` naturally tracks membership and uniqueness; its optimized solution is intentionally postponed until Java Collections.

### Learning

The need for a better data structure should be recognized before learning the implementation details of `HashSet`.

### Related Pattern

Nested Comparison Pattern; future [HashMap / Set](../patterns/HashMap.md) optimization.
