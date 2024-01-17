package _SourceCode;

import java.util.Stack;

public class Minimum_String_Length_After_Removing_Substrings_2696 {
	public static int minLength(String s) {
		Stack<Character> st = new Stack<Character>();
		int n = s.length();
		st.push(s.charAt(0));
		for (int i = 1; i < n; i++) {
			if (!st.isEmpty() && ((s.charAt(i) == 'D' && st.peek() == 'C') || s.charAt(i) == 'B' && st.peek() == 'A')) {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}
		return st.size();
	}

	public static void main(String[] args) {
		String s = "ABFCACDB";
		System.out.println(minLength(s));
	}
}
