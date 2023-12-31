package _SourceCode;

public class Decrypt_String_from_Alphabet_to_Integer_Mapping_1309 {
	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '#') {
				sb.append((char) ('a' + (s.charAt(i - 1) - '0') + 10 * (s.charAt(i - 2) - '0') - 1));
				i -= 2;
			} else {
				sb.append((char) ('a' + (s.charAt(i) - '0') - 1));
			}
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String s = "10#11#12";
		System.out.println(freqAlphabets(s));
	}
}
