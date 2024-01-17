package _SourceCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Number_of_Distinct_Averages_2465 {
	public static int distinctAverages(int[] nums) {
		Set<Integer> seen = new HashSet<Integer>();
		Arrays.sort(nums); // 0 1 3 4 4 5
		int n = nums.length;
		for (int i = 0; i < n / 2; i++) {
			seen.add(((nums[i] + nums[n - i - 1])));
		}
		return seen.size();
	}

	public static void main(String[] args) {
		int nums[] = { 4, 1, 4, 0, 3, 5 };
		System.out.println(distinctAverages(nums));
	}
}
