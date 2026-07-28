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
