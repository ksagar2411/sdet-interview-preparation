/*
 * ==========================================
 * Problem: Count the number of vowels in a given string.
 *          You are given a word or sentence and must count how many characters are vowels.
 *          This problem is useful for practicing character-by-character traversal and conditional counting.
 * ==========================================
 *
 * 1. What is the input?
 * A string input from the user.
 * Example: "Java is easy"
 *
 * 2. What is the expected output?
 * The total number of vowels present in the string.
 * Example: 5
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * A forward for loop to inspect each character and increment the counter when a vowel is found.
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
 * Traverse the string from left to right.
 *
 * Step 4:
 * If the current character is one of a, e, i, o, or u, increment the vowel count.
 *
 * Step 5:
 * Print the final vowel count.
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
