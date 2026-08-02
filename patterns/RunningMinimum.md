# Running Minimum

## Problems using this pattern

- [`BuySellStock.java`](../src/arrays/BuySellStock.java) — tracks the lowest earlier price before calculating each day's profit.

## Core idea

At each day, store the smallest price seen on an earlier or current day. Compare today's price with that running minimum to get the best valid profit ending today.

## Generic template

```java
int minPrice = prices[0];
int maxProfit = 0;
for (int i = 1; i < prices.length; i++) {
    minPrice = Math.min(minPrice, prices[i]);
    maxProfit = Math.max(maxProfit, prices[i] - minPrice);
}
return maxProfit;
```

## Common mistakes

- Comparing only with the previous price.
- Using a global minimum that occurs after the sell day.
- Forgetting the empty-array contract.

## Complexity

O(n) time and O(1) auxiliary space.
