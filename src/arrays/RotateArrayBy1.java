/*
 * ==========================================
 * Problem: Rotate an array by one position to the left
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 3, 4, 5]
 *
 * 2. What is the expected output?
 * [2, 3, 4, 5, 1]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to shift elements left by one position
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Save the first element in a temporary variable.
 *
 * Step 3:
 * Shift each element one position to the left.
 *
 * Step 4:
 * Put the saved first element at the end of the array.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayBy1 {
    
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
        int[] rotatedArray = rotateArrayBy1(arr);
        System.out.print("The reversed array is:" + Arrays.toString(rotatedArray));
    }

    public static int[] rotateArrayBy1(int[] arr){

            int moveLastIndex = arr[0];
        for(int i=1; i<arr.length; i++){

            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = moveLastIndex;

        return arr;
    }

}
