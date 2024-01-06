package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Find_Missing_and_Repeated_Values_2965 {
	public static int[] findMissingAndRepeatedValues(int[][] v) {
		int n = v.length;
		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m.put(v[i][j], m.getOrDefault(v[i][j], 0) + 1);
			}
		}

		int a = -1, b = -1;
		for (int i = 1; i <= n * n; i++) {
			if (m.get(i) == null) {
				b = i;
			} else if (m.get(i) == 2) {
				a = i;
			}
		}

		return new int[] { a, b };
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 3 }, { 2, 2 } };
		System.out.println(findMissingAndRepeatedValues(grid));
	}
}
