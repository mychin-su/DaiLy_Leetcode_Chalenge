package _SourceCode;

public class Count_Opetations_to_Obtain_Zero_2169 {
	public static int countOperations(int num1, int num2) {
		int count = 0;
		while (num1 != 0 && num2 != 0) {
			if (num1 >= num2) {
				count++;
				num1 = num1 - num2;
			} else if (num2 >= num1) {
				count++;
				num2 = num2 - num1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		System.out.println(countOperations(num1, num2));
	}
}
