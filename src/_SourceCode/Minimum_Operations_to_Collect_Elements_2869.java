package _SourceCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Minimum_Operations_to_Collect_Elements_2869 {
	public static int minOperations(List<Integer> nums, int k) {
		int total_op = 0;
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i = nums.size() - 1; i >= 0; i--) {
			total_op++;
			if (nums.get(i) <= k) {
				mySet.add(nums.get(i));
			}
			if (mySet.size() == k) {
				break;
			}
		}
		return total_op;
	}

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);
		int k = 2;
		System.out.println(minOperations(list, k));
	}
}
