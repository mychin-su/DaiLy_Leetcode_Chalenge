package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int count[] = new int[nums.length + 1];
		for (int freq : nums) {
			count[freq]++;
		}
		for (int i = 1 ; i <= nums.length; i ++) {
			if (count[i] == 2) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicates(nums));

	}
}
