# Recursion

## Problems using this pattern

Not yet used in `src/`.

## Core idea

Reduce a problem to a smaller instance and stop at a reachable base case.

## Generic template

```java
ReturnType solve(Input input) {
    if (/* base case */) return baseValue;
    return solve(/* smaller input */);
}
```

## Common mistakes

- Missing base case.
- No progress toward the base case.
- Forgetting call-stack space.

## Complexity

State both total work and recursion depth/stack space.
