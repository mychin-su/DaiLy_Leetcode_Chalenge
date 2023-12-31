package _SourceCode;

public class Maximum_Value_of_a_String_in_an_Array_2496 {
	public static int maximumValue(String[] strs) {
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < strs.length; i++) {
//			if (strs[i].matches("-?\\d+(\\.\\d+)?")) {
//				max = Math.max(max, Integer.valueOf(strs[i]));
//			} else {
//				max = Math.max(max, strs[i].length());
//			}
//		}
//		return max;
		int ans = 0;
		for (String s : strs) {
			ans = Math.max(ans, x(s));
		}
		return ans;

	}

	private static int x(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				return s.length();
			}
		}
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		String[] strs = { "alic3", "bob", "3", "4", "00000" };
		System.out.println(maximumValue(strs));
	}
}
