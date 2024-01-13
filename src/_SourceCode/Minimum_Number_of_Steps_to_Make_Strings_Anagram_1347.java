package _SourceCode;

public class Minimum_Number_of_Steps_to_Make_Strings_Anagram_1347 {
	public static int minSteps(String s, String t) {
		int res[] = new int[26];
		for (char c : s.toCharArray()) {
			res[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			res[c - 'a']--;
		}
		int sum = 0;
		for (int i : res) {
			if (i > 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String s = "bab", t = "aba";
		System.out.println(minSteps(s, t));
	}
}
