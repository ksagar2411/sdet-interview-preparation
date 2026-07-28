package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int array1Size = sc.nextInt();
        int[] array1 = inputElements(array1Size, sc);

        System.out.print("Enter the size of second array: ");
        int array2Size = sc.nextInt();
        int[] array2 = inputElements(array2Size, sc);

        sc.close();

        int[] mergedArray = mergeArray(array1, array2);
        System.out.println("The merged array is: " + Arrays.toString(mergedArray));

    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        int currentIndex = arr1.length;
        for (int j = 0; j < arr2.length; j++) {
            mergedArray[currentIndex] = arr2[j];
            currentIndex = currentIndex + 1;
        }

        return mergedArray;

    }
}
