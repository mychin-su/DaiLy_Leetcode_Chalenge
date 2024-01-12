package _SourceCode;

public class Find_the_Longest_Balanced_SubString_of_a_Binary_String_2609 {
	public static int findTheLongestBalancedSubstring(String s) {
		int res = 0;
		String tmp = "01";
		while (tmp.length() <= s.length()) {
			if (s.contains(tmp)) {
				res = tmp.length();
			}
			tmp = "0" + tmp + "1";
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "0011";
		System.out.println(findTheLongestBalancedSubstring(s));
	}
}
