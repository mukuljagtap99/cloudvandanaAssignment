
public class Question_1 {
//	Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
	public static void shuffleArray(int[] arr) {
		int n = arr.length;

		for (int i = n - 1; i > 0; i--) {
			// Generate a random index between 0 and i (inclusive)
			int j = (i + 1) / 2;

			// Swap array[i] and array[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}

	}

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Original Array");
		for (int i : originalArray) {
			System.out.print(" " + i);

		}
		System.out.println();

		shuffleArray(originalArray);
		System.out.print("Shuffled Array ");
		for (int newArray : originalArray) {
			System.out.print(newArray + " ");

		}

	}

}
