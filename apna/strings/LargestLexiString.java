package apna.strings;

public class LargestLexiString {

	public static void main(String[] args) {
		String fruits[] = { "mango", "zebra" };

		String largest = fruits[0];
		// O(x(length of largest string) * N(no of strings in array))
		for (int i = 1; i < fruits.length; i++) {				
			if (largest.compareTo(fruits[i]) < 0)
				largest = fruits[i];
		}
		System.out.println(largest);
	}
}
