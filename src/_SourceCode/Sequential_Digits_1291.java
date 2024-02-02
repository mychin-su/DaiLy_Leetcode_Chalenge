package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Sequential_Digits_1291 {
	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> list = new ArrayList<Integer>();
		String digits = "123456789";
		int nl = String.valueOf(low).length(); // 4
		int nh = String.valueOf(high).length();// 5

		for (int i = nl; i <= nh; i++) {
			for (int j = 0; j < 10 - i; j++) {
				int num = Integer.parseInt(digits.substring(j, j + i));
				if (num >= low && num <= high) {
					list.add(num);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int low = 1000, high = 13000;
		System.out.println(sequentialDigits(low, high));
	}
}
