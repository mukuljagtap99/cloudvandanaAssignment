import java.util.HashMap;
import java.util.Scanner;

public class Question_2 {
// Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Roman numeral: ");
		String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency
		scanner.close();

		int result = romanToInt(romanNumeral);

		System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			int currentValue = romanMap.get(s.charAt(i));

			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

			prevValue = currentValue;
		}

		return result;
	}
}
