/*
 * ==========================================
 * Problem: Find the sum of all elements present in an array.
 *          Given an integer array, you need to accumulate every value and print the final total.
 *          This is a basic array-traversal problem that tests loop control and arithmetic operations.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array of size n.
 * Example: [1, 2, 3, 4, 5]
 *
 * 2. What is the expected output?
 * The total sum of all elements.
 * Example: 15
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to visit every index and accumulate the values.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and all elements into the array.
 *
 * Step 2:
 * Start a variable called sum with value 0.
 *
 * Step 3:
 * Traverse the array from index 0 to n - 1 and add each value to sum.
 *
 * Step 4:
 * Print the final sum after the loop ends.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter value for elemnt no. "+i+" :");
			arr[i]= sc.nextInt(); 
		}
		sc.close();
		int sum=0;
		for(int j=0; j<n; j++) {
			sum+= arr[j];
		}
		System.out.println("The sum of all array elements is:" + sum);
		System.out.println("The array is" + Arrays.toString(arr));
	}
}
