package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Players_With_Zero_or_One_Losses_2225 {
	public static List<List<Integer>> findWinners(int[][] matches) {
		int[] won = new int[100001];
		int[] loss = new int[100001];

		for (int[] match : matches) {
			won[match[0]]++;
			loss[match[1]]++;
		}

		List<List<Integer>> ans = new ArrayList<>();

		List<Integer> wonAllMathches = new ArrayList<>();
		List<Integer> lostOneMatch = new ArrayList<>();

		for (int i = 0; i < won.length; i++) {
			if (won[i] > 0 && loss[i] == 0) {
				wonAllMathches.add(i);
			}
			if (loss[i] == 1) {
				lostOneMatch.add(i);
			}
		}
		ans.add(wonAllMathches);
		ans.add(lostOneMatch);
		return ans;
	}

	public static void main(String[] args) {
		int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
				{ 10, 9 } };
		System.out.println(findWinners(matches));
//		findWinners(matches);
	}
}
