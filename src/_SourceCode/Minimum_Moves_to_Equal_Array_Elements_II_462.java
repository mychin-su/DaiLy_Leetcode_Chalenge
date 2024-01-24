package _SourceCode;

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_II_462 {
	public static int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int operation = 0, mid = nums[nums.length / 2];
		for (int num : nums) {
			operation += Math.abs(num - mid);
		}
		return operation;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 10, 2, 9 };
		System.out.println(minMoves2(nums));
	}
}
