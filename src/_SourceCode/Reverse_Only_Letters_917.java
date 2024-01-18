package _SourceCode;

public class Reverse_Only_Letters_917 {
	public static String reverseOnlyLetters(String s) {
		char temp[] = s.toCharArray();
		int low = 0, high = s.length() - 1;
		while (low < high) {
			if (Character.isAlphabetic(temp[low]) && Character.isAlphabetic(temp[high])) { // kiểm tra xem 2 kí tự đầu
																							// và cuối có phải là chữ
																							// cái ko, nếu đúng thì đổi
																							// chỗ 2 kí tự đó
				char tmp = temp[low];
				temp[low] = temp[high];
				temp[high] = tmp;
				low++;
				high--;
			} else if (!Character.isAlphabetic(temp[low])) { // nếu kí tự đầu chuỗi ko phải là kí tự thì tăng lơ
				low++;
			} else if (!Character.isAlphabetic(temp[high])) {
				high--;
			}
		}
		return String.valueOf(temp);
	}

	public static void main(String[] args) {
		String s = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(s));
	}
}
