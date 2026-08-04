/*
 * ==========================================
 * Problem: Count the number of unique elements in an array
 * ==========================================
 *
 * 1. What is the input?
 * [1, 2, 2, 3, 4, 4]
 *
 * 2. What is the expected output?
 * 4
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A two-pointer style forward loop to compare adjacent unique values
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Traverse the array using a write pointer and a read pointer.
 *
 * Step 3:
 * If a different value is found, place it next to the last unique value.
 *
 * Step 4:
 * Return the count of unique values.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class UniqueNoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for elemnt no. " + i + " :");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int uniqueCount = UniqueCount(arr);
        System.out.print("The no. of unique elements in the array are:" + uniqueCount);
    }

    public static int UniqueCount(int[] arr) {

        if (arr.length == 0) {
            return 0;
        } else {

            int write = 0;

            for (int read = 1; read < arr.length; read++) {

                if (arr[write] != arr[read]) {

                    write++;

                    arr[write] = arr[read];
                }
            }
            return write + 1;
        }
    }

}
