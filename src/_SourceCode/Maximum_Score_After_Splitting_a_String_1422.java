package _SourceCode;

public class Maximum_Score_After_Splitting_a_String_1422 {
	public int maxScore(String s) {
		int max = Integer.MIN_VALUE;
		int count0 = 0;
		int count1 = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '1') {
				count1++;
			}
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0') {
				count0++;
			} else {
				count1--;
			}
			max = Math.max(max, count0 + count1);
		}
		return max;
	}
}
