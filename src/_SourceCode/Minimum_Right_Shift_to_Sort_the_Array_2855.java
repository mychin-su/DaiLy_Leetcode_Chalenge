package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Right_Shift_to_Sort_the_Array_2855 {
	public static int minimumRightShifts(List<Integer> nums) {
		int index = 0, c = 0;
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i - 1) > nums.get(i)) {
				index = i;
				c++;
			}
		}
		if (c > 1) {
			return -1;
		}
		if (index == 0) {
			return 0;
		}

		return nums.get(nums.size() - 1) > nums.get(0) ? -1 : nums.size() - index;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);
		System.out.println(minimumRightShifts(list));
	}
}
