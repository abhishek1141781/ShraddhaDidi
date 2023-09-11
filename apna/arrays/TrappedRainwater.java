package apna.arrays;

public class TrappedRainwater {

	public static int trappedRainwater(int height[]) {
		// calculate left max boundary - array
		int leftMax[] = new int[height.length];
		leftMax[0] = height[0];
		for (int i = 1; i < height.length; i++)
			leftMax[i] = Math.max(leftMax[i - 1], height[i]);

		// calculate right max boundary - array
		int rightMax[] = new int[height.length];
		rightMax[height.length - 1] = height[height.length - 1];

		// waterlevel = min(leftmax bound, rightmax bound)
		for (int i = height.length - 2; i >= 0; i--)
			rightMax[i] = Math.max(rightMax[i + 1], height[i]);

		int trappedWater = 0;
		// loop
		for (int i = 0; i < height.length; i++) {
			int waterLevel = Math.min(leftMax[i], rightMax[i]);

			// trappedwater = waterlevel - heightbar
			trappedWater += waterLevel - height[i];
		}

		return trappedWater;
	}

	public static void main(String[] args) {
		int height[] = { 4, 2, 0, 6, 3, 2, 5 };
		System.out.println("Total trappedRainwater: " + trappedRainwater(height));
	}
}
