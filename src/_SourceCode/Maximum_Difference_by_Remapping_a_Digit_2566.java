package _SourceCode;

public class Maximum_Difference_by_Remapping_a_Digit_2566 {
	public static int minMaxDifference(int num) {
		char x[] = String.valueOf(num).toCharArray();
		char y[] = String.valueOf(num).toCharArray();

		int p = x[0], q = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] != '9') {
				p = x[i];
				break;
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] == p) {
				x[i] = '9';
			}
		}
		for (int i = 0; i < y.length; i++) {
			if (y[i] == q) {
				y[i] = '0';
			}
		}
		return Integer.parseInt(String.valueOf(x)) - Integer.parseInt(String.valueOf(y));
	}

	public static void main(String[] args) {
		int num = 21891;
		System.out.println(minMaxDifference(num));
	}
}
