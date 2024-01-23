package _SourceCode;

import java.util.Arrays;

public class Check_if_One_String_Swap_Can_Make_Strings_Equal_1790 {
	public static boolean areAlmostEqual(String s1, String s2) {
		int[] s1Array = new int[26];
		int[] s2Array = new int[26];
		if (s1.length() != s2.length()) {
			return false;
		}
		int counter = 0;
		for (int i = 0; i < s1.length(); i++) {
			char s = s1.charAt(i);
			char ss = s2.charAt(i);
			if (s != ss) {
				counter++;
			}
			if (counter > 2) {
				return false;
			}
			s1Array[s - 'a']++;
			s2Array[ss - 'a']--;
		}
		return Arrays.equals(s1Array, s2Array);
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcba";
		System.out.println(areAlmostEqual(s1, s2));
	}
}
