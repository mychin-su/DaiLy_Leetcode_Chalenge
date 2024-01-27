package _SourceCode;

import java.util.Arrays;

public class Minimum_Cost_of_Buying_Candies_With_Discount_2144 {
	public static int minimumCost(int[] cost) {
		Arrays.sort(cost);
		int ans = 0;
		for (int i = 0; i < cost.length; i++) {
			if (i % 3 != cost.length % 3) {
				ans += cost[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] cost = { 6, 5, 7, 2, 2 }; // 2 2 5 6 7
		System.out.println(minimumCost(cost));
	}
}
