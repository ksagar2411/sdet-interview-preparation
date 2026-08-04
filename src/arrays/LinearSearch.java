/*
 * ==========================================
 * Problem: Search for a target element in an array and return its index.
 *          You are given an integer array and a value x, and you need to determine whether x exists in the array.
 *          If it exists, return its position; otherwise return -1. This is the fundamental linear search problem.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array and a search value x.
 * Example: [10, 20, 30, 40] and target = 30
 *
 * 2. What is the expected output?
 * The index of the found element, or -1 if the element is not present.
 * Example: 2
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A while loop or a for loop to compare every array element with the target value.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the array size and all elements.
 *
 * Step 2:
 * Read the target value x.
 *
 * Step 3:
 * Start from the first index and compare every element with x.
 *
 * Step 4:
 * If the match is found, return that index immediately.
 *
 * Step 5:
 * If the scan finishes without a match, return -1.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);
        System.out.print("Enter the target value to get its index: ");
        int target = sc.nextInt();
        sc.close();

        // calling smallest element method
        int arrIndex = searchElement(arr, target);
        if (arrIndex != -1) {
            System.out.println("The element is present in the array at index: " + arrIndex);
        } else {
            System.out.println("Target element is not present in the array");
        }
    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int searchElement(int[] arr, int target) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                return i;
            }
            i++;

        }
        return -1;
    }
}
