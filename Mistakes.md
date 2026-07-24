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