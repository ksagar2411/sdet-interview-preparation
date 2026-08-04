/*
 * ==========================================
 * Problem: Find the maximum profit that can be earned by buying and selling a stock exactly once.
 *          You are given the daily prices of a stock and must choose one day to buy and one later day to sell
 *          so that the difference is as large as possible. This problem helps practice greedy reasoning and
 *          maintaining the minimum price seen so far while scanning the array.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array representing stock prices for each day.
 * Example: [7, 1, 5, 3, 6, 4]
 *
 * 2. What is the expected output?
 * The maximum possible profit that can be obtained by one buy and one sell.
 * Example: 5
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to track the lowest price seen so far and compare profit with the best profit value.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and each stock price value.
 *
 * Step 2:
 * Initialize the minimum price to the first array value and the best profit to 0.
 *
 * Step 3:
 * Traverse the array from left to right.
 *
 * Step 4:
 * If the current price is lower than the minimum seen so far, update the minimum price.
 *
 * Step 5:
 * Compute the profit for the current day using current price - minimum price.
 *
 * Step 6:
 * Update the maximum profit whenever the newly computed profit is greater than the previous best.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class BuySellStocks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);

        // Max Profit
        System.out.print("Maximum profit: " + buySell(arr));
    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int buySell(int[] arr) {

        int minPrice = arr[0];
        int minPriceIndex = 0; //running minimum
        int bestBuyIndex = 0; //best minimum so far
        int sellPriceIndex = 0; 
        int maxProfit = 0;

        for (int currentPriceIndex = 0; currentPriceIndex < arr.length; currentPriceIndex++)
             {

            if (arr[currentPriceIndex] < minPrice) {
                minPrice = arr[currentPriceIndex];
                minPriceIndex = currentPriceIndex;
            }
            int currentProfit = arr[currentPriceIndex] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                bestBuyIndex = minPriceIndex;
                sellPriceIndex = currentPriceIndex;
            }
        }
        System.out.println("The buy trade will happen on day " + (bestBuyIndex + 1) + " at price " + arr[bestBuyIndex]);
        System.out.println("The sell trade will happen on day " + (sellPriceIndex + 1) + " at price " + arr[sellPriceIndex]);
        return maxProfit;

    }
}
