/*
 * ==========================================
 * Problem: Compute the running (prefix) sum of a 1D integer array.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array.
 * Example: [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * An array where each element is the sum of all previous elements including itself.
 * Example: [1, 3, 6, 10]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * A forward for loop maintaining a running total.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Initialize an output array and set running sum to 0.
 *
 * Step 2:
 * Iterate the input array and accumulate values into the running sum.
 *
 * Step 3:
 * Store the running sum in the output array at each index.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;

public class RunningSum1DArray {
    
    public static void main(String[] args){

        // int[] nums = {1,2,3,4,5};
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums){

        int[] result = new int[nums.length];
        result[0] = nums[0];
        // for(int i = 0; i<nums.length; i++){
        //     int temp = 0;
        //     for(int j=0; j<=i; j++){
        //         temp += nums[j];
        //     }
        //     result[i] = temp;
        // }
        for(int i=1; i<nums.length;i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
