package _SourceCode;

public class Find_First_Palindromic_String_in_the_Array_2108 {
	public static String firstPalindrome(String[] words) {
		for (String word : words) {
			if (isPalindrome(word)) {
				return word;
			}
		}
		return "";
	}

	public static boolean isPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);
			if (start != end) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "abc", "car", "ada", "racecar", "cool" };
		System.out.println(firstPalindrome(words));
	}
}
