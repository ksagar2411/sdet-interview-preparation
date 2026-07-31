/*
 * ==========================================
 * Problem: Calculate the sum of array elements using a method
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 3, 4, 5]
 *
 * 2. What is the expected output?
 * 15
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to add each element
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and elements.
 *
 * Step 2:
 * Call a method that sums all elements of the array.
 *
 * Step 3:
 * Return the total sum and print it.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumViaMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the size of array: ");
		int size = sc.nextInt();
		
		int[] arr = inputArray(size, sc);
		printArray(arr);
		System.out.println("The sum of array elements is:" + sumArray(arr));

	}

	public static int[] inputArray(int size, Scanner input) {
		int[] initarr = new int[size];
		System.out.println(Arrays.toString(initarr));
		for (int i = 0; i < initarr.length; i++) {
			System.out.print("Enter the value of element: " + i);
			initarr[i] = input.nextInt();
		}
		return initarr;
	}

	public static void printArray(int[] arr) {

		System.out.println("Array is: " + Arrays.toString(arr));
	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		return sum;

	}

}
