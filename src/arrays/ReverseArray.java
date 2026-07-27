/*
 * ==========================================
 * Problem:
 * Reverse an array
 * ==========================================
 *
 * 1. What is the input?
 * Example:
 * [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * [4, 3, 2, 1]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * Reverse for loop
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and its elements.
 *
 * Step 2:
 * Create an empty array to store the reversed values.
 *
 * Step 3:
 * Traverse the array from last element to first.
 *
 * Step 4:
 * Store each element into the new array in reverse order.
 *
 * Step 5:
 * Print the reversed array.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value for elemnt no. " + i + " :");
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] reversed = reversearr(n, arr);
		System.out.println("The reversed array is:" + Arrays.toString(reversed));
	}

	public static int[] reversearr(int size, int[] arr) {
		int[] revarr = new int[size];

		for (int i = arr.length - 1; i >= 0; i--) {
			revarr[size -1 -i] = arr[i];
		}
		return revarr;
	}
}
