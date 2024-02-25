package _SourceCode;

public class Roman_to_Integer_13 {
	public static int romanToInt(String s) {
		String store_Roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int store_Int[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		int result = 0;
		int j = 0;
		for (int i = 0; i < store_Int.length; i++) {
			 while (j < s.length() && s.startsWith(store_Roman[i], j)) {
			    result += store_Int[i];
			    j += store_Roman[i].length();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "DCXXI";
		System.out.println(romanToInt(s));
	}
}
