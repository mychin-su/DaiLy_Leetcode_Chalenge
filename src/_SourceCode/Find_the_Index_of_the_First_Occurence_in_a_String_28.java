package _SourceCode;

public class Find_the_Index_of_the_First_Occurence_in_a_String_28 {
	public static int strStr(String s, String t) {
		if (t.isEmpty()) {
			return 0;
		}
		for (int i = 0; i <= s.length() - t.length(); i++) {
			if (s.charAt(i) == t.charAt(0)) {
				if (s.substring(i, t.length() + i).equals(t)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
	}
}
