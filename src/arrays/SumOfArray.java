/*
 * ==========================================
 * Problem: Find the sum of all array elements
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
 * Print the sum and the array.
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
