package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Occurences_After_Bigram_1078 {
	public static String[] findOcurrences(String text, String first, String second) {
		List<String> s = new ArrayList<String>();
		String[] arr = text.trim().split(" ");
		for (int i = 0; i < arr.length - 2; i++) {
			if (first.equals(arr[i]) && second.equals(arr[i + 1])) {
				s.add(arr[i + 2]);
			}
		}
		String[] ans = s.toArray(new String[0]);
		return ans;
	}

	public static void main(String[] args) {
		String text = "alice is a good forl she is a good student";
		String first = "a";
		String second = "good";
		System.out.println(findOcurrences(text, first, second));
	}
}
