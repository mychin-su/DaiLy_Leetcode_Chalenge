package _SourceCode;

import java.util.HashMap;

public class Decode_the_Message_2325 {
	public static String decodeMessage(String key, String message) {
		StringBuilder ans = new StringBuilder(); // Using String Builder
		key = key.replaceAll(" ", ""); // Remove the spaces
		HashMap<Character, Character> letters = new HashMap<Character, Character>();
		char original = 'a';
		// Mapping the ket into a hashmap
		for (int i = 0; i < key.length(); i++) {
			if (!letters.containsKey(key.charAt(i))) {
				letters.put(key.charAt(i), original++);
			}
		}
		// After the first pass all the letters of the key will be mapped with the
		// respective original letters.
		for (int i = 0; i < message.length(); i++) {
			if (letters.containsKey(message.charAt(i))) {
				// Now replaceing the letters of the message with the appropriate letter
				// according to the key
				ans.append(letters.get(message.charAt(i)));
			} else {
				ans.append(message.charAt(i));
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy";
		String message = "vkbs bs t suepuv";
		System.out.println(decodeMessage(key, message));
	}
}
