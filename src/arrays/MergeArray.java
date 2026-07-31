/*
 * ==========================================
 * Problem: Merge two arrays into one array
 * ==========================================
 *
 * 1. What is the input?
 * Array 1: [1, 2, 3]
 * Array 2: [4, 5]
 *
 * 2. What is the expected output?
 * [1, 2, 3, 4, 5]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to copy elements from both arrays
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the first array.
 *
 * Step 2:
 * Read the size and elements of the second array.
 *
 * Step 3:
 * Create a new array large enough to hold both arrays.
 *
 * Step 4:
 * Copy all elements from the first array into the new array.
 *
 * Step 5:
 * Copy all elements from the second array after the first array elements.
 *
 * Step 6:
 * Print the merged array.
 *
 * ==========================================
 * Time Complexity : O(n + m) --> O(n)
 * Space Complexity: O(n + m) --> O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int array1Size = sc.nextInt();
        int[] array1 = inputElements(array1Size, sc);

        System.out.print("Enter the size of second array: ");
        int array2Size = sc.nextInt();
        int[] array2 = inputElements(array2Size, sc);

        sc.close();

        int[] mergedArray = mergeArray(array1, array2);
        System.out.println("The merged array is: " + Arrays.toString(mergedArray));

    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        int currentIndex = arr1.length;
        for (int j = 0; j < arr2.length; j++) {
            mergedArray[currentIndex] = arr2[j];
            currentIndex = currentIndex + 1;
        }

        return mergedArray;

    }
}
