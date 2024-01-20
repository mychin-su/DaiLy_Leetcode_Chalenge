package _SourceCode;

public class Maximum_Nesting_Depth_of_the_Parentheses_1614 {
	public static int maxDepth(String s) {
		int count = 0; // current dept
		int max = 0; // depth max
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
			} else if(s.charAt(i) == ')'){
				count--;
			}
			max = Math.max(count, max);
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "(1+(2*3)+(( 8 )/4))+1";
		System.out.println(maxDepth(s));
	}
}
