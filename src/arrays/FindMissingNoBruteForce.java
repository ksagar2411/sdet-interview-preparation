/*
 * ==========================================
 * Problem: Find the missing number from a sequence of size n using brute force.
 *          You are given an array containing n - 1 distinct numbers from the range 1 to n,
 *          and exactly one number is missing. The goal is to identify the missing value.
 *          This version uses a simple comparison-based approach.
 * ==========================================
 *
 * 1. What is the input?
 * An array of size n - 1 containing all numbers from 1 to n except one missing value.
 * Example: [1, 2, 4, 5] for n = 5
 *
 * 2. What is the expected output?
 * The missing number from the range.
 * Example: 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * Nested loops: one loop to iterate over the expected numbers 1 to n, and another loop to check their presence.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and all values in the array.
 *
 * Step 2:
 * For every value from 1 to n, check whether it exists in the array.
 *
 * Step 3:
 * If a number from the expected range is not found, it is the missing number.
 *
 * Step 4:
 * Print the missing number.
 *
 * ==========================================
 * Time Complexity : O(n^2)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class FindMissingNoBruteForce {
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
        int missingNo = -1;
        for (int i = 1; i <= arr.length; i++) {
            Boolean isFound = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    isFound = true;
                    break;
                } 
            }
            if (!isFound) {
                missingNo = i;
                    break;
                }
        } 
        return missingNo;
    }

}
