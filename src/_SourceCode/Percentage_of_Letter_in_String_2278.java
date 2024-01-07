package _SourceCode;

public class Percentage_of_Letter_in_String_2278 {
	public static int percentageLetter(String s, char letter) {
		int count = 0;
		int total = s.length();
		for (char c : s.toCharArray()) {
			if (c == letter) {
				count++;
			}
		}
		if (count == 0)
			return 0;
		int per = (count * 100) / total;
		return per;

	}

	public static void main(String[] args) {
		String s = "foobar";
		char letter = 'o';
		System.out.println(percentageLetter(s, letter));
	}
}
