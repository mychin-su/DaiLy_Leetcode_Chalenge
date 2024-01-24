package _SourceCode;

public class Delete_Characters_to_Make_Fancy_String_1957 {
	public static String makeFancyString(String s) {
		char prev = s.charAt(0);
		int freq = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == prev) {
				freq++;
			} else {
				prev = c;
				freq = 1;
			}
			if (freq < 3) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "leeetcode";
		System.out.println(makeFancyString(s));
	}
}
