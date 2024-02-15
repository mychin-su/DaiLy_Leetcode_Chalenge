package _SourceCode;

import java.util.Arrays;

public class Find_Polygon_With_the_Largest_Perimeter_2971 {
	public static long largestPerimeter(int[] nums) {
		long sum = 0;
		Arrays.sort(nums);
		for (int num : nums) {
			sum += num;
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] >= sum - nums[i]) {
				sum -= nums[i];
			} else {
				return sum;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 5, 5, 50 };
		System.out.println(largestPerimeter(nums));
	}
}
