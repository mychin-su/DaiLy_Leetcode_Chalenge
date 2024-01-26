package _SourceCode;

public class Count_Tested_Devicer_After_Test_Operations_2960 {
	public static int countTestedDevices(int[] batteryPercentages) {
//		int count = 0;
//		for (int i = 0; i < batteryPercentages.length; i++) {
//			if (batteryPercentages[i] > 0) {
//				count++;
//				int j = i;
//				while (j + 1 < batteryPercentages.length) {
//					batteryPercentages[j + 1] = Math.max(0, batteryPercentages[j + 1] - 1);
//					j++;
//				}
//			}
//		}
//		return count;

		int c = 0;
		for (int i = 0; i < batteryPercentages.length; i++) {
			if (batteryPercentages[i] - c > 0) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int batteryPercentages[] = { 1, 1, 2, 1, 3 };
		System.out.println(countTestedDevices(batteryPercentages));
	}
}
