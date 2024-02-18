package _SourceCode;

public class Sum_of_Beauty_of_All_Substrings_1781 {
	public static int getMinCount(int[] count) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				min = Math.min(min, count[i]);
			}
		}
		return min;
	}

	public static int getMaxCount(int[] count) {
		int max = 0;
		for (int i = 0; i < count.length; i++) {
			max = Math.max(max, count[i]);
		}
		return max;
	}

	public static int beautySum(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int[] charCount = new int[26];
			for (int j = i; j < s.length(); j++) {
				charCount[s.charAt(j) - 'a']++;
				sum += getMaxCount(charCount) - getMinCount(charCount);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String s = "aabcb";
		System.out.println(beautySum(s));
	}
}
