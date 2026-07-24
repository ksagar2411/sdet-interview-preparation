/*
 * ==========================================
 * Problem:
 * Palindrome
 * ==========================================
 *
 * 1. What is the input?
 * Example:
 * "SAGAS"
 *
 * 2. What is the expected output?
 * "SAGAS"
 *
 * 3. Which data structure is required?
 * for loop
 *
 * 4. Which loop should I use?
 * Reverse for loop starting str.length()-1
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
 * compare rev with original string str
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * ==========================================
 */

package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome: ");
		String str = sc.next();
		sc.close();
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
