/*
 * ==========================================
 * Problem: Count how many times a given target value appears in an array.
 *          You are given an array of integers and a number x, and your task is to count the total
 *          number of occurrences of x in the array. This is a standard frequency-counting problem.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array and a target value x.
 * Example: [2, 4, 2, 6, 2] and target = 2
 *
 * 2. What is the expected output?
 * The number of times the target value occurs in the array.
 * Example: 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A while loop or a for loop to traverse the array and compare each value with the target.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and its elements.
 *
 * Step 2:
 * Read the target value to search for.
 *
 * Step 3:
 * Traverse each element from left to right.
 *
 * Step 4:
 * If the current element matches the target, increment the count.
 *
 * Step 5:
 * Print the final frequency.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);
        System.out.print("Enter the target value to get its index: ");
        int target = sc.nextInt();
        sc.close();

        // calling smallest element method
        int count = occuranceCount(arr, target);
        System.out.println("The element " + target + " has occured " + count + " times");
    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int occuranceCount(int[] arr, int target) {
        int i = 0, count = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                count += 1;
            }
            i++;
        }
        return count;

    }
}
