package _SourceCode;

public class Valid_Perfect_Square_367 {
	public static boolean isPerfectSquare(int num) {
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 15;
		System.out.println(isPerfectSquare(num));
	}
}
