# Golden Rules

1. Make it work.
2. Make it correct.
3. Make it clean.
4. Then optimize.

Never optimize code before it is correct.

---

Every loop deserves a dry run.

---

Boundary conditions are the first thing to verify.

---

Meaningful variable names improve readability.

---

Every program should answer:

- What is the Time Complexity?
- What is the Space Complexity?

---

If I cannot explain the code,
I do not truly understand it.

---

## Additional interview rules

- O(2n) simplifies to O(n); retain different input sizes as O(n + m).
- Space complexity counts extra memory; count result arrays, not scalar variables.
- State the input contract before coding: empty input, duplicates, and no-solution behavior.
- Draw indexes and expected state before in-place array changes.
- Initialize a minimum or maximum from the first element when negative values are possible.
- Return early only when the answer is final; otherwise return after the loop.
- Use `StringBuilder` for repeated string construction inside loops.

---

## Bootcamp Day 1 rules

- For a sorted array, compare the current read value with the last value written to the unique prefix.
- In read/write-pointer problems, move `read` on every iteration; advance `write` only when a value is accepted.
- For buy/sell profit, maintain the minimum price seen **so far**, not the global minimum of the whole array.
- When an algorithm needs an answer after scanning all elements, keep one final return after the loop so every path returns.
- Formula and XOR missing-number solutions require the same declared range and exactly one missing value.
