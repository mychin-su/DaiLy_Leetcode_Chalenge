package _SourceCode;

import java.util.Arrays;

public class Maximum_Units_on_a_Truck_1710 {
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); // sắp xếp cột thứ hai giảm dần
		int ans = 0;
		for (int[] b : boxTypes) {
			int count = Math.min(b[0], truckSize);
			ans += count * b[1];
			truckSize -= count;
			if (truckSize == 0) {
				return ans;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] boxTypes = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
		int truckSize = 4;
		System.out.println(maximumUnits(boxTypes, truckSize));
	}
}
