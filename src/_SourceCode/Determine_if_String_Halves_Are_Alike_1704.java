package _SourceCode;

public class Determine_if_String_Halves_Are_Alike_1704 {
	public static boolean halvesAreAlike(String s) {
		int n = s.length();
		String s1 = s.substring(0, n / 2);
		String s2 = s.substring(n / 2, n);
		int count1 = count(s1);
		int count2 = count(s2);
		return count1 == count2;
	}

	public static int count(String s) {
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (vowels.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "textbook";
		System.out.println(halvesAreAlike(s));
	}
}
