/*
 * ==========================================
 * Problem: Copy an array
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * [1, 2, 3, 4]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to copy each element
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Create a new array of the same length.
 *
 * Step 3:
 * Traverse the original array and copy each element to the new array.
 *
 * Step 4:
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
