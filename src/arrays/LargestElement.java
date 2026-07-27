/*
 * ==========================================
 * Problem: Find the largest element in an array
 * ==========================================
 *
 * 1. What is the input?
 * [10, 25, 7, 41, 3]
 *
 * 2. What is the expected output?
 * 41
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to compare each element with the current maximum
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and its elements.
 *
 * Step 2:
 * Initialize the first element as the current largest value.
 *
 * Step 3:
 * Traverse the array and update the largest value whenever a bigger element is found.
 *
 * Step 4:
 * Print the final largest value.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

// Bug note: The previous version returned from inside the loop,
// which caused the method to stop after comparing only the first two values.
// Correct flow is to update the max while iterating and return after the loop.
public class LargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = inputarr(size, sc);
		System.out.println("The largest element of the array is:" + largestelement(arr));
	}

	public static int[] inputarr(int size, Scanner arrScanner) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element at index " + i + " :");
			arr[i] = arrScanner.nextInt();
		}
		return arr;
	}

	public static int largestelement(int[] arr) {
		int templargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > templargest) {
				templargest = arr[i];
			}
		}
		return templargest;
	}
}
