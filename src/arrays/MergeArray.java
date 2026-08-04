/*
 * ==========================================
 * Problem: Merge two arrays into a single combined array.
 *          You are given two arrays of integers and must create a new array that contains all values
 *          from the first array followed by all values from the second array. This is a common data-structure
 *          exercise that tests array allocation and element copying.
 * ==========================================
 *
 * 1. What is the input?
 * Two integer arrays: arr1 and arr2.
 * Example: arr1 = [1, 2, 3], arr2 = [4, 5]
 *
 * 2. What is the expected output?
 * A new single array that contains all elements from both arrays in order.
 * Example: [1, 2, 3, 4, 5]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to copy values from both arrays into the new result array.
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
 * Create a new array with length equal to arr1.length + arr2.length.
 *
 * Step 4:
 * Copy all elements of arr1 into the new array from index 0 onward.
 *
 * Step 5:
 * Copy all elements of arr2 into the next available positions in the merged array.
 *
 * Step 6:
 * Print the merged result.
 *
 * ==========================================
 * Time Complexity : O(n + m)
 * Space Complexity: O(n + m)
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
