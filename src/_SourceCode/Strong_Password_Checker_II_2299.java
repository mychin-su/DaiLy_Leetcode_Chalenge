package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Strong_Password_Checker_II_2299 {
	public static boolean strongPasswordCheckerII(String password) {
		Set<Character> seen = new HashSet<Character>();
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (i > 0 && c == password.charAt(i - 1)) {
				return false;
			}
			if (Character.isLowerCase(c)) {
				seen.add('l');
			}
			if (Character.isUpperCase(c)) {
				seen.add('u');
			}
			if (Character.isDigit(c)) {
				seen.add('d');
			} else {
				seen.add('s');
			}
		}
		return password.length() >= 8 && seen.size() == 4;
	}

	public static void main(String[] args) {
		String password = "IloveLe3tcode!";
		System.out.println(strongPasswordCheckerII(password));
	}
}
