package _SourceCode;

public class Count_Good_Triplets_1534 {
	public static int countGoodTriplets(int[] arr, int a, int b, int c) {
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (Math.abs(arr[i] - arr[j]) <= a) {
					for (int k = j + 1; k < arr.length; k++) {
						if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 3, 7, 3, 12, 1, 12, 2, 3 };
		int a = 5, b = 8, c = 1;
		System.out.println(countGoodTriplets(arr, a, b, c));
	}
}
