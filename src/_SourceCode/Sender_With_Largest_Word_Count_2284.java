package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Sender_With_Largest_Word_Count_2284 {
	public static String largestWordCount(String[] messages, String[] senders) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		for (int i = 0; i < senders.length; i++) {
			if (myMap.containsKey(senders[i])) {
				myMap.put(senders[i], myMap.get(senders[i]) + countWords(messages[i]));
			} else {
				myMap.put(senders[i], countWords(messages[i]));
			}
		}

		int max = Integer.MIN_VALUE;
		String ans = "";
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				ans = entry.getKey();
			} else if (entry.getValue() == max) {
				if (entry.getKey().compareTo(ans) > 0) {
					ans = entry.getKey();
				}
			}
		}
		return ans;
	}

	public static int countWords(String s) {
		return s.split(" ").length;
	}

	public static void main(String[] args) {
		String[] messages = { "How is leetcode for everyone", "Leetcode is useful for practice" };
		String senders[] = { "Bob", "Charlie" };
		System.out.println(largestWordCount(messages, senders));
	}
}
