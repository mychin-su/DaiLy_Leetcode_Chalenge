package _SourceCode;

import java.util.Arrays;

public class Rearrange_Array_Elements_by_Sign_2149 {
	public static int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		int posIndex = 0, negIndex = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				ans[posIndex] = nums[i];
				posIndex += 2;
			} else {
				ans[negIndex] = nums[i];
				negIndex += 2;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 1, -2, -5, 2, -4 };
		System.out.println(Arrays.toString(rearrangeArray(nums)));
	}
}
