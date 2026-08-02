package arrays;

import java.util.Scanner;

public class FindMissingNoOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter value for elemnt no. " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int missingNo = findMissing(arr);
        System.out.println("The missing no. is: " + missingNo);
    }

    public static int findMissing(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i++) {
            sum += i;
        }

        int elementSum = 0;
        for (int j = 0; j < arr.length; j++) {
            elementSum += arr[j];
        }
        return sum - elementSum;
    }

}
