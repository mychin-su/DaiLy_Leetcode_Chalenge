package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions_2610 {
	// mang chi chua cac phan tu nho hon hoac bang do dai cua mang
	public static List<List<Integer>> findMatrix(int[] nums) {
		int arr[] = new int[nums.length + 1];
		int max = 0;
		for (int num : nums) {
			arr[num]++; // dem tan so xuat hien cua cac phan tu => arr[1(3),2(1), 3(2), 4(1)];
			if (arr[num] > max) {
				max = arr[num]; // tim max cua mang nums => max = 4
			}
		}
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < max; i++) {
			list.add(new ArrayList<>());
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > 0) { // neu phan tu do co trong mang
					list.get(i).add(j); // lay phan tu dau tien la mot mang trong list roi add cac phan tu
					arr[j]--; // tru phan tu do ra khoi mang
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 1, 2, 3, 1 };
		System.out.println(findMatrix(nums));
	}
}
