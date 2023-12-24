package _SourceCode;

public class Minimum_Changes_To_Make_Alternating_Binary_String_1758 {
	public static int minOperations(String s) {
		// 2 truong hơp kí tu dau tien bat dau bang so 0 và băt dau bang so 1
		int start0 = 0; // thay the ki tu dau tien bat dau la so 0
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (s.charAt(i) == '1') {
					start0++;
				}
			} else {
				if (s.charAt(i) == '0') {
					start0++;
				}
			}
		}
		int start1 = 0; // thay the ki tu dau tien bang so 1
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (s.charAt(i) == '0') {
					start1++;
				}
			} else {
				if (s.charAt(i) == '1') {
					start1++;
				}
			}
		}
		return Math.min(start0, start1);
	}

	public static void main(String[] args) {
		String s = "110010";
		System.out.println(minOperations(s));
	}
}
