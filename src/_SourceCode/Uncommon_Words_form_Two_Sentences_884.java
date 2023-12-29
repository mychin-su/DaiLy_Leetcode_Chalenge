package _SourceCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Uncommon_Words_form_Two_Sentences_884 {
	public static String[] uncommonFromSentences(String s1, String s2) {
		Map<String, Integer> count = new HashMap<String, Integer>();
		for (String word : s1.split(" ")) {
			count.put(word, count.getOrDefault(word, 0) + 1);
		}
		for (String word : s2.split(" ")) {
			count.put(word, count.getOrDefault(word, 0) + 1);
		}
		List<String> ans = new ArrayList<String>();
		for (String word : count.keySet()) {
			if (count.get(word) == 1) {
				ans.add(word);
			}
		}
		return ans.toArray(new String[ans.size()]);
	}

	public static void main(String[] args) {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		System.out.println(uncommonFromSentences(s1, s2));
	}
}
