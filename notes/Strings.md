# Strings

## Count Vowels (`VowelsCount`)

### Problem Statement
Count `a`, `e`, `i`, `o`, and `u` in a sentence.
### Approach
Lowercase the input, then compare every character with the five vowels.
### Algorithm
Read a line; increment a counter when the current character is a vowel.
### Time Complexity
O(n)
### Space Complexity
O(1) auxiliary space.
### Edge Cases
Spaces, digits, and punctuation are ignored; Unicode vowel rules are not part of this definition.
### Interview Follow-up
How can a `Set` improve readability? When does locale matter in `toLowerCase()`?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Count Consonants (`ConsonantsCount`)

### Problem Statement
Count letters that are not vowels.
### Approach
Use `Character.isLetter(ch)` to filter non-letters, then exclude vowels.
### Algorithm
Scan once; count every alphabetic non-vowel.
### Time Complexity
O(n)
### Space Complexity
O(1)
### Edge Cases
Digits, punctuation, and spaces are excluded. `y` is treated as a consonant.
### Interview Follow-up
How would the rule change if `y` can be a vowel?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Reverse String (`ReverseString`)

### Problem Statement
Reverse the characters in a string.
### Approach
Traverse from the final index to zero and append characters.
### Algorithm
Start at `length() - 1` and append `charAt(i)` until zero.
### Time Complexity
O(n²) in the current code because repeated `String` concatenation creates new strings.
### Space Complexity
O(n), plus temporary concatenation allocations.
### Edge Cases
`next()` reads only one word, not a sentence.
### Interview Follow-up
Why does `StringBuilder` make this O(n)?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Reverse Each Word (`ReverseWords`)

### Problem Statement
Reverse characters in each word while keeping word order: `Java is easy` → `avaJ si ysae`.
### Approach
Split, reverse each token, join with spaces, then trim the final separator.
### Algorithm
For each word, traverse from last character to first and append to the result.
### Time Complexity
O(n²) in the current code because both word and sentence construction repeatedly concatenate immutable strings.
### Space Complexity
O(n) for tokens and output.
### Edge Cases
`split(" ")` does not preserve original repeated whitespace.
### Interview Follow-up
How would you reverse word order instead? How does `StringBuilder` help?
### Related Pattern
[Linear Scan](../patterns/LinearScan.md)

## Palindrome (`Palindrome`)

### Problem Statement
Check whether a string equals its reverse.
### Approach
Build a reverse, then compare with `equals()`.
### Algorithm
Reverse the input; print the result of `str.equals(rev)`.
### Time Complexity
O(n²) in the current code due to repeated string concatenation.
### Space Complexity
O(n)
### Edge Cases
The check is case-sensitive and token-based, so it does not ignore spaces or punctuation.
### Interview Follow-up
How can two pointers solve this in O(1) extra space? Why is `==` incorrect?
### Related Pattern
[Two Pointers](../patterns/TwoPointers.md)
