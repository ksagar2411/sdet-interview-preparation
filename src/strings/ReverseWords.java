/*
 * ==========================================
 * Problem: Reverse words
 * ==========================================
 *
 * 1. What is the input?
 * Example:
 * "Java is easy"
 *
 * 2. What is the expected output?
 *  There are 3 possibilities
 *  1. "easy is Java"
 *  2. "avaJ si ysae"
 *  3. "ysae si avaJ"
 *
 * 3. Which data structure is required?
 * String
 *
 * 4. Which loop should I use?
 * for
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

public class ReverseWords {

	public static void main(String[] args) {

		String str = "Java is easy";
		String[] splitstr = str.split(" ");
		String reversedSentence = "";
		// TODO Java is easy --> avaJ si ysae
		for (int i = 0; i <= splitstr.length - 1; i++) {
			String word = splitstr[i];
			reversedSentence += reverseWords(word) + " ";
		}
		 System.out.println("The reversed string is: " + reversedSentence.trim());
	}

	// TODO Java is easy --> avaJ si ysae
	public static String reverseWords(String word) {
		String reversedWord="";
		for (int j = word.length() - 1; j >= 0; j--) {
			reversedWord += word.charAt(j);
			//System.out.println(word);
		}
		return reversedWord;

	}
}
