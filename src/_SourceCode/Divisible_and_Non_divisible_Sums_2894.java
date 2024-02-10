package _SourceCode;

public class Divisible_and_Non_divisible_Sums_2894 {
	public static int differenceOfSums(int n, int m) {
		int sumNumbers = 0;
		int sumNonDibisible = 0;
		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				sumNonDibisible += i;
			} else {
				sumNumbers += i;
			}

		}
		return sumNumbers - sumNonDibisible;
	}

	public static void main(String[] args) {
		int n = 10, m = 3;
		System.out.println(differenceOfSums(n, m));
	}
}
