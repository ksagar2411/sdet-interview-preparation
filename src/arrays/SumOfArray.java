package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter value for elemnt no. "+i+" :");
			arr[i]= sc.nextInt(); 
		}
		sc.close();
		int sum=0;
		for(int j=0; j<n; j++) {
			sum+= arr[j];
		}
		System.out.println("The sum of all array elements is:" + sum);
		System.out.println("The array is" + Arrays.toString(arr));
	}
}
