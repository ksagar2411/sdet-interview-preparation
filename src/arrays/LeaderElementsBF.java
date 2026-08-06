/*
 * ==========================================
 * Problem: Find leader elements in an array using a brute-force approach.
 *          A leader is an element greater than all elements to its right.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array.
 * Example: [16, 17, 4, 3, 5, 2]
 *
 * 2. What is the expected output?
 * An array containing the leader elements.
 * Example: [17, 5, 2]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * Nested loops for brute-force comparisons.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * For each element, compare it with all elements to its right.
 *
 * Step 2:
 * If no right-side element is greater, record it as a leader.
 *
 * ==========================================
 * Time Complexity : O(n^2)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;

public class LeaderElementsBF {

    public static void main(String[] args) {

        int[] arr = { 2, 8, 6, 1, 3 };
        // { 0, 1, 2, 3, 4 }
        System.out.println(Arrays.toString(leaderElements(arr)));

    }

    public static int[] leaderElements(int[] arr) {

        int size = arr.length;
        int[] leaderArray = new int[size];
        int leaderIndex = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            boolean isLeader = true;
            for (int j = arr.length - 1; j >= i; j--) {

                if (arr[i] < arr[j])
                    isLeader = false;
            }

            if (isLeader) {
                leaderArray[leaderIndex] = arr[i];
                leaderIndex++;
            }
        }

        return leaderArray;
    }

}
