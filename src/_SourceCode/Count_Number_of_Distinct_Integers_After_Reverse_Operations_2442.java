package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Count_Number_of_Distinct_Integers_After_Reverse_Operations_2442 {
	public static int countDistinctIntegers(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			set.add(num);
			set.add(reverseNumber(num));
		}
		return set.size();
	}

	public static int reverseNumber(int x) {
		int num = 0;
		while (x != 0) {
			num = num * 10 + x % 10;
			x /= 10;
		}
		return num;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 13, 10, 12, 31 };
		System.out.println(countDistinctIntegers(nums));
	}
}
