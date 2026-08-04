/*
 * ==========================================
 * Problem: Calculate the average of all elements in an integer array.
 *          You are given a list of numbers and need to find their arithmetic mean by summing all values
 *          and then dividing by the total count. This problem is useful for understanding array traversal,
 *          running totals, and integer division behavior in Java.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array of size n.
 * Example: [1, 2, 3, 4, 5]
 *
 * 2. What is the expected output?
 * The average of all elements in the array.
 * Example: 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to visit each element and accumulate the total sum.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size of the array and store each value in the array.
 *
 * Step 2:
 * Traverse the array and keep adding every element into a sum variable.
 *
 * Step 3:
 * Divide the final sum by the total number of elements.
 *
 * Step 4:
 * Print the integer result of the division.
 *
 * Note: Because the method returns an int, any fraction is truncated.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = inputarr(size, sc);
		System.out.println("The average of the array is:" + average(arr));
	}

	public static int[] inputarr(int size, Scanner arrScanner){
		int[] arr = new int[size];
		for(int i =0; i<arr.length;i++){
			System.out.println("Enter the element at index "+ i +" :");
			arr[i] = arrScanner.nextInt();
		}
		return arr;
	}

	public static int average(int[] arr ){
		int arraysum = 0;
		for(int i=0; i< arr.length; i++){
			arraysum+= arr[i];
		}
		return arraysum/arr.length;
	}
}
