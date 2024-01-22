package _SourceCode;

import java.util.Arrays;
import java.util.HashSet;

public class Set_Mismatch_645 {
	public static int[] findErrorNums(int[] nums) {
//		int dup = 0, miss = 0;
//		HashSet<Integer> set = new HashSet<Integer>();
//		// find duplicate using set
//		for (int i = 0; i < nums.length; i++) {
//			if (set.contains(nums[i])) {
//				dup = nums[i];
//			}
//			set.add(nums[i]);
//		}
//		for (int i = 1; i < nums.length; i++) {
//			if (set.contains(i) == false) {
//				miss = i;
//				break;
//			}
//		}
//		return new int[] { dup, miss };

		int x[] = new int[nums.length + 1];
		for (int i : nums) {
			x[i]++;
		}
		int dup = 0, miss = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[i] == 2) {
				dup = i;
			}
			if (x[i] == 0) {
				miss = i;
			}
		}
		return new int[] { dup, miss };
	}

	public static void main(String[] args) {
		int nums[] = { 2, 2 };
		System.out.println(Arrays.toString(findErrorNums(nums)));
	}
}
