package _SourceCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort_Characters_By_Frequency_451 {
	public static String frequencySort(String s) {
		//Counting the occurence on each character 
		HashMap<Character, Integer> cnt = new HashMap<>();
		for(char c : s.toCharArray()) {
			cnt.put(c, cnt.getOrDefault(c, 0) + 1);
		}
		//Sorting decreasing 
		List<Character> chars = new ArrayList<>(cnt.keySet());// lay ra cac ky tu trong map 
		Collections.sort(chars, (a, b) -> (cnt.get(b) - cnt.get(a)));
		
		//Build string 
		StringBuilder sb = new StringBuilder();
		for(Object c : chars) { // lap qua tung ky tu trong chars
			for(int i = 0 ; i < cnt.get(c); i ++) { // lap qua cac ky tu lap lai trong tung ky trong c 
				sb.append(c);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));
	}
}
