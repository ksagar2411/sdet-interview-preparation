package arrays;

import java.util.Scanner;

public class UniqueNoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for elemnt no. " + i + " :");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int uniqueCount = UniqueCount(arr);
        System.out.print("The no. of unique elements in the array are:" + uniqueCount);
    }

    public static int UniqueCount(int[] arr) {

        if (arr.length == 0) {
            return 0;
        } else {

            int write = 0;

            for (int read = 1; read < arr.length; read++) {

                if (arr[write] != arr[read]) {

                    write++;

                    arr[write] = arr[read];
                }
            }
            return write + 1;
        }
    }

}
