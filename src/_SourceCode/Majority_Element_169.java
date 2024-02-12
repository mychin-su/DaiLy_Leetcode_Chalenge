package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n / 2) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 2,2,1,1,1,2,2 };
		System.out.println(majorityElement(nums));
	}
}
