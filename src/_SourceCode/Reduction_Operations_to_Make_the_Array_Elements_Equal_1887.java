package _SourceCode;

import java.util.Arrays;

public class Reduction_Operations_to_Make_the_Array_Elements_Equal_1887 {
	public static int reductionOperations(int[] nums) {
		Arrays.sort(nums);
		int si = nums.length;
		int ans = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i - 1] != nums[i]) {
				ans += si - i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 1, 3 };
		System.out.println(reductionOperations(nums));
	}
}
