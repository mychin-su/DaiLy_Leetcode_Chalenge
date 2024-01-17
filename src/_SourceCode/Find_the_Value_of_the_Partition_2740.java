package _SourceCode;

import java.util.Arrays;

public class Find_the_Value_of_the_Partition_2740 {
	public static int findValueOfPartition(int[] nums) {
		Arrays.sort(nums);
		int res = nums[1] - nums[0], n = nums.length;
		for (int i = 2; i < n; i++) {
			res = Math.min(res, nums[i] - nums[i - 1]);
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 2, 4 };
		System.out.println(findValueOfPartition(nums));
	}
}
