package _SourceCode;

public class Minimum_Time_to_Make_Rope_Colorful_1578 {
	public static int minCost(String colors, int[] neededTime) {
		// c1
//		int totalTime = 0;
//		int i = 0, j = 0;
//		while (i < neededTime.length && j < neededTime.length) {
//			int currTotal = 0, currMax = 0;
//			while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
//				currTotal += neededTime[j];
//				currMax = Math.max(neededTime[j], currMax);
//				j++;
//			}
//
//			totalTime += currTotal - currMax;
//			i = j;
//		}
//		return totalTime;

		// c2
		int needed = 0;
		int n = neededTime.length;
		char[] chc = colors.toCharArray();
		int curr_max = neededTime[0];
		for (int i = 1; i < n; i++) {
			if (chc[i - 1] != chc[i]) {
				curr_max = neededTime[i];
			} else {
				needed += Math.min(curr_max, neededTime[i]);
				curr_max = Math.max(curr_max, neededTime[i]);
			}
		}
		return needed;
	}

	public static void main(String[] args) {
		String colors = "abaac";
		int neededTime[] = { 1, 2, 3, 4, 5 };
		System.out.println(minCost(colors, neededTime));

	}
}
