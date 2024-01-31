package _SourceCode;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temparetures_739 {
	public static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> st = new Stack<Integer>();
		int n = temperatures.length;
		int[] ans = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			// Popping all indices with a lower or equal temperature than the current index
			while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
				st.pop();
			}

			// If the stack still has elements, then the next warmer temperature exists!
			if (!st.isEmpty()) {
				ans[i] = st.peek() - i;
			}

			// Inserting current index in the stack: monotonicity is maintained!
			st.push(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		int temperatures[] = { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 };
		System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
	}
}
