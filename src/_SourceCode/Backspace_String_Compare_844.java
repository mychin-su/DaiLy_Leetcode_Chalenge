package _SourceCode;

import java.util.Stack;

public class Backspace_String_Compare_844 {
	public static boolean backspaceCompare(String s, String t) {
		return stackSolution(s).equals(stackSolution(t));
	}

	public static String stackSolution(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c != '#') {
				stack.push(c);
			} else if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		return stack.toString();

	}

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s, t));
	}
}
