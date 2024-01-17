package _SourceCode;

public class Make_The_String_Great_1544 {
	public static String makeGood(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
				return makeGood(s.substring(0, i) + s.substring(i + 2));
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "leEeetcode";
		System.out.println(makeGood(s));
	}
}
