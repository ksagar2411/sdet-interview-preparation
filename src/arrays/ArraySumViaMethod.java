package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumViaMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the size of array: ");
		int size = sc.nextInt();
		
		int[] arr = inputArray(size, sc);
		printArray(arr);
		System.out.println("The sum of array elements is:" + sumArray(arr));

	}

	public static int[] inputArray(int size, Scanner input) {
		int[] initarr = new int[size];
		System.out.println(Arrays.toString(initarr));
		for (int i = 0; i < initarr.length; i++) {
			System.out.print("Enter the value of element: " + i);
			initarr[i] = input.nextInt();
		}
		return initarr;
	}

	public static void printArray(int[] arr) {

		System.out.println("Array is: " + Arrays.toString(arr));
	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		return sum;

	}

}
