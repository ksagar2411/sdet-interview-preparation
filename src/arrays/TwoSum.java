/*
 * ==========================================
 * Problem: Find two indices whose values add up to a target
 * ==========================================
 *
 * 1. What is the input?
 * [2, 7, 11, 15]
 *
 * 2. What is the expected output?
 * [0, 1] for target 9
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * Nested for loops to check all pair combinations
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and its elements.
 *
 * Step 2:
 * Read the target value.
 *
 * Step 3:
 * Use two nested loops to test every pair of indices.
 *
 * Step 4:
 * Return the pair of indices when their sum matches the target.
 *
 * ==========================================
 * Time Complexity : O(n^2)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for elemnt no. " + i + " :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        sc.close();

        int[] indices = twoSum(arr, target);
        System.out.println("The indices are " + indices[0] + " and " + indices[1]);

    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    return new int[] { i, j };
                }
            }
        }
        return arr;
    }
}
