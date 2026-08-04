/*
 * ==========================================
 * Problem: Reverse the characters of a given string.
 *          You are given a word and must print it in reverse order character by character.
 *          This is a classic string manipulation problem that tests backward traversal and string building.
 * ==========================================
 *
 * 1. What is the input?
 * A single string.
 * Example: "Java"
 *
 * 2. What is the expected output?
 * The string in reverse order.
 * Example: "avaJ"
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * A reverse for loop starting from the last character index and moving backward.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the input string.
 *
 * Step 2:
 * Create an empty string to hold the reversed result.
 *
 * Step 3:
 * Traverse the string from the last character to the first character.
 *
 * Step 4:
 * Append each character to the reversed string.
 *
 * Step 5:
 * Print the reversed string.
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