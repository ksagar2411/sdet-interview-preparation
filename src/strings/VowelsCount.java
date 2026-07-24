/*
 * ==========================================
 * Problem: Vowel count in a string or sentence
 * ==========================================
 *
 * 1. What is the input?
 * Example:
 * "Java is easy"
 *
 * 2. What is the expected output?
 * 5 (a,a,i,e,a)
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * Run a increment for loop and keep increasing counter whenever a vowel occur
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the input string. and initialize counter with 0
 *
 * Step 2:
 * run for loop till length starting from 0
 *
 * Step 3:
 * at each charAt(i) if it belong to (a,e,i,o,u), increment counter
 *
 * Step 4:
 * Print the counter value
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * ==========================================
 */
package strings;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine().toLowerCase();
		sc.close();
		int counter = 0;
		
		for (int i=0; i<str.length();i++) {
				if(str.charAt(i)== 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i)=='u') {
				counter++;
			}
		}
		System.out.println("The frequency of vowels: "+ counter);

	}

}
