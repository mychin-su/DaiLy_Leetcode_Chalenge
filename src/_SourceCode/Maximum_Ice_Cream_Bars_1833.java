package _SourceCode;

import java.util.Arrays;

public class Maximum_Ice_Cream_Bars_1833 {
	public static int maxIceCream(int[] costs, int coins) {
		Arrays.sort(costs);
		int count = 0;
		if (costs[0] > coins) {
			return 0;
		}
		for (int cost : costs) {
			if (cost <= coins) {
				count++;
				coins = coins - cost;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] cots = { 10, 6, 8, 7, 7, 8 };
		System.out.println(maxIceCream(cots, 5));
	}
}
