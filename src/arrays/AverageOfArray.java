/*
 * ==========================================
 * Problem: Calculate the average of array elements
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 3, 4, 5]
 *
 * 2. What is the expected output?
 * 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to add every array element
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and its elements.
 *
 * Step 2:
 * Traverse the array and add each element to a running sum.
 *
 * Step 3:
 * Divide the sum by the number of elements and print the result.
 *
 * Note: Because the method returns an int, fractional averages are truncated.
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
