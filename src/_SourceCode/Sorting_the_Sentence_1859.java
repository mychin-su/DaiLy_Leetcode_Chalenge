package _SourceCode;

public class Sorting_the_Sentence_1859 {
	public static String sortSentence(String s) {
		String[] str = s.split(" ");
		String[] res = new String[str.length];
		StringBuilder sb = new StringBuilder();
		for (String elem : str) {
			int i = (elem.charAt(elem.length() - 1) - '0');
			res[i - 1] = elem.substring(0, elem.length() - 1);
		}
		for (int i = 0; i < res.length - 1; i++) {
			sb.append(res[i]).append(" ");
		}
		sb.append(res[res.length - 1]);
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "is2 sentece4 This1 a3";
		System.out.println(sortSentence(s));
	}
}
