package apna.arrays;

import java.util.Arrays;

//Time Complexity: O(n)
//Space Complexity: O(1)

// implement special case for all negative

public class MaxSubarrayKadane {
	public static void maxSubArrayPrefixSum(int num[]) {
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
	}

	public static void kadanes(int num[]) {
		int ms = Integer.MIN_VALUE;
		int cs = 0;

		for (int i = 0; i < num.length; i++) {
			cs += num[i];
			if (cs < 0)
				cs = 0;
			ms = Math.max(cs, ms);
//			ms = cs > ms ? cs : ms;
		}

		System.out.println("Maximum subArray sum using Kadanes is: " + ms);
	}

	public static void main(String[] args) {
		int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		kadanes(num);
	}
}
