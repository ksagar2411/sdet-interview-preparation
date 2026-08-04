/*
 * ==========================================
 * Problem: Find the missing number from a sequence using a mathematical formula.
 *          You are given an array with all numbers from 1 to n except one missing number.
 *          Instead of comparing values one by one, you use the formula for the sum of the first n natural numbers
 *          and subtract the sum of the array values to identify the missing element.
 * ==========================================
 *
 * 1. What is the input?
 * An array containing all numbers from 1 to n except one missing value.
 * Example: [1, 2, 4, 5] for n = 5
 *
 * 2. What is the expected output?
 * The missing number in the range.
 * Example: 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to sum the array elements after computing the formula-based expected sum.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and values of the array.
 *
 * Step 2:
 * Compute the expected sum of numbers from 1 to n using the formula n(n+1)/2.
 *
 * Step 3:
 * Traverse the array and sum its elements.
 *
 * Step 4:
 * Compute the difference between expected sum and array sum.
 *
 * Step 5:
 * Print the missing number.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class FindMissingNoUsingFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n-1]; //take array lenght -1 because we know array has 1 element less
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for elemnt no. " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int missingNo = findMissing(arr);
        System.out.println("The missing no. is: " + missingNo);
    }

    public static int findMissing(int[] arr) {
        int sum = 0;
        int n = arr.length + 1;
        sum = (n*(n+1))/2;

        int elementSum = 0;
        for (int j = 0; j < arr.length; j++) {
            elementSum += arr[j];
        }
        return sum - elementSum;
    }
}
