/*
 * ==========================================
 * Problem: Reverse the order of elements in an array.
 *          You are given an integer array and must produce a new array where the elements appear in reverse order.
 *          This is a common interview problem that tests traversal direction and array reordering.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array.
 * Example: [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * The array in reverse order.
 * Example: [4, 3, 2, 1]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A reverse for loop that starts from the last index and moves backward.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and all its elements.
 *
 * Step 2:
 * Create a new array to hold the reversed result.
 *
 * Step 3:
 * Start scanning from the last index of the original array.
 *
 * Step 4:
 * Copy each element into the new array in the reversed sequence.
 *
 * Step 5:
 * Print the new array.
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
