package arrays;

import java.util.Scanner;

public class SmallestElementRevesion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = inputElements(size, sc);

        //calling smallest element method
        System.out.println("The smallest element in the array is: "+ smallestElement(arr));
    }

    public static int[] inputElements(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element value at index" + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int smallestElement(int[] arr) {
        int smallestNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
        }
        return smallestNumber;
    }

}
