# Prefix Sum and Prefix/Suffix Product

## When to recognize it

Use prefix state for cumulative totals, range sums, balance between left and right sides, or a result that excludes the current position.

## Invariant

- A prefix sum represents values from the start through the current index, or strictly before it when the problem requires exclusion.
- For Pivot Index, `leftSum` contains values strictly before the current pivot.
- For Product Except Self, prefix and suffix products exclude the current index.

## Typical algorithm

For Running Sum, store the previous cumulative value plus the current value. For Pivot Index, compute the total once and derive the right side as `totalSum - leftSum - value`; compare before updating `leftSum`. For Product Except Self, build left products from `1`, right products from `1`, then combine them.

## Common mistakes

- Recalculating every prefix with nested loops.
- Updating `leftSum` before testing a pivot.
- Including the current value in a prefix or suffix product.
- Forgetting that the empty-product base case is `1`.

## Representative problems

- Running Sum of 1D Array (LeetCode 1480)
- Find Pivot Index (LeetCode 724)
- Product of Array Except Self (LeetCode 238)

## Complexity

Running Sum: O(n) time and O(n) output space. Pivot Index: O(n) time and O(1) auxiliary space. Prefix/suffix product arrays: O(n) time and O(n) auxiliary space.
