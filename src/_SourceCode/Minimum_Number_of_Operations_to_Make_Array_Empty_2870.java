package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty_2870 {
	public static int minOperations(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int val = entry.getValue();
			if (val == 1) {
				return -1;
			}
			count += val / 3;
			if (val % 3 != 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 3, 2, 2, 4, 2, 3, 4 };
		System.out.println(minOperations(nums));
	}
}
