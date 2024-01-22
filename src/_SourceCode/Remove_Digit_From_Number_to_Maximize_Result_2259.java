package _SourceCode;

public class Remove_Digit_From_Number_to_Maximize_Result_2259 {
	public static String removeDigit(String number, char digit) {
		int index = 0;
		int n = number.length();
		for (int i = 0; i < n; i++) {
			if (number.charAt(i) == digit) {
				index = i;
				if (i <= n - 2 && digit < number.charAt(i + 1)) {
					break;
				}
			}
		}
		return number = number.substring(0, index) + number.substring(index + 1);
	}

	public static void main(String[] args) {
		String number = "135223";
		char digit = '3';
		System.out.println(removeDigit(number, digit));
	}
}
