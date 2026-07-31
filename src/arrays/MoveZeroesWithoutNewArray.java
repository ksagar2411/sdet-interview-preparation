/*
 * ==========================================
 * Problem: Move zeroes to the end of the array without creating a new array
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
 * A forward for loop with a write index
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Maintain a write index for the next non-zero value.
 *
 * Step 3:
 * Traverse the array and swap non-zero values into the left side.
 *
 * Step 4:
 * Fill the remaining positions with zeroes.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesWithoutNewArray {
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
        int index = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[index];
                arr[index++] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
