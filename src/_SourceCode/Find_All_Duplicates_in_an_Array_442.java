package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		int count[] = new int[100001];
		for (int num : nums) {
			count[num]++;
		}
		for (int i = 0 ; i < count.length; i ++) {
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
