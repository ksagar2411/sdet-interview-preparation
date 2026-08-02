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