package _SourceCode;

public class Special_Array_X_Elements_Greater_Than_or_Equal_X_1608 {
	public static int specialArray(int[] nums) {
		int x = nums.length;
		while (x > 0) {
			int count = countGreaterOrEqualElement(nums, x);
			if (count == x) {
				return x;
			}
			x--;
		}
		return -1;
	}

	public static int countGreaterOrEqualElement(int[] arr, int target) {
		int count = 0;
		for (int num : arr) {
			if (num >= target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = { 0, 4, 3, 0, 4 };
		System.out.println(specialArray(nums));
	}
}
