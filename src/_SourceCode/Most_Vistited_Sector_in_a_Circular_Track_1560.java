package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Most_Vistited_Sector_in_a_Circular_Track_1560 {
	public static List<Integer> mostVisited(int n, int[] rounds) {
		int start = rounds[0];
		int end = rounds[rounds.length - 1];
		List<Integer> res = new ArrayList<Integer>();
		if (start <= end) {
			for (int i = start; i <= end; i++) {
				res.add(i);
			}
		} else {
			for (int i = 1; i <= end; i++) {
				res.add(i);
			}
			for (int i = start; i <= n; i++) {
				res.add(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int n = 4, rounds[] = { 4, 3, 1, 2 }; // (4) (1 2 3) (4 1 2)     |   (  2 3 4 1 2 3 4 4  )
		System.out.println(mostVisited(n, rounds));
	}
}
