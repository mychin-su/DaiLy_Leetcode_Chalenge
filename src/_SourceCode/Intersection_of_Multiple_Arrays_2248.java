package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Intersection_of_Multiple_Arrays_2248 {
	public static List<Integer> intersection(int[][] nums) {
		List<Integer> ans = new ArrayList<Integer>();
		int[] cnt = new int[1001];
		for (int[] arr : nums) {
			for (int i = 0; i < arr.length; i++) {
				cnt[arr[i]]++;
			}
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == nums.length) {
				ans.add(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] nums = { { 3, 1, 2, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, };
		System.out.println(intersection(nums));
	}
}
