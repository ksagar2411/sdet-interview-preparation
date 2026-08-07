/*
 * ==========================================
 * Problem: Return an array where each element is the product of all
 *          other elements in the given array, excluding itself.
 *          This is a common interview problem that helps practice prefix
 *          and suffix product logic.
 * ==========================================
 *
 * 1. What is the input?
 * An integer array.
 * Example: [1, 2, 3, 4]
 *
 * 2. What is the expected output?
 * A new array where each element is the product of all elements except itself.
 * Example: [24, 12, 8, 6]
 *
 * 3. Which data structure is required?
 * Array
 *
 * 4. Which loop should I use?
 * Two loops to build prefix and suffix products, followed by one loop to combine them.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Create prefix and suffix product arrays.
 *
 * Step 2:
 * Fill prefix products from left to right.
 *
 * Step 3:
 * Fill suffix products from right to left.
 *
 * Step 4:
 * Multiply prefix and suffix values to get the result for each index.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }

    public static int[] productExceptSelf(int[] arr) {

        int[] result = new int[arr.length];
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];

        int prefixProduct = 1;
        prefix[0]=1;
        for(int i=1; i<arr.length;i++){
            prefixProduct *= arr[i-1];
            prefix[i] = prefixProduct;
        }

        int suffixProduct = 1;
        suffix[arr.length-1]=1;
              for(int j=arr.length-2; j>=0;j--){
            suffixProduct *= arr[j+1];
            suffix[j] = suffixProduct;
        }

        for(int k=0;k<arr.length;k++){
            result[k] = prefix[k]*suffix[k];
        }

        return result;
    }
}
