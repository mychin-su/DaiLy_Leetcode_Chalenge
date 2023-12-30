package _SourceCode;

public class Redistribute_Character_to_Make_All_Strings_Equal_1897 {
	public static boolean makeEqual(String[] words) {
//		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
//		for (String string : words) {
//			for (char c : string.toCharArray()) {
//				myMap.put(c, myMap.getOrDefault(c, 0) + 1);
//			}
//		}
//		int wordCount = words.length;
//		for (int count : myMap.values()) {
//			if (count % wordCount != 0) {
//				return false;
//			}
//		}
//		return true;

		if (words.length == 1) {
			return true;
		}
		int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
			return false;
		}
		int myMap[] = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				myMap[c - 'a']++;
			}
		}
		for (int i : myMap) {
			if (i % words.length != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String words[] = { "abc", "aabc", "bc" };
		System.out.println(makeEqual(words));
	}
}
