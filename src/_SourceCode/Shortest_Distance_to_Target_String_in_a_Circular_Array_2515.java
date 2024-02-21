package _SourceCode;

public class Shortest_Distance_to_Target_String_in_a_Circular_Array_2515 {
	public static int closetTarget(String[] words, String target, int startIndex) {
		int min = Integer.MAX_VALUE;
		int n = words.length;
		for (int i = 0; i < n; i++) {
			if (target.equals(words[i])) {
				int d = Math.abs(i - startIndex);
				min = Math.min(min, n - d);
				min = Math.min(min, d);
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static void main(String[] args) {
		String words[] = { "hello", "i", "am", "leetcode", "hello" };
		String target = "hello";
		int startIndex = 1;
		System.out.println(closetTarget(words, target, startIndex));
	}
}
