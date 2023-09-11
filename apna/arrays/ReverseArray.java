package apna.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int numbers[]) {
		int first = 0, last = numbers.length - 1;
		
		while(first<last) {
			//swap
			int temp=numbers[last];
			numbers[last]=numbers[first];
			numbers[first]=temp;
			
			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		reverse(numbers);
		System.out.println("Reversed Array: " + Arrays.toString(numbers));

	}

}
