package _SourceCode;

import java.util.HashMap;

public class Tuple_With_Same_Product_1726 {
	public static int tupleSameProduct(int[] nums) {
		if (nums.length < 4) {
			return 0;
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // map để lưu số cặp có tích bằng nhau, nếu có
																			// 2 cặp băng nhau sẽ sinh ra 8 căp

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int val = nums[i] * nums[j];
				map.put(val, map.getOrDefault(val, 0) + 1);
			}
		}
		int res = 0;
		for (int key : map.keySet()) {
			int val = map.get(key);

			if (val > 1) {

				int tmp = val * (val - 1) / 2; // tổ hợp chập 2 để lấy ra số lượng 2 cặp
				res += tmp * 8; // nhân 8 để ra số lượng cặp bằng nhau
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 4, 5 };
		System.out.println(tupleSameProduct(nums));
	}
}
