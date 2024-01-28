package _SourceCode;

public class Minimum_Number_of_Operations_to_Convert_Time_2224 {
	public static int convertTime(String current, String correct) {
		String[] minutesCurrent = current.split(":");
		String[] minutesCorrect = correct.split(":");
		int minutes1 = 0, minutes2 = 0;
		minutes1 = Integer.valueOf(minutesCurrent[0]) * 60 + Integer.valueOf(minutesCurrent[1]);
		minutes2 = Integer.valueOf(minutesCorrect[0]) * 60 + Integer.valueOf(minutesCorrect[1]);
		int total = 0;
		if (minutes2 < minutes1) {
			total = minutes2 + (60 * 60 - minutes1);
		} else {
			total = minutes2 - minutes1;
		}
		int ans = 0;
		if (total >= 60) {
			ans += total / 60;
			total -= 60 * ans;
		}
		if (total >= 15) {
			int res = total / 15;
			ans += res;
			total -= 15 * res;
		}
		if (total >= 5) {
			int res = total / 5;
			ans += res;
			total -= 5 * res;
		}
		if (total >= 1) {
			ans += total;
		}
		return ans;

	}

	public static void main(String[] args) {
		String current = "11:00";
		String correct = "11:01";
		System.out.println(convertTime(current, correct));
	}
}
