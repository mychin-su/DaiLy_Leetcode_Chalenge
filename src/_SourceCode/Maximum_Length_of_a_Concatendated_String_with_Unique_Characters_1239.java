package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Length_of_a_Concatendated_String_with_Unique_Characters_1239 {
	private static int max;

	public static int maxLength(List<String> arr) {
		backTrack(arr, "", 0);
		return max;
	}

	private static void backTrack(List<String> arr, String current, int start) {
		if (max < current.length()) {
			max = current.length();
		}
		for (int i = start; i < arr.size(); i++) {
			if (!isValid(current, arr.get(i)))
				continue;
			backTrack(arr, current + arr.get(i), i + 1);
		}
	}

	public static boolean isValid(String currentString, String newString) {
		int[] array = new int[26];
		for (int i = 0; i < newString.length(); i++) {
			if (++array[newString.charAt(i) - 'a'] == 2) // to handle if the newString has duplicates then it's not
															// valid
				return false;
			if (currentString.contains(newString.charAt(i) + "")) {// check if the currentString contains each char from
																	// newString
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("un");
		arr.add("iq");
		arr.add("ue");
		System.out.println(maxLength(arr));
	}
}
