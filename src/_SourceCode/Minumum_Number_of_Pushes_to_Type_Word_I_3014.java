package _SourceCode;

public class Minumum_Number_of_Pushes_to_Type_Word_I_3014 {
	public static int minimumPushes(String word) {
		int n = word.length();
		int ans = 0, row = 1;
		int quotient = n / 8;
		int remainder = n % 8;
		while (quotient-- >  0) {
			ans += row * 8;
			row++;
		}
		ans += remainder * row;
		return ans;
	}

	public static void main(String[] args) {
		String word = "xycdefghij";
		System.out.println(minimumPushes(word));
	}
}
