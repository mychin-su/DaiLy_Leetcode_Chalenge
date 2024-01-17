package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Words_Within_Two_Edits_of_Dictionary_2452 {
	public static List<String> twoEditWords(String[] queries, String[] dictionary) {
		List<String> ans = new ArrayList<String>();
		for (String query : queries) {
			for (String word : dictionary) {
				int diff = diff(query, word);
				if (diff <= 2) {
					ans.add(query);
					break;
				}
			}
		}
		return ans;
	}

	private static int diff(String a, String b) {
		int same = 0;
		int n = a.length();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				same++;
			}
		}
		return n - same;

	}

	public static void main(String[] args) {
		String queries[] = { "word", "note", "ants", "wood" };
		String dictionary[] = { "wood", "joke", "moat" };
		System.out.println(twoEditWords(queries, dictionary));
	}
}
