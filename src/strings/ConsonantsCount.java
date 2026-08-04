/*
 * ==========================================
 * Problem: Count the number of consonants in a given string.
 *          You are given a word or sentence and must count how many alphabetic characters are not vowels.
 *          This problem helps practice character iteration, alphabet checking, and conditional counting.
 * ==========================================
 *
 * 1. What is the input?
 * A string input from the user.
 * Example: "Java is easy"
 *
 * 2. What is the expected output?
 * The number of consonants present in the string.
 * Example: 5
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * A forward for loop to inspect each character of the string.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the string and convert it to lowercase if needed.
 *
 * Step 2:
 * Initialize a counter variable to 0.
 *
 * Step 3:
 * Traverse the string character by character.
 *
 * Step 4:
 * If a character is an alphabet and is not one of a, e, i, o, u, increment the count.
 *
 * Step 5:
 * Print the final consonant count.
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
