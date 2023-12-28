package _SourceCode;

import java.util.Arrays;

public class Sort_the_Students_by_Their_Kth_Score_2545 {
	public static int[][] sortTheStudents(int[][] score, int k) {
		Arrays.sort(score, (a, b) -> b[k] - a[k]); // Biểu thức lambda xác định bộ so sánh tùy chỉnh. Nó lấy hai phần tử
													// `a` và `b` từ mảng `score` (mỗi phần tử là một mảng số nguyên 1D)
													// và so sánh chúng dựa trên phần tử thứ `k` của chúng. và sắp xếp
													// theo thứ tự giảm dần
		return score;
	}

	public static void main(String[] args) {
		int score[][] = { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } };
		int k = 2;
		System.out.println(sortTheStudents(score, k));
	}
}
