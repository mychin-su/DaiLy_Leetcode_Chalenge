package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Find_Subarrays_With_Equal_Sum_2395 {
	public static boolean findSubarrays(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (set.contains(nums[i] + nums[i + 1])) {
				return true;
			}
			set.add(nums[i] + nums[i + 1]);
		}
		return false;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5 };
		System.out.println(findSubarrays(nums));
	}
}
