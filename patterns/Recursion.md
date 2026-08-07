# Recursion

## Problems using this pattern

Not yet used in `src/`.

## When to recognize it

Use it when the problem naturally reduces to a smaller instance of itself.

## Invariant

Each recursive call receives a smaller valid subproblem that progresses toward a base case.

## Typical algorithm

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
