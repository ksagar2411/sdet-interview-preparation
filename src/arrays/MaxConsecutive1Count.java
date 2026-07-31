/*
 * ==========================================
 * Problem: Count the maximum number of consecutive 1s in an array
 * ==========================================
 *
 * 1. What is the input?
 * [1, 1, 0, 1, 1, 1]
 *
 * 2. What is the expected output?
 * 3
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop to track the current streak of ones
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the size and elements of the array.
 *
 * Step 2:
 * Traverse the array from left to right.
 *
 * Step 3:
 * If the current value is 1, increase the current streak count.
 *
 * Step 4:
 * If the current value is 0, reset the streak count.
 *
 * Step 5:
 * Track the highest streak found so far and print it.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package arrays;

import java.util.Scanner;

public class MaxConsecutive1Count {
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
        int maxCount = countConsecutiveOnes(arr);
        System.out.print("The max frequency of consecutive 1s is: " + maxCount);
    }

    public static int countConsecutiveOnes(int[] arr) {
        int count = 0;
        int currentCount = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
            }
            else{
                count = 0;  //this is very important as it bereaks the chain as soon as non 1 ecountered, question is about finding longest streak of 1
            }
      
            if (currentCount <= count) {
                currentCount = count;
            }
        }
        return currentCount;
    }
}
