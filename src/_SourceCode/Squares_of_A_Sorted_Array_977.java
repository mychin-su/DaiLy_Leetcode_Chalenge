package _SourceCode;

import java.util.Arrays;

public class Squares_of_A_Sorted_Array_977 {
	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		int nums[] = { -7,-3,2,3,11 };
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
}
