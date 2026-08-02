# Two Pointers

## Problems using this pattern

- [`ReverseArrayUsing2Pointer.java`](../src/arrays/ReverseArrayUsing2Pointer.java) — pointers move inward and swap mirrored values.
- [`MoveZeroesWithoutNewArray.java`](../src/arrays/MoveZeroesWithoutNewArray.java) — read pointer scans while the write position advances for non-zero values.
- [`UniqueNoCount.java`](../src/arrays/UniqueNoCount.java) — read/write-pointer variant for a sorted array.

`Palindrome` is a natural next application, but no array program uses it.

## Core idea

Use two indexes that move toward each other, or separate read and write positions.

## Generic template

```java
int left = 0, right = arr.length - 1;
while (left < right) {
    // use or swap arr[left] and arr[right]
    left++;
    right--;
}
```

## Common mistakes

- Forgetting to move a pointer.
- Using the wrong stopping condition.
- Losing the required stable order.

## Complexity

Usually O(n) time and O(1) auxiliary space.
