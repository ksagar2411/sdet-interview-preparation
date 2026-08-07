# Java Revision Notes

## Scanner usage

- `nextInt()` reads an integer token; validate size before allocating an array.
- `next()` reads one word; `nextLine()` reads a full line, including spaces.
- Closing a `Scanner` over `System.in` closes standard input; finish all reads first.

## Arrays

- Valid indexes run from `0` through `arr.length - 1`; `arr.length` is not an index.
- Arrays have fixed size; negative size throws `NegativeArraySizeException`.
- Arrays are passed by value of their reference, so element mutation is visible to the caller.
- Use `Arrays.toString(arr)` when inspecting transformed arrays.

## Methods and return values

- `static` methods can be called from `main` without an object.
- Define no-result behavior before callers use it (`-1`, `null`, or `OptionalInt`).
- Return inside a loop only when the answer is final; otherwise return after the scan.
- Integer division truncates: `3 / 2` is `1`.

## Strings and characters

- Strings are immutable; use `StringBuilder` for repeated appends.
- Compare text with `equals()`, not `==`.
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
