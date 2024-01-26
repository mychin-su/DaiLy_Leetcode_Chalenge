package _SourceCode;

public class Partition_Array_Into_Three_Parts_With_Equal_Sum_1013 {
	public static boolean canThreePartsEqualSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		if (sum % 3 != 0) {
			return false;
		}
		int each = sum / 3, temp = 0, found = 0;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
			if (temp == each) {
				temp = 0;
				found++;
			}
		}
		return found >= 3;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 0 };
		System.out.println(canThreePartsEqualSum(arr));
	}
}
