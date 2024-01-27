package _SourceCode;

import java.util.Arrays;

public class Partition_Array_Such_That_Maximum_Difference_Is_K_2294 {
	public static int partitionArray(int[] nums, int k) {
		Arrays.sort(nums);
		int ans = 0, min = nums[0];
		int i = 0;
		while (i < nums.length) {
			if (nums[i] - min > k) {
				++ans;
				min = nums[i];
			} else {
				i++;
			}
		}
		return ++ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int k = 1;
		System.out.println(partitionArray(nums, k));
	}
}
