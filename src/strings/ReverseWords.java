/*
 * ==========================================
 * Problem: Reverse each word in a sentence while preserving the original word order.
 *          You are given a sentence and must reverse every individual word, but not the sequence of words.
 *          This problem helps practice splitting strings, word-level reversal, and string concatenation.
 * ==========================================
 *
 * 1. What is the input?
 * A sentence or string containing multiple words.
 * Example: "Java is easy"
 *
 * 2. What is the expected output?
 * The words should remain in the same order, but each word should be reversed.
 * Example: "avaJ si ysae"
 *
 * 3. Which data structure is required?
 * String and String array from split()
 *
 * 4. Which loop should I use?
 * A forward for loop to process every word after splitting the sentence.
 *
 * ==========================================
 * Algorithm
 * ==========================================
 *
 * Step 1:
 * Read the sentence as a string.
 *
 * Step 2:
 * Split the sentence into individual words using space as the delimiter.
 *
 * Step 3:
 * For each word, reverse it character by character using a reverse loop.
 *
 * Step 4:
 * Append the reversed word back into the output sentence.
 *
 * Step 5:
 * Print the final transformed sentence.
 *
 * ==========================================
 * Time Complexity : O(n)
 * Space Complexity: O(n)
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
