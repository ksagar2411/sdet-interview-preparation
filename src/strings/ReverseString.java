/*
 * ==========================================
 * Problem:
 * Reverse String
 * ==========================================
 *
 * 1. What is the input?
 * Example:
 * "Java"
 *
 * 2. What is the expected output?
 * "avaJ"
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * Reverse for loop from str.length()-1
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the input string.
 *
 * Step 2:
 * Create an empty string "rev".
 *
 * Step 3:
 * Traverse the string from last character to first.
 *
 * Step 4:
 * Append each character to "rev".
 *
 * Step 5:
 * Print "rev".
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */
package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to be reversed: ");
		String str = sc.next();
		sc.close();
		
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("The reversed string is: " + rev);
	}
}