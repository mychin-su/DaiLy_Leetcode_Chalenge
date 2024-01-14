package _SourceCode;

import java.util.Arrays;

public class Determine_if_Two_Strings_Are_Close_1657 {
	public static boolean closeStrings(String word1, String word2) {
		// count the English letters
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for (char ch : word1.toCharArray()) {
			arr1[ch - 'a']++;
		}
		for (char ch : word2.toCharArray()) {
			arr2[ch - 'a']++;
		}

		// if one has a letter which another one doesn't have, dont exist
		for (int i = 0; i < 26; i++) {
			if (arr1[i] == arr2[i]) {
				continue;
			}
			if (arr1[i] == 0 || arr2[i] == 0) {
				return false;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < 26; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String word1 = "cabbba";
		String word2 = "abbccc";
		System.out.println(closeStrings(word1, word2));
	}
}
