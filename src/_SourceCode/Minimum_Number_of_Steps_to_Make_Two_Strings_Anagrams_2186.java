package _SourceCode;

public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagrams_2186 {
	public static int minSteps(String s, String t) {
		int ans = 0;
		int[] sCounter = new int[26];
		int[] tCounter = new int[26];
		for (char c : s.toCharArray()) {
			sCounter[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			tCounter[c - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			ans += Math.abs(sCounter[i] - tCounter[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "leetcode";
		String t = "coats";
		System.out.println(minSteps(s, t));
	}
}
