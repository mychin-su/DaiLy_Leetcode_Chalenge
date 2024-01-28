package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Subsequence_in_Non_Increasing_Order_1403 {
	public static List<Integer> minSubsequence(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();
		int total = 0; // 3 4 8 9 10 (34)
		for (int num : nums) {
			total += num;
		}
		Arrays.sort(nums);
		int sum = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			list.add(nums[i]);
			sum += nums[i];
			if (sum > total - sum) {
				return list;
			}
		}
//		list.add(nums[idx - 1]);
		return list;

	}

	public static void main(String[] args) {
		int[] nums = { 4, 4, 7, 6, 7 };
		System.out.println(minSubsequence(nums));
	}
}
