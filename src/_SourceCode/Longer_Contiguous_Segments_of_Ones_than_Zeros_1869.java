package _SourceCode;

public class Longer_Contiguous_Segments_of_Ones_than_Zeros_1869 {
	public static boolean checkZeroOnes(String s) {
		int maxZero = 0;
		int zero = 0;
		int maxOne = 0;
		int one = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				one++;
				maxOne = Math.max(maxOne, one);
			} else {
				one = 0;
			}

			if (s.charAt(i) == '0') {
				zero++;
				maxZero = Math.max(maxZero, zero);
			} else {
				zero = 0;
			}
		}
		return maxZero < maxOne;
	}

	public static void main(String[] args) {
		String s = "001011001";
		System.out.println(checkZeroOnes(s));
	}
}
