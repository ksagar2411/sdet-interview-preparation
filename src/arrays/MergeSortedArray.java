/*
 * ==========================================
 * Problem: Merge two sorted integer arrays into a single sorted array.
 *          You are given two arrays that are already sorted in ascending order, and your task is to
 *          combine them into one sorted array containing all elements. This problem helps practice
 *          pointer-based merging and efficient array traversal.
 * ==========================================
 *
 * 1. What is the input?
 * Two sorted integer arrays.
 * Example: arr1 = [1, 2, 4, 7] and arr2 = [2, 3, 6]
 *
 * 2. What is the expected output?
 * A single sorted array containing all elements from both input arrays.
 * Example: [1, 2, 2, 3, 4, 6, 7]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A while loop with three indices: one for each input array and one for the merged output array.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Create a new output array with size equal to the sum of both input lengths.
 *
 * Step 2:
 * Use three pointers: one for arr1, one for arr2, and one for the new merged array.
 *
 * Step 3:
 * Compare the current elements from both arrays and place the smaller one into the merged array.
 *
 * Step 4:
 * Advance the pointer of the array whose value was copied.
 *
 * Step 5:
 * After one array is exhausted, copy the remaining elements from the other array to the end.
 *
 * ==========================================
 * Time Complexity : O(n + m)
 * Space Complexity: O(n + m)
 * ==========================================
 */
package arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 4, 7 };
        int[] arr2 = { 2, 3, 6 };
        System.out.println("The merged array is: " + Arrays.toString(mergeSortedArray(arr1, arr2)));
    }

    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        int mergedArrayIndex = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] <= arr2[arr2Index]) {
                mergedArray[mergedArrayIndex] = arr1[arr1Index];
                arr1Index++;
                mergedArrayIndex++;
            } else if (arr2[arr2Index] <= arr1[arr1Index]) {
                mergedArray[mergedArrayIndex] = arr2[arr2Index];
                arr2Index++;
                mergedArrayIndex++;
            }

        }
        while (arr1Index < arr1.length) {
            mergedArray[mergedArrayIndex] = arr1[arr1Index];
            arr1Index++;
            mergedArrayIndex++;
        }
        while (arr2Index < arr2.length) {
            mergedArray[mergedArrayIndex] = arr2[arr2Index];
            arr2Index++;
            mergedArrayIndex++;
        }

        return mergedArray;

    }
}
