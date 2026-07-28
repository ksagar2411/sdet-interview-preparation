/*
 * ==========================================
 * Problem: Check whether an array is sorted in ascending order
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * true
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to compare adjacent elements
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Compare each element with the previous one.
 *
 * Step 3:
 * If any element is smaller than the previous one, return false.
 *
 * Step 4:
 * If all comparisons pass, return true.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class SortedArrayChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);
        sc.close();

        // calling smallest element method
        System.out.println("Is the array sorted: " + isSortedArray(arr));

    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isSortedArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;

    }

}
