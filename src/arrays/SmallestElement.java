/*
 * ==========================================
 * Problem: Find the smallest element in an array
 * ==========================================
 *
 * 1. What is the input?
 * [10, 25, 7, 41, 3]
 *
 * 2. What is the expected output?
 * 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to compare each element with the current minimum
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Initialize the first element as the current smallest value.
 *
 * Step 3:
 * Traverse the array and update the smallest value whenever a smaller element is found.
 *
 * Step 4:
 * Print the final smallest value.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);

        //calling smallest element method
        System.out.println("The smallest element in the array is: "+ smallestElement(arr));
    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element value at index" + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int smallestElement(int[] arr) {
        int smallestNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
        }
        return smallestNumber;
    }

}
