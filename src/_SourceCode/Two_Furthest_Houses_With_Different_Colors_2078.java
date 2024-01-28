package _SourceCode;

public class Two_Furthest_Houses_With_Different_Colors_2078 {
	public static int maxDistance(int[] colors) {
		int max = 0;
		for (int i = 0; i < colors.length - 1; i++) {
			for (int j = i + 1; j < colors.length; j++) {
				if (colors[i] != colors[j]) {
					max = Math.max(max, j - i);
					break;
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] colors = { 1, 8, 3, 8, 3 };
		System.out.println(maxDistance(colors));
	}
}
