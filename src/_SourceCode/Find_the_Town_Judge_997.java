package _SourceCode;

public class Find_the_Town_Judge_997 { // Tim tham phan cua thi tri
	public static int findJudge(int n, int[][] trust) {
		if (trust.length == 0 && n == 1) {
			return 1;
		}
		int count[] = new int[n + 1];
		for (int[] person : trust) {
			count[person[0]]--; // người dãn nhãn đầu tiên trỏ đến thẩm phán nên ko tin tưởng
			count[person[1]]++; // người dãn nhãn thứ hai vì đã có người thứ 1 tin tưởng nên ta tăng độ tin
								// tưởng
		}

		for (int person = 0; person < count.length; person++) {
			if (count[person] == n - 1) { // nếu n = 3 thì sẽ có 2 người sẽ trỏ đến
				return person;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 3, trust[][] = { { 1, 3 }, { 2, 3 } };
		System.out.println(findJudge(n, trust));
	}
}
