package _SourceCode;

import java.util.Arrays;

public class Relative_Sort_Array_1122 {
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] cnt = new int[1001];
		for (int num : arr1) {
			cnt[num]++;
		}
		int i = 0;
		for (int num : arr2) {
			while (cnt[num]-- > 0) {
				arr1[i++] = num;
			}
		}
		for (int n = 0; n < cnt.length; n++) {
			while (cnt[n]-- > 0) {
				arr1[i++] = n;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int arr2[] = { 2, 1, 4, 3, 9, 6 };

		System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
	}
}
