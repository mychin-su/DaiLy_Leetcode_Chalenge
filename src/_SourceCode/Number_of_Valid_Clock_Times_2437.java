package _SourceCode;

public class Number_of_Valid_Clock_Times_2437 {
	public static int countTime(String time) {
		if (time.equals("??:??")) {
			return 24 * 60; // 24 lua chon ve gio va 60 lua chon ve phut
		}

		int res = 1;
		if (time.charAt(0) == '?' && time.charAt(1) == '?') {
			res *= 24;
		} else if (time.charAt(0) == '?') {
			res *= (time.charAt(1) - '0' >= 4 ? 2 : 3);
		} else if (time.charAt(1) == '?') {
			res *= (time.charAt(0) - '0' >= 2 ? 4 : 10);
		}

		if (time.charAt(4) == '?')
			res *= 10;
		if (time.charAt(3) == '?')
			res *= 6;
		return res;

	}

	public static void main(String[] args) {
		String time = "?5:00";
		System.out.println(countTime(time));
	}
}
