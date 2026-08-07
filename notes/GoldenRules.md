# Golden Rules

- Make code work, make it correct, make it clean, then optimize it.
- Define every variable's meaning and the loop invariant before coding.
- State the input and result contracts: empty input, duplicates, and no-solution behavior.
- Dry-run boundaries first: empty, one element, first index, last index, and duplicates.
- Compare state before updating it when the current element must be excluded from one side of a calculation.
- Reuse previous computation: a running sum is a prefix sum, not a repeated scan.
- In read/write-pointer problems, `read` inspects every value; `write` advances only for accepted values.
- A running minimum or maximum represents values seen so far, never a future/global value.
- Prefix Product starts with `1`; Suffix Product ends with `1` because the empty product is `1`.
- Return early only when the answer is final; otherwise return after the full scan.
- Use meaningful names, and always state time and auxiliary-space complexity.
