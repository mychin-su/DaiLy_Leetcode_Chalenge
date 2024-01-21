package _SourceCode;

public class Maximum_Value_of_an_Ordered_Triplet_I_2873 {
	public static long maximumTripletValue(int[] A) {
		long res = 0, maxa = 0, maxab = 0;
		for (int a : A) {
			res = Math.max(res, 1L * maxab * a);
			maxab = Math.max(maxab, maxa - a);
			maxa = Math.max(maxa, a);
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 12, 6, 1, 2, 7 };
		System.out.println(maximumTripletValue(nums));
	}
}
