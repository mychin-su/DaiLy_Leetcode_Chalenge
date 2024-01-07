package _SourceCode;

public class Perfect_Number_507 {
	public static boolean checkPerfectNumber(int num) {
		if(num == 1) return false;
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i;
				sum += num / i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		int num = 7;
		System.out.println(checkPerfectNumber(num));
	}
}
