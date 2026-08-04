/*
 * ==========================================
 * Problem: Find the missing number from a sequence by using sum comparison.
 *          You are given an array containing all numbers from 1 to n except one value.
 *          Instead of checking each number separately, you can compute the expected sum of the sequence
 *          and compare it with the actual sum of the array elements. The difference is the missing value.
 * ==========================================
 *
 * 1. What is the input?
 * An array of length n - 1 containing a sequence of numbers from 1 to n with one missing value.
 * Example: [1, 2, 4, 5] for n = 5
 *
 * 2. What is the expected output?
 * The missing number.
 * Example: 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to compute the total sum of the given array elements.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Calculate the sum of the first n natural numbers using a loop.
 *
 * Step 3:
 * Calculate the sum of the values present in the array.
 *
 * Step 4:
 * Subtract the array sum from the expected sum to get the missing number.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class FindMissingNoOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter value for elemnt no. " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int missingNo = findMissing(arr);
        System.out.println("The missing no. is: " + missingNo);
    }

    public static int findMissing(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i++) {
            sum += i;
        }

        int elementSum = 0;
        for (int j = 0; j < arr.length; j++) {
            elementSum += arr[j];
        }
        return sum - elementSum;
    }

}
