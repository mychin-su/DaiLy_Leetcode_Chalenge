package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Unique_Number_of_Occurrences_1207 {
	public static boolean uniqueOccurrences(int[] arr) {
		int[] numberOfOccurrences = new int[2001];

		for (int i : arr) {
			numberOfOccurrences[1000 + i]++;
		}
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i : numberOfOccurrences) {
			if (i > 0) {

				if (mySet.contains(i)) {
					return false;
				}
				mySet.add(i);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 26, 2, 16, 16, 5, 5, 26, 2, 5, 20, 20, 5, 2, 20, 2, 2, 20, 2, 16, 20, 16, 17, 16, 2, 16, 20, 26,
				16 };
		System.out.println(uniqueOccurrences(arr));
	}
}
