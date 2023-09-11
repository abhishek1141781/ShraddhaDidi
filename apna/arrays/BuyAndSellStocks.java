package apna.arrays;

public class BuyAndSellStocks {

	public static int sellStockAtProfit(int stock[]) {
		int maxProfit = 0, buyPrice = Integer.MAX_VALUE;

		// loop to check
		for (int i = 0; i < stock.length; i++) {			// O(n)
			buyPrice = buyPrice > stock[i] ? stock[i] : buyPrice;
//			if(buyPrice<sellingPrice)
			if (buyPrice < stock[i]) {
				int currProfit = stock[i] - buyPrice; // today's profit
//				maxProfit = currProfit > maxProfit ? currProfit : maxProfit;
				maxProfit = Math.max(maxProfit, currProfit);
			} else {
				buyPrice = stock[i];
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int stockPrice[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//		int stockPrice[] = { 1,2,5,2,9,1};
		System.out.println(sellStockAtProfit(stockPrice));
	}
}
