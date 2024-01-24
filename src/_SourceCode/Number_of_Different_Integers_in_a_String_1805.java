package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Number_of_Different_Integers_in_a_String_1805 {
	public static int numDifferentIntegers(String word) {
		String[] arr = word.replaceAll("[a-zA-X]", " ").split("\\s+"); // thay thế tất cả các chữ cái bằng khoảng trắng
																		// và tách cách khoảng trắng đó thằng 1 mảng các
																		// kí tự bới tất cả các dấu cách
		Set<String> set = new HashSet<String>();
		for (String str : arr) {
			if (!str.isEmpty()) {
				set.add(String.valueOf(str.replaceAll("^0*", "")));
			}

		}
		return set.size();
	}

	public static void main(String[] args) {
		String word = "a123bc34d8ef34";
		System.out.println(numDifferentIntegers(word));
	}
}
