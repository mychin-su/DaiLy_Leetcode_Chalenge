package _SourceCode;

import java.util.HashSet;

public class Contains_Diplicate_II_219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		// Base case //
		if (nums == null || nums.length < 2 || k == 0) {
			return false;
		}

		int i = 0;
		// Create a HashSet for storing previous of k elements ...
		HashSet<Integer> hset = new HashSet<Integer>();
		// Traversa for all elements of the given array in a for loop
		for (int j = 0; j < nums.length; j++) {
			// If duplicates element is present at distance less than equal to k, return
			// true...
			if (!hset.add(nums[j])) {
				return true;
			}
			// If size of the Hash Set becomes greater than k...
			if (hset.size() > k) { // neu kich thuoc cua set lon
				hset.remove(nums[i]); // xoa phan tu dau tien trong HashSet
				i++;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 1 };
		int k = 3;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
}
