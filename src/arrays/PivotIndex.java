/*
 * ==========================================
 * Problem: Find the pivot index in an array where the sum of elements
 * to the left equals the sum of elements to the right.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array.
 * Example: [1, 7, 3, 6, 5, 6]
 *
 * 2. What is the expected output?
 * The index of the pivot where left sum equals right sum, or -1 if none.
 * Example: 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward loop with running total or prefix/suffix sums.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Compute the total sum of the array.
 *
 * Step 2:
 * Iterate left to right maintaining a left sum and derive the right sum.
 *
 * Step 3:
 * Return the index where left sum equals right sum.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

public class PivotIndex {

    public static void main(String[] args) {

        //int[] arr = { 1, 7, 6, 5, 14 };
        int[] arr = {2,1,-1};
        System.out.println(findPivotIndex(arr));

    }

    public static int findPivotIndex(int[] arr) {

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int pivotLeftSide = 0;
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int pivotRightSide = totalSum - pivotLeftSide - arr[pivot];
            if (pivotLeftSide == pivotRightSide) {
                return pivot;
            } else {
                pivotLeftSide += arr[pivot];
            }
        }

        return -1;
    }
}
