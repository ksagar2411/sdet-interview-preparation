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
