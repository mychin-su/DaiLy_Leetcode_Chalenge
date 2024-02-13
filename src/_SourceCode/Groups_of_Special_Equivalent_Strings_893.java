package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Groups_of_Special_Equivalent_Strings_893 {
	public static int numSpecialEquivGroups(String[] words) {
		Set<String> set = new HashSet<>();
		int result = 0;
		for (String word : words) {
			if (set.add(similarString(word.toCharArray()))) {
				result++;
			}
		}
		return result;
	}

	private static String similarString(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 2; j < c.length;) {
				if (c[i] > c[j] && j < c.length) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
				j += 2;

			}
		}
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		String[] words = { "abc", "acb", "bac", "bca", "cab", "cba" };
		System.out.println(numSpecialEquivGroups(words));
	}
}
