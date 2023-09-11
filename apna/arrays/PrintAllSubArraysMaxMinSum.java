package apna.arrays;

// Time Complexity: O(n^3)
// Space Complexity: O(1)

public class PrintAllSubArraysMaxMinSum {
	public static int printAllSubArrays(int num[]) {
		int noOfPairs = 0, maxSumSubarray = Integer.MIN_VALUE, minSumSubarray = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			int start = i;
			for (int j = i; j < num.length; j++) {
				int end = j, sumSubarray = 0;
				for (int k = start; k <= end; k++) {
					System.out.print(num[k] + " ");
					sumSubarray += num[k];
					noOfPairs++; // (n*(n+1))/2
				}
				if (maxSumSubarray < sumSubarray)
					maxSumSubarray = sumSubarray;
				if (minSumSubarray > sumSubarray)
					minSumSubarray = sumSubarray;
				System.out.print("    SumSubarray: (" + sumSubarray + ")");
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("MaxSumSubarray: " + maxSumSubarray);
		System.out.println("MinSumSubarray: " + minSumSubarray);
		return noOfPairs;
	}

	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40 };
		System.out.println("No of Subarrays: " + printAllSubArrays(num));
	}
}
