package _SourceCode;

public class Integer_to_Roman_12 {
	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int[] storeInt = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] storeRoman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		for (int i = 0; i < storeInt.length; i++) {
			while (num >= storeInt[i]) {
				sb.append(storeRoman[i]);
				num -= storeInt[i];
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int num = 3;
		System.out.println(intToRoman(num));
	}
}
