package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divide_Array_Into_Arrays_With_Max_Difference_2966 {
	public static int[][] divideArray(int[] nums, int k) {
		int size = nums.length;
		if (size % 3 != 0) {
			return new int[][] {};
		}
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < size; i += 3) {
			if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
				result.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
			} else {
				return new int[][] {};
			}
		}
		int[][] ans = new int[result.size()][3];
		for (int i = 0; i < result.size(); i++) {
			List<Integer> sublist = result.get(i);
			for (int j = 0; j < 3; j++) {
				ans[i][j] = sublist.get(j);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };

		System.out.println(Arrays.toString(divideArray(nums, 2)));
	}
}
