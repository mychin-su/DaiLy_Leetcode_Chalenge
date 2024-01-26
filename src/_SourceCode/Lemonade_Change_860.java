package _SourceCode;

public class Lemonade_Change_860 {
	public static boolean lemonadeChange(int[] bills) {
		int fives = 0;
		int tens = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				fives++;
			}
			if (bills[i] == 10) {
				if (fives > 0) {
					fives--;
					tens++;
				} else {
					return false;
				}
			}

			if (bills[i] == 20) {
				if (tens > 0 && fives > 0) {
					tens--;
					fives--;
				} else if (fives >= 3) {
					fives -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] bills = { 5, 5, 10, 10, 20 };
		System.out.println(lemonadeChange(bills));
	}
}
