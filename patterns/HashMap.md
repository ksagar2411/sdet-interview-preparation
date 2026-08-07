# HashMap

## Problems using this pattern

No current implementation uses a `HashMap`. It is the next optimization for Two Sum.

## When to recognize it

Use it for complements, frequencies, membership, or revisiting values.

## Invariant

The map stores the relevant information for values processed before the current index.

## Typical algorithm

Store seen values with indexes and look up the needed complement.

## Generic template

```java
Map<Integer, Integer> seen = new HashMap<>();
for (int i = 0; i < arr.length; i++) {
    int need = target - arr[i];
    if (seen.containsKey(need)) return new int[] { seen.get(need), i };
    seen.put(arr[i], i);
}
```

## Common mistakes

- Inserting before lookup when an element cannot be reused.
- Ignoring duplicate-value requirements.

## Complexity

Expected O(n) time and O(n) space.
