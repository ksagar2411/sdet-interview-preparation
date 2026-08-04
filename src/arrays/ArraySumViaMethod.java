/*
 * ==========================================
 * Problem: Calculate the sum of all elements in an integer array by using a separate method.
 *          Given an array of numbers, you need to traverse the array, add every element to a running total,
 *          and return that total to the caller. This is one of the most fundamental array problems and
 *          is commonly used to practice method decomposition, accumulation, and loop iteration.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array of size n entered by the user.
 * Example: [1, 2, 3, 4, 5]
 *
 * 2. What is the expected output?
 * The total sum of all numbers in the array.
 * Example: 15
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to visit each element and repeatedly add its value to a running sum.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size of the array and then read all elements into it.
 *
 * Step 2:
 * Call a separate method that takes the array as input.
 *
 * Step 3:
 * Inside the method, initialize a sum variable to 0 and iterate through every index.
 *
 * Step 4:
 * Add each array value to the sum and return the final total to the main method.
 *
 * Step 5:
 * Print the computed total.
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
