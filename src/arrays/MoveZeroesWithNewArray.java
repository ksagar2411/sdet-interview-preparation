/*
 * ==========================================
 * Problem: Move zeroes to the end of the array using a new array
 * ==========================================
 *
 * 1. What is the input?
 * [0, 1, 0, 3, 12]
 *
 * 2. What is the expected output?
 * [1, 3, 12, 0, 0]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to copy non-zero elements
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Create a new array to store the result.
 *
 * Step 3:
 * Traverse the original array and copy each non-zero value into the new array.
 *
 * Step 4:
 * Fill the remaining positions of the new array with zeroes.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesWithNewArray {
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
        int[] zeroes = moveZeroes(arr);
        System.out.println("The reversed array is:" + Arrays.toString(zeroes));
    }

    public static int[] moveZeroes(int[] arr) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }
}
