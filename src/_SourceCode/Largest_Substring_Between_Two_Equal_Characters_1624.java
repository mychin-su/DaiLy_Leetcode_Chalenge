package _SourceCode;

public class Largest_Substring_Between_Two_Equal_Characters_1624 {
	public static int maxLengthBetweenEqualCharacters(String s) {
		for (int i = s.length() - 1; i > 0; i--) {
			for (int j = 0; j + i < s.length(); j++) {
				if (s.charAt(j) == s.charAt(j + i)) {
					return i - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "aa";
		System.out.println(maxLengthBetweenEqualCharacters(s));
	}
}
