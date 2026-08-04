/*
 * ==========================================
 * Problem: Find the second largest element in an integer array.
 *          You are given an array of numbers and must identify the second greatest value after the largest one.
 *          This problem is a good example of tracking multiple candidate values while scanning the array.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array of size n.
 * Example: [10, 25, 7, 41, 3]
 *
 * 2. What is the expected output?
 * The second largest distinct or current best value in the array.
 * Example: 25
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to compare every value with the current largest and second largest values.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and all elements.
 *
 * Step 2:
 * Initialize the first element as the current largest value and set the second-largest value to the minimum integer.
 *
 * Step 3:
 * Traverse the array from left to right.
 *
 * Step 4:
 * If the current value is greater than the current largest value, shift the largest to second largest and update the largest.
 *
 * Step 5:
 * If the current value is smaller than the largest but greater than the second largest, update the second largest.
 *
 * Step 6:
 * Print the second largest value at the end.
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
