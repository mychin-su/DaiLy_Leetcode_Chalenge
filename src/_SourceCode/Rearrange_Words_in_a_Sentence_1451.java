package _SourceCode;

import java.util.Arrays;

public class Rearrange_Words_in_a_Sentence_1451 {
	public static String arrangeWords(String text) {
		String str[] = text.split(" ");
		Arrays.sort(str, (a, b) -> (a.length() - b.length()));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			if (i == 0) {
				sb.append(str[i].substring(0, 1).toUpperCase() + str[i].substring(1));
			} else {
				sb.append(str[i].toLowerCase());
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		String text = "Leetcode is cool";
		System.out.println(arrangeWords(text));
	}
}
