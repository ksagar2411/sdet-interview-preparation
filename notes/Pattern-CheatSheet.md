# Pattern Recognition Cheat Sheet

| Pattern | Recognition Clues | Invariant | Typical Complexity | Representative Problems |
|---|---|---|---|---|
| Running Minimum | cheapest, lowest earlier value, buy price | minimum of the processed prefix | O(n), O(1) | Buy Sell Stock, Smallest Element |
| Running Maximum | largest, best so far, second best | maximum/best values of the processed prefix | O(n), O(1) | Largest Element, Second Largest |
| Reverse Running Maximum | right side, leaders, suffix maximum | `maxRight` is the maximum seen from the right | O(n), O(1) plus output | Leaders in Array |
| Read/Write Pointer | remove, move, compact, filter | prefix through `write` contains accepted values | O(n), O(1) | Move Zeroes, Remove Duplicates |
| Two Pointers | sorted inputs, mirrored positions, merge | pointers mark the next unprocessed values | O(n + m) or O(n), O(1) | Merge Sorted Arrays, Reverse Array |
| Prefix Sum | cumulative, range sum, left/right balance | prefix state summarizes values before/through an index | O(n), O(1) or O(n) | Running Sum, Pivot Index |
| Prefix/Suffix Product | product except self, exclude current | left/right products exclude current index | O(n), O(n) | Product Except Self |
| Running Count | frequency, streak, consecutive | count describes the processed/current run | O(n), O(1) | Occurrences, Consecutive Ones |
| HashMap / Set | complement, frequency, visited, duplicate | map/set records processed values | expected O(n), O(n) | Two Sum optimization, Intersection |
| XOR / Formula | one missing value, cancellation | accumulator represents range difference | O(n), O(1) | Missing Number |
| Sliding Window | contiguous subarray/window | window state satisfies its constraint | O(n), O(1)-O(k) | future practice |

Before coding: name the pattern, state the invariant, define the contract, and set the target complexity.
