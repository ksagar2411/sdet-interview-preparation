/*
 * ==========================================
 * Problem: Find the missing number from a sequence using XOR.
 *          You are given an array containing all numbers from 1 to n except one missing value.
 *          The objective is to identify the missing number efficiently using the XOR property,
 *          which cancels out duplicate values and leaves the missing one behind.
 * ==========================================
 *
 * 1. What is the input?
 * An array of size n - 1 containing all numbers from 1 to n except one missing number.
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
 * A forward for loop to XOR all numbers from 1 to n and then XOR all array elements.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the sequence size n and the array elements.
 *
 * Step 2:
 * XOR all integer values from 1 through n.
 *
 * Step 3:
 * XOR all values currently present in the array.
 *
 * Step 4:
 * The XOR result left over after both passes is the missing number.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class FindMissingUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array (1 to n, one missing): ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1]; // only n-1 elements present
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter value for element no. " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int missingNo = findMissingUsingXOR(arr, n);
        System.out.println("The missing no. is: " + missingNo);
    }

    public static int findMissingUsingXOR(int[] arr, int n) {
        int xor = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // XOR all array elements
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        return xor;
    }
}