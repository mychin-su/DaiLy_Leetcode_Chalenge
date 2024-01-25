package _SourceCode;

public class Max_Pair_Sum_in_an_Array_2815 {
	public static int maxSum(int[] nums) {
		// 2 for lồng nhau
		int maxSum = -1;
		int maxDigit = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int cs = nums[i] + nums[j];
				if (cs > maxSum && (maxDigits(nums[i]) == maxDigits(nums[j]))) {
					maxSum = cs;
				}
			}
		}
		return maxSum;

//		// Map
//		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//		int max = -1;
//		for (int num : nums) {
//			int maxDigit = maxDigits(num);
//			if (m.containsKey(maxDigit)) {
//				if ((m.get(maxDigit) + num) > max) {
//					max = m.get(maxDigit) + num;
//				}
//				if (m.get(maxDigit) < num) {
//					m.put(maxDigit, num);
//				}
//			} else {
//				m.put(maxDigit, num);
//			}
//		}
//		return max;
	}

	public static int maxDigits(int n) { // find max digit of numbers
		int largest = 0;
		while (n != 0) {
			int r = n % 10;
			largest = Math.max(r, largest);
			n /= 10;
		}
		return largest;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(maxSum(nums));
	}
}
