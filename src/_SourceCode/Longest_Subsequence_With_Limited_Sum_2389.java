package _SourceCode;

import java.util.Arrays;

public class Longest_Subsequence_With_Limited_Sum_2389 {
	public static int[] answerQueries(int[] nums, int[] queries) {
		Arrays.sort(nums); // 1 2 4 5 => 3(1, 2) 7(1, 2, 4) 12(1, 2, 4, 5)
		int n = nums.length, m = queries.length;
		for (int i = 1; i < n; i++) {
			nums[i] += nums[i - 1];
		}
		for (int i = 0; i < queries.length; i++) {
			queries[i] = binarySearch(nums, queries[i]);
		}
		return queries;

	}

	public static int binarySearch(int[] a, int val) {
		int start = 0, end = a.length - 1, ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] <= val) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans + 1;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 5, 2, 1 };
		int[] queries = { 3, 10, 21 };
		System.out.println(Arrays.toString(answerQueries(nums, queries)));
	}
}
