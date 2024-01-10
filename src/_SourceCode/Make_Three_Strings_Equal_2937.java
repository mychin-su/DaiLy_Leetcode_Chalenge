package _SourceCode;

public class Make_Three_Strings_Equal_2937 {
	public static int findMinimumOperations(String s1, String s2, String s3) {
		int len = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
		int sum = s1.length() + s2.length() + s3.length();

		// Check if the first characters of s1, s2 and s2 are not the same
		if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s2.charAt(0) != s3.charAt(0)) {
			return -1;
		}

		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
				sum -= 3;
			} else {
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String s1 = "abc", s2 = "abb", s3 = "ab";
		System.out.println(findMinimumOperations(s1, s2, s3));
	}
}
