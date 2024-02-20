package _SourceCode;

public class Missing_Number_268 {
	public static int missingNumber(int[] nums) {
		int count[] = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 0, 1 };
		System.out.println(missingNumber(nums));
	}
}
