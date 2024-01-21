package _SourceCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Find_Resultant_Array_After_Removing_Anagrams_2273 {
	public static List<String> removeAnagrams(String[] words) {
		Stack<String> stack = new Stack<String>();
		for (int i = words.length - 1; i >= 0; i--) {
			String s = words[i];
			while (!stack.isEmpty() && anagram(stack.peek(), s) == true) { // vi 2 tu ke tiep neu la dao chu cua nhau
																			// thi ta loai bo ra khoi stack
				stack.pop();
			}
			stack.push(s);
		}
		List<String> ans = new LinkedList<String>();
		while (!stack.isEmpty()) {
			ans.add(stack.pop());
		}
		return ans;
	}

	public static boolean anagram(String p, String q) {// so sanh 2 tu co giong nhau hay khong
		int[] arr = new int[26];
		for (char i : p.toCharArray()) {
			arr[i - 'a']++;
		}
		for (char i : q.toCharArray()) {
			arr[i - 'a']--;
		}
		for (int i : arr) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String words[] = { "abba", "baba", "bbaa", "cd", "cd" };
		System.out.println(removeAnagrams(words));
	}
}
