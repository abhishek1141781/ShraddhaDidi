package apna.arrays;
import java.util.Arrays;

//Time Complexity: O(n^2)
//Space Complexity: O(1)

public class MaxSubarrayPrefixSum {
	public static int maxSubArrayPrefixSum(int num[]) {
		int currSum = 0;
		int maxSumSubarray = Integer.MIN_VALUE;
		int prefix[] = new int[num.length];

		prefix[0] = num[0];
		// calculate prefix array
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + num[i];
		}

		for (int i = 0; i < num.length; i++) {
			int start = i;
			for (int j = i; j < num.length; j++) {
				int end = j;
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
				if (maxSumSubarray < currSum)
					maxSumSubarray = currSum;
			}
		}
		System.out.println("Prefix array: " + Arrays.toString(prefix));
		System.out.println("MaxSumSubarray using prefix array: " + maxSumSubarray);
		return 0;
	}

	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40 };
		maxSubArrayPrefixSum(num);

	}

}
