package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Optimal_Partition_of_String_2405 {
	public static int partitionString(String s) {
		int count = 0;
		Set<Character> mySet = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mySet.contains(c)) {
				count++;
				mySet.clear();
			}
			mySet.add(c);
		}
		return count + 1;
	}

	public static void main(String[] args) {
		String s = "ssssss";
		System.out.println(partitionString(s));
	}
}
