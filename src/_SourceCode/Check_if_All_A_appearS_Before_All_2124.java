package _SourceCode;

public class Check_if_All_A_appearS_Before_All_2124 {
	public static boolean checkString(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i + 1);
			if ((c1 - '0') > (c2 - '0')) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abab";
		System.out.println(checkString(s));
	}
}
