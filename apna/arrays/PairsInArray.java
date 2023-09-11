package apna.arrays;

public class PairsInArray {
	public static void printPairs(int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			int curr = numbers[i]; // 10,20,30,40
			for (int j = i + 1; j < numbers.length; j++) {
				System.out.print("(" + curr + ", " + numbers[j] + ") ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40 };
		printPairs(numbers);
		System.out.println("total no of pairs: " + ((numbers.length * (numbers.length - 1) / 2)));
	}

}
