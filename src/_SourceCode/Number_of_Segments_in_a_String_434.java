package _SourceCode;

public class Number_of_Segments_in_a_String_434 {
	public static int countSegments(String s) {
		if (s.length() == 0) {
			return 0;
		}
		String[] arr = s.trim().replaceAll("\\s+", " ").split(" ");
		return arr.length;
	}

	public static void main(String[] args) {
		String s = "";
		System.out.println(countSegments(s));
	}
}
