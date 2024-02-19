package _SourceCode;

public class Power_of_Two_231 {
	public static boolean isPowerOfTwo(int n) {
		if(n == 1) return true;
		if(n % 2 != 0 || n < 0) {
			return false;
		}
		return isPowerOfTwo(n / 2);
	}

	public static void main(String[] args) {
		int n = 1;
		System.out.println(isPowerOfTwo(n));
	}
}
