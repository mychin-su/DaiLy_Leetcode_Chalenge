package _SourceCode;

public class Min_Max_Game_2293 {
	public static int minMaxGame(int[] nums) {
		if (nums.length == 1) {
			return nums[0]; // Điều kiện dừng nếu còn 1 phần tử 
		}
		int[] newArr = new int[nums.length / 2];
		for (int i = 0; i < newArr.length; i++) {
			if (i % 2 == 0) {
				newArr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
			} else {
				newArr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
			}
		}
		return minMaxGame(newArr);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 2, 4, 8, 2, 2 };
		System.out.println(minMaxGame(nums));
	}
}
