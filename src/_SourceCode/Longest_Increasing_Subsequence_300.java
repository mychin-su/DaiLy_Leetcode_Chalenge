package _SourceCode;

public class Longest_Increasing_Subsequence_300 {
	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		int max = 1;
		for (int index = 0; index < nums.length; index++) {
			dp[index] = 1;
			for (int dpIndex = 0; dpIndex < index; dpIndex++) {
				if (nums[dpIndex] < nums[index]) {
					dp[index] = Math.max(dp[index], dp[dpIndex] + 1);
					max = Math.max(dp[index], max);
				}
			}
		}
		return max;
	}
	
}
