/*
 * ==========================================
 * Problem: Create a duplicate copy of an array.
 *          You are given an existing array and must produce a second array containing the same values
 *          in the same order. This problem teaches how to allocate a new array and populate it by iterating
 *          through the original array.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array of size n.
 * Example: [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * A separate array with identical values in the same order.
 * Example: [1, 2, 3, 4]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to read one element from the original array and write it into the new array.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the original array.
 *
 * Step 2:
 * Create a new array of the same length.
 *
 * Step 3:
 * Traverse the original array using an index variable.
 *
 * Step 4:
 * Copy each element to the matching index in the new array.
 *
 * Step 5:
 * Print the copied array.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);
        sc.close();

        // calling smallest element method
        int[] copiedarray = copyArray(arr);
        System.out.println("The new copied array is " + Arrays.toString(copiedarray));

    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        int[] copiedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copiedArray[i] = arr[i];
        }
        copiedArray[0] = 999;
        return copiedArray;

    }
}
