package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Count_Vowel_Substrings_of_a_String_2062 {
	public static int countVowelSubstrings(String word) {
		int vow = 0;
		int n = word.length();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < n - 4; i++) {
			set.clear();
			for (int j = i; j < n; j++) {
				char ch = word.charAt(j);
				if (ch == 'u' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'i') {
					set.add(ch);
					if (set.size() == 5) {
						vow++;
					}
				} else {
					break;
				}
			}
		}
		return vow;
	}

	public static void main(String[] args) {
		String word = "aeiouu";
		System.out.println(countVowelSubstrings(word));
	}
}
