package _SourceCode;

public class House_Robber_198 {
	public static int rob(int[] nums) {
		int rob = 0;
		int notrob = 0;
		for (int i = 0; i < nums.length; i++) {
			int currob = notrob + nums[i];
			notrob = Math.max(notrob, rob);
			rob = currob;
		}
		return Math.max(rob, notrob);
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 9, 3, 1 };
		System.out.println(rob(nums));
	}
}
