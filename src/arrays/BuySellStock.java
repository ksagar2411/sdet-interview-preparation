package arrays;

import java.util.Scanner;

public class BuySellStock {
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

        System.out.println("Max. profit will be: "+maxProfit(arr));

    }

    public static int maxProfit(int[] arr) {

        int minPrice = arr[0];
        int maxProfit = 0;
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];      
            }
            profit = arr[i] - minPrice;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
