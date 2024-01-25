package _SourceCode;

import java.util.Arrays;

public class Maximize_Sum_Of_Array_After_K_Negations_1005 {
	public static int largestSumAfterKNegations(int[] nums, int k) {
		Arrays.sort(nums);
		int sum = 0;
		if (nums[0] >= 0 && k % 2 != 0) {
			nums[0] = -nums[0];
		} else if (nums[0] < 0) {
			int change = 0;
			while (k > 0 && change < nums.length && nums[change] < 0) {
				nums[change] = -nums[change++];
				k--;
			}
			if (k % 2 != 0) {
				int index = change < nums.length && nums[change] < nums[change - 1] ? change : change - 1;
				nums[index] = -nums[index];
			}
		}
		for (int val : nums) {
			sum += val;
		}
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = { 2, -3, 5, -4 };
		int k = 3;
		System.out.println(largestSumAfterKNegations(nums, k));
	}
}
