package _SourceCode;

import java.util.Arrays;

public class Check_if_The_Number_is_Fascinating_2729 {
	public static boolean isFascinating(int n) {
//		String s = String.valueOf(n) + String.valueOf(2 * n) + String.valueOf(3 * n);
//
//		int[] arr = new int[9];
//		Arrays.fill(arr, 1);
//
//		for (int i = 0; i < s.length(); i++) {
//			int j = s.charAt(i) - '0';
//			if (j - 1 < 0) {
//				return false;
//			}
//			if (arr[j - 1] == 0) {
//				return false;
//			} else {
//				arr[j - 1] = 0;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				return false;
//			}
//		}
//		return true;

		return n == 192 || n == 219 || n == 273 || n == 327;
	}

	public static void main(String[] args) {
		int n = 192;
		System.out.println(isFascinating(n));
	}
}
