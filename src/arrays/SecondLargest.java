/*
 * ==========================================
 * Problem: Find the second largest element in an array
 * ==========================================
 *
 * 1. What is the input?
 * [10, 25, 7, 41, 3]
 *
 * 2. What is the expected output?
 * 25
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to compare each element with the current largest and second largest values
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and its elements.
 *
 * Step 2:
 * Initialize the first element as the current largest value and set the second largest to the minimum integer value.
 *
 * Step 3:
 * Traverse the array and update the largest and second largest values accordingly.
 *
 * Step 4:
 * Print the final second largest value.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class SecondLargest {

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
		int secondLargest = secondLargest(arr);
		System.out.println("Second Largest: " + secondLargest);
	}

	public static int secondLargest(int[] arr) {
		int templargest = arr[0];
		int secondlargest = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > templargest) {
				secondlargest = templargest;
				templargest = arr[i];}
				else if(arr[i]>secondlargest && arr[i]<templargest){
					secondlargest=arr[i];
				}
		}
		return secondlargest;

	}

}
