package _SourceCode;

public class Maximum_Odd_Binary_Number_2864 {
	public static String maximumOddBinaryNumber(String s) {
		int count1 = 0;
		int count0 = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '1') {
				count1++;
			} else {
				count0++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count1- 1; i ++) {
			sb.append("1");
		}
		for(int i = 0; i < count0; i ++) {
			sb.append("0");
		}
		sb.append("1");
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "0101";
		System.out.println(maximumOddBinaryNumber(s));
	}
}
