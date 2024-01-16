package _SourceCode;

import java.util.Arrays;

public class Sort_Array_By_Parity_II_922 {
	public static int[] sortArrayByParityII(int[] nums) {
		int[] arr = new int[nums.length];
		int placeEven = 0;
		int placeOdd = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				arr[placeEven] = nums[i];
				placeEven += 2;
			} else {
				arr[placeOdd] = nums[i];
				placeOdd += 2;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 2, 5, 7 };
		System.out.println(Arrays.toString(sortArrayByParityII(nums)));
	}
}
