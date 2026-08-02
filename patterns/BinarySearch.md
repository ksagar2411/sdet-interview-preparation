# Binary Search

## Problems using this pattern

Not yet used in `src/`.

## Core idea

Search a sorted range by discarding half after each midpoint comparison.

## Generic template

```java
int left = 0, right = arr.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] < target) left = mid + 1;
    else right = mid - 1;
}
return -1;
```

## Common mistakes

- Using an unsorted input.
- Updating the wrong boundary.
- Midpoint overflow.

## Complexity

O(log n) time and O(1) iterative space.
