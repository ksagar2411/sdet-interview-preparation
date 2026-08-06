/*
 * ==========================================
 * Problem: Find leader elements in an array using an optimal backward scan.
 *          A leader is an element greater than or equal to all elements to its right.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array.
 * Example: [16, 17, 4, 3, 5, 2]
 *
 * 2. What is the expected output?
 * An array containing the leader elements in the order they are found.
 * Example: [17, 5, 2]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A backward for loop tracking the maximum seen so far.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Scan the array from right to left while maintaining the maximum value seen.
 *
 * Step 2:
 * If the current element is >= max seen, record it as a leader and update max.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;

public class LeaderElementsOptimal {

    public static void main(String[] args) {

        int[] arr = { 2, 8, 6, 1, 3 };
        // { 0, 1, 2, 3, 4 }
        System.out.println(Arrays.toString(leaderElements(arr)));

    }

    public static int[] leaderElements(int[] arr) {

        int size = arr.length;
        int[] leaderArray = new int[size];
        int leaderIndex = 0;
        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                leaderArray[leaderIndex] = arr[i];
                leaderIndex++;
                max = arr[i];
            }
        }

        return leaderArray;
    }

}
