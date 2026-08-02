# Mistakes.md

This file contains mistakes I made while learning Java for SDET interviews.
The goal is NOT to avoid mistakes, but to avoid repeating the same mistake twice.

---

# Mistake #1 - Reverse Loop Condition

Problem:
Reverse String

Wrong:

```java
for(int i = str.length() - 1; i <= 0; i--)
```

Correct:

```java
for(int i = str.length() - 1; i >= 0; i--)
```

Learning:

- Reverse loop starts from length()-1.
- Continue while i >= 0.
- Decrement using i--.

---

# Mistake #2 - Array/String Index

Remember:

```
Last Index = length() - 1
```

NOT

```
length()
```

Otherwise:

```
StringIndexOutOfBoundsException
```

---

# Mistake #3 - Scanner Input

Difference:

```java
sc.next()
```

- Reads only one word.

Example:

Input

```
I love Java
```

Output

```
I
```

---

```java
sc.nextLine()
```

Reads the complete sentence.

Example

```
I love Java
```

Output

```
I love Java
```

---

# Mistake #4 - Counting Consonants

Wrong logic:

```
Not vowel
```

is NOT enough.

Digits and special characters are NOT consonants.

Correct logic:

```
Character is alphabet

AND

Character is NOT vowel
```

Use:

```java
Character.isLetter(ch)
```

---

# Mistake #5 - Don't Modify Input Variable

While reversing a word I wrote:

```java
word += word.charAt(j);
```

This modified the original string while I was still processing it.

Correct approach:

Create a new variable.

```java
String reversedWord = "";
```

Append characters into the new variable.

Return the new variable.

---

# Mistake #6 - Off By One Error

Wrong:

```java
for(int i = 0; i < splitstr.length - 1; i++)
```

This skips the last element.

Preferred:

```java
for(int i = 0; i < splitstr.length; i++)
```

or

```java
for(int i = 0; i <= splitstr.length - 1; i++)
```

The first version is cleaner.

---

# Mistake #7 - trim()

Wrong idea:

```java
(word + " ").trim()
```

trim() removes the trailing space immediately.

Correct:

Append spaces while building the final string.

```java
result += word + " ";
```

After the loop:

```java
System.out.println(result.trim());
```

Trim only once.

---

# Mistake #8 - Repeated Method Calls

Avoid:

```java
str.charAt(i)
str.charAt(i)
str.charAt(i)
```

Better:

```java
char ch = str.charAt(i);
```

Improves readability.

---

# Mistake #9 - Debug Before Asking

Whenever code doesn't work:

1. Put a breakpoint.
2. Run Debug mode.
3. Watch variable values.
4. Check loop execution.
5. Understand WHY it failed.
6. Fix it.

Do NOT immediately search for the solution.

---

# Mistake #10 - Think Before Coding

Before writing any program answer:

1. What is the input?
2. What is the expected output?
3. Which data structure should I use?
4. Which loop/technique should I use?
5. What variables do I need?

Only then start coding.

---

# Mistake #11 - Early Return Inside Loop

Problem:
Largest element search returned too early.

Wrong:

```java
for (int i = 0; i < arr.length - 1; i++) {
    // ...
    return templargest;
}
```

Correct:

- Initialize the largest value before the loop.
- Compare every element inside the loop.
- Return after the loop finishes.

Learning:

- A `return` inside a loop stops the loop immediately.
- Always let the search complete before returning the result.
- Initialize with an array value, not a fixed constant like `0`.

---

# Interview Reminder

Always mention:

- Time Complexity
- Space Complexity
- Edge Cases
- Possible Optimizations

Don't just write working code.
Explain your thinking.

---

# Personal Rule

If I get stuck:

❌ Don't immediately ask for the solution.

✅ Debug.
✅ Dry run on paper.
✅ Use breakpoints.
✅ Explain the problem to myself.
Only then ask for help if I'm still stuck.

This habit will make me a better SDET.

---

# Array contracts and edge cases

## Empty-array access

`LargestElement`, `SmallestElement`, `SecondLargest`, `CopyArray`, and `RotateArrayBy1` access `arr[0]`. They need a non-empty input contract or a guard.

## Missing-number size mismatch

Several missing-number programs allocate `n` positions but read `n - 1` values. The default `0` is outside the intended range but makes the representation misleading. The XOR implementation also uses a range inconsistent with that allocation, so it can return the wrong result.

## No-result and sentinel values

`TwoSum` returns the input array when no pair exists even though its caller expects two indexes. `SecondLargest` returns `Integer.MIN_VALUE` when no distinct answer exists. Both need explicit result contracts.

---

# String performance and input

## Repeated concatenation

`ReverseString`, `ReverseWords`, and `Palindrome` append to immutable strings inside loops. This creates temporary strings and makes the current approach O(n²); use `StringBuilder` for linear construction.

## Token versus sentence input

`next()` reads one word, while `nextLine()` reads a complete sentence. Choose based on whether spaces belong in the input.

---

# Bootcamp Day 1 — Pointer and return-flow mistakes

## Previous element versus running minimum

For stock profit, comparing only with the previous day's price misses the best earlier buy. Keep a `minPrice` that represents the lowest price seen before the current day.

## Read and write pointers moving together

In sorted duplicate removal, `read` must inspect every value, but `write` advances only for a newly accepted value. Moving both together leaves duplicates in the unique prefix.

## Global minimum versus running minimum

The minimum price must come from an earlier day. A global minimum found later cannot be used as the buy price for an earlier sale.

## Incomplete return paths

Every non-`void` method must return on every possible execution path. Use one final return after a full scan when no early answer is found.
