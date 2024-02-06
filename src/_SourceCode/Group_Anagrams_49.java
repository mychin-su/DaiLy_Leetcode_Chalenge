package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams_49 {
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> myMap = new HashMap<>();
		for (String s : strs) {
			char c[] = s.toCharArray();
			Arrays.sort(c);
			String str = String.valueOf(c);
			if (!myMap.containsKey(str)) {
				myMap.put(str, new ArrayList<>());
			}
			myMap.get(str).add(s);

		}
		List<List<String>> result = new ArrayList<>();
		for (List<String> list : myMap.values()) {
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}
}
