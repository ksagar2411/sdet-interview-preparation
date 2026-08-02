# Read/Write Pointer

## Problems using this pattern

- [`UniqueNoCount.java`](../src/arrays/UniqueNoCount.java) — `read` scans every sorted value; `write` marks the unique prefix.

## Core idea

Use `read` to visit every input value and `write` to mark the end of the accepted output prefix. The output is stored in the front of the same array.

## Generic template

```java
if (arr.length == 0) return 0;
int write = 0;
for (int read = 1; read < arr.length; read++) {
    if (arr[read] != arr[write]) {
        arr[++write] = arr[read];
    }
}
return write + 1;
```

## Common mistakes

- Moving `write` for a duplicate.
- Moving `read` and `write` together.
- Using this adjacent comparison on an unsorted array.

## Complexity

O(n) time and O(1) auxiliary space.
