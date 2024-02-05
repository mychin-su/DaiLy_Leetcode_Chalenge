package _SourceCode;

public class First_Unique_Character_in_a_String_387 {
	public static int firstUniqChar(String s) {
		int[] c = new int[127];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (c[(s.charAt(i) - 'a')] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(firstUniqChar(s));
	}
}
