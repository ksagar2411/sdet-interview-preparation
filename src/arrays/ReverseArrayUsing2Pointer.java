/*
 * ==========================================
 * Problem: Reverse an array using two pointers
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * [4, 3, 2, 1]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A two-pointer loop using start and end indices
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Initialize two pointers: one at the start and one at the end.
 *
 * Step 3:
 * Swap the elements at the two pointers while the start index is less than the end index.
 *
 * Step 4:
 * Print the reversed array.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsing2Pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for elemnt no. " + i + " :");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] reversed = reversearr(arr);
        System.out.print("The reversed array is:" + Arrays.toString(reversed));
    }

    public static int[] reversearr(int[] arr) {

        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        return arr;
    }
}
