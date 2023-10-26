import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Question_3 {
	/*
	 * Check if the input is pangram or not. (Pangram is a sentence that contains
	 * all the alphabet from a-z)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for consistency
		scanner.close();

		boolean isPangram = isPangram(input);

		if (isPangram) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is not a pangram.");
		}
	}

	public static boolean isPangram(String input) {
		// Create a Set to store the unique letters encountered in the input
		Set<Character> letters = new HashSet<>();

		for (char c : input.toCharArray()) {
			// Check if the character is a letter and add it to the Set
			if (Character.isLetter(c)) {
				letters.add(c);
			}
		}

		// Check if all letters from 'a' to 'z' are present
		for (char letter = 'a'; letter <= 'z'; letter++) {
			if (!letters.contains(letter)) {
				return false;// If any letter is missing, it's not a pangram
			}
		}

		return true;// All letters from 'a' to 'z' are present, so it's a pangram
	}
}
