# Java Revision Notes

## Scanner usage

- `nextInt()` reads an integer token; validate size before allocating an array.
- `next()` reads one word; `nextLine()` reads a full line, including spaces.
- Closing a `Scanner` over `System.in` closes standard input; do not close it before all required reads.

## Arrays

- Valid indexes are `0` through `arr.length - 1`; `arr.length` is not an index.
- Arrays are fixed-size; a negative size throws `NegativeArraySizeException`.
- `Arrays.toString(arr)` prints readable values such as `[1, 2, 3]`.
- Arrays are passed by value of their reference: mutating elements in a method changes the caller's array. In-place reverse, rotation, and move-zeroes show this.

## Methods and return values

- `static` methods can be called from `main` without an object.
- Define no-result behavior before callers use it (`-1`, `null`, or `OptionalInt`).
- Return after a loop unless an early return is the intended final answer.
- Integer division truncates: `3 / 2` is `1`.

## Strings and characters

- Strings are immutable; `result += value` inside a loop is O(n²). Use `StringBuilder` for repeated appends.
- Compare text with `equals()`, never `==`.
- `charAt(i)` requires `0 <= i < length()`.
- `Character.isLetter(ch)` filters digits and punctuation before consonant counting.

## Loop boundaries

- Forward: `i = 0; i < length; i++`.
- Reverse: start at `length - 1`; continue while `i >= 0`.
- Adjacent checks start at `1` so `i - 1` is valid.

## Inheritance and polymorphism

- `Dog extends Animal` inherits behavior and can override instance methods.
- An `Animal` reference can refer to a `Dog` or `Cat`; the overridden method is selected at runtime.
- A plain `Animal` cannot be assigned to a `Dog` reference without a valid downcast.

## Bootcamp Day 1 Java focus

- **Method return flow:** every execution path in a non-`void` method must return a compatible value. Put the final return after the loop when the loop must examine all values.
- **Early return:** return inside a loop only when the answer is final, such as a successful linear-search match. Do not return while still computing a maximum, minimum, or count.
- **Loop boundaries:** start the read pointer at `1` when comparing against the first sorted value; keep `read < arr.length`.
- **Scanner usage:** read `n` before allocating input; an `n - 1` missing-number problem should allocate exactly `n - 1` values.
- **`Arrays.toString()`:** use it to inspect the in-place unique prefix or transformed arrays while debugging.
- **Time vs space:** the read/write-pointer, running-minimum, summation, and XOR solutions are O(n) time and O(1) auxiliary space; a brute-force pair of loops is O(n²).
