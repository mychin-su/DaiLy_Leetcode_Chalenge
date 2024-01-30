package _SourceCode;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {
	public static int evalRPN(String[] tokens) {
		int a, b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
			if (s.equals("+")) {
				S.add(S.pop() + S.pop());
			} else if (s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
			} else if (s.equals("*")) {
				S.add(S.pop() * S.pop());
			} else if (s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);
			} else {
				S.add(Integer.parseInt(s));
			}
		}
		return S.pop();
	}

	public static void main(String[] args) {
		String token[] = { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(token));
	}
}
