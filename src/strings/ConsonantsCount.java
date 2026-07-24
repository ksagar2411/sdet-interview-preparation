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
 * 5 (j,v,s,s,y)
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * Run a increment for loop and keep increasing counter whenever a non-vowel occur
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

public class ConsonantsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine().toLowerCase();
		sc.close();
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch) && ch != 'a' && ch != 'e' && ch != 'i'
					&& ch != 'o' && ch != 'u') {
				counter++;
			}
		}
		System.out.println("The count of consonant is: " + counter);
	}
}
