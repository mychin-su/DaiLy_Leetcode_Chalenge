package _SourceCode;

public class Longest_Palindrome_409 {
	public static int longestPalindrome(String s) {
		/*
		 * Map int oddCount = 0; Map<Character, Integer> map = new HashMap<Character,
		 * Integer>(); for (char ch : s.toCharArray()) { map.put(ch,
		 * map.getOrDefault(ch, 0) + 1); if (map.get(ch) % 2 == 1) { oddCount++; } else
		 * { oddCount--; } } if (oddCount > 1) { return s.length() - oddCount + 1; }
		 * 
		 * return s.length();
		 */

		int freq[] = new int[128];

		for (char c : s.toCharArray()) {
			freq[c]++;
		}

		int maxLength = 0;
		for (int x : freq) { 
			if (x % 2 == 0) {
				maxLength += x; // cong cac ky tu co so luong la chan 
			} else {
				maxLength += (x - 1); // cong cac ky tu co so luong la le nhung tru 1 de tro thanh chan
			}
		}
		if (maxLength < s.length()) { // dc cong them 1 ki tu de no nam chinh giua 
			maxLength++;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "abccccdd";
		System.out.println(longestPalindrome(s));
	}
}
