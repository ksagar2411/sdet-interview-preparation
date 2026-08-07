# Mistakes

## Loop boundaries and indexing

- A reverse loop starts at `length() - 1`, continues while `i >= 0`, and decrements.
- `length()` is not a valid index; the final index is `length() - 1`.
- An adjacent comparison starts at index `1` so `i - 1` is valid.

## Input and string handling

- `next()` reads one token; use `nextLine()` when spaces are part of the input.
- A consonant must be both a letter and not a vowel.
- Do not append to the source string while reversing it; build a separate result.
- Repeated string concatenation in a loop is O(n^2); use `StringBuilder`.

## Search and pointer state

- Returning inside a full-array search ends it too early.
- Initialize extrema from an array value rather than `0` when negative values are valid.
- In a read/write scan, moving both pointers together can leave rejected values in the accepted prefix.
- Stock profit requires the minimum earlier price, not the previous price or a future global minimum.

## Result contracts

- Missing-number solutions require a consistent logical range and exactly one missing value.
- `TwoSum` needs a documented no-match result.
- Second Largest needs a documented no-distinct-value result; do not silently rely on `Integer.MIN_VALUE`.

## Pivot Index

- Do not include the pivot in `leftSum` before comparing sides.
- The first and last indexes are valid pivot candidates.
- `leftSum` means values strictly before the current pivot.

## Product Except Self

- Prefix and suffix arrays exclude the current index.
- `prefix[0] = 1` and `suffix[last] = 1` are base cases, not arbitrary constants.
