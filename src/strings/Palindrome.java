/*
 * ==========================================
 * Problem: Determine whether a given string is a palindrome.
 *          You are given a word or sentence and must check if it reads the same forwards and backwards.
 *          This problem is a standard string reversal comparison exercise that helps practice indexing,
 *          reversal logic, and equality checks.
 * ==========================================
 *
 * 1. What is the input?
 * A single string entered by the user.
 * Example: "SAGAS"
 *
 * 2. What is the expected output?
 * A decision indicating whether the string is a palindrome.
 * Example: true
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * A reverse for loop to read the characters from end to start and build a reversed string.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the input string.
 *
 * Step 2:
 * Create an empty string to hold the reversed version.
 *
 * Step 3:
 * Traverse the original string from the last character to the first character.
 *
 * Step 4:
 * Append each character to the reversed string.
 *
 * Step 5:
 * Compare the reversed string to the original string.
 *
 * Step 6:
 * If both are equal, print that the string is a palindrome; otherwise print that it is not.
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
