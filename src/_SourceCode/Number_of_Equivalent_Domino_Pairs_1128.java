package _SourceCode;

public class Number_of_Equivalent_Domino_Pairs_1128 {
	public static int numEquivDominoPairs(int[][] dominoes) {
		// we need to access indexes from 0 to 99. max number of dominoes is 9
		int[] counts = new int[100];
		int res = 0;
		// chekc every pair of dominoes
		for (int[] d : dominoes) {
			// get upper and down number, make upper always smaller
			int up = d[0] < d[1] ? d[0] : d[1];
			int down = d[0] < d[1] ? d[1] : d[0];
			res += counts[up * 10 + down]++;
		}
		return res;
	}

	public static void main(String[] args) {
		int dominoes[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
		System.out.println(numEquivDominoPairs(dominoes));
	}
}
