package _SourceCode;

import java.util.Arrays;

public class Minimum_Number_Game_2974 {
	public static int[] numberGame(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < n; i += 2) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 4, 2, 3 };

		System.out.println(Arrays.toString(numberGame(nums)));
	}
}
