package arrays;

import java.util.Scanner;

public class checkSortedArray {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);
        System.out.print("Enter the target value to get its index: ");
        int target = sc.nextInt();
        sc.close();

        // calling smallest element method
        System.out.println("The element is present in the array at index: " + isSortedArray(arr));
        
    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element value at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isSortedArray(int arr[]){
        return false;

        
    }
    
}
