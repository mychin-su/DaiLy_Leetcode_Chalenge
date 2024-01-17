package _SourceCode;

public class Count_Days_Spent_Together_2409 {
	public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		int a1 = Days(arriveAlice);
		int l1 = Days(leaveAlice);
		int a2 = Days(arriveBob);
		int l2 = Days(leaveBob);
		if (l1 < a2 || l2 < a1)
			return 0;
		return Math.abs(Math.min(l1, l2) - Math.max(a1, a2) + 1);
	}

	public static int Days(String str) { // Tính tổng số ngày
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		int m = Integer.valueOf(str.substring(0, 2));
		int d = Integer.valueOf(str.substring(3, 5));
		for (int i = 0; i < m - 1; i++) {
			sum += month[i];
		}
		return d + sum;
	}

	public static void main(String[] args) {
		String arriveAlice = "08-15";
		String leaveAlice = "08-18";
		String arriveBob = "08-16";
		String leaveBob = "08-19";
		System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
	}
}
