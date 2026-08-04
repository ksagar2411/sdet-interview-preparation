/*
 * ==========================================
 * Problem: Find the common elements present in two integer arrays.
 *          You are given two arrays and must return the set of values that appear in both.
 *          This is a common interview problem that helps practice nested loops, membership checks,
 *          and handling duplicates carefully while building the result.
 * ==========================================
 *
 * 1. What is the input?
 * Two integer arrays.
 * Example: arr1 = [1, 2, 2, 4, 7] and arr2 = [2, 3, 6, 2, 7]
 *
 * 2. What is the expected output?
 * A new array containing the common elements without repeating any value.
 * Example: [2, 7]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A nested loop to check whether each value from the first array exists in the second array,
 * plus an extra scan over the result buffer to avoid duplicates.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Traverse every element in the first array.
 *
 * Step 2:
 * For each element, check whether it exists in the second array using a loop.
 *
 * Step 3:
 * If the value is found, verify whether it has already been inserted in the result.
 *
 * Step 4:
 * If it is not already present, store it in the intersection array.
 *
 * Step 5:
 * After the scan finishes, return only the used portion of the result array.
 *
 * ==========================================
 * Time Complexity : O(n * m)
 * Space Complexity: O(k)
 * ==========================================
 */
package arrays;

import java.util.Arrays;

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 2, 4, 7 };
        int[] arr2 = { 2, 3, 6, 2, 7 };
        System.out.println("The intersection array is: " + Arrays.toString(arrayIntersection(arr1, arr2)));
    }

    public static int[] arrayIntersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int interArrIndex = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                boolean alreadyAdded = false;
                for (int k = 0; k < interArrIndex; k++) {
                    if (intersection[k] == arr1[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    intersection[interArrIndex] = arr1[i];
                    interArrIndex++;
                }
            }
        }

        return Arrays.copyOf(intersection, interArrIndex);
    }
}
