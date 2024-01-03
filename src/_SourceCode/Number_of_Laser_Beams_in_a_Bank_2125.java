package _SourceCode;

public class Number_of_Laser_Beams_in_a_Bank_2125 {
	public static int numberOfBeams(String[] bank) {
		int ans = 0, prev = 0, count;
		for (String s : bank) {
			count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1')
					count++;
			}
			if (count > 0) {
				ans += prev * count;
				prev = count;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String[] bank = { "011001", "000000", "010100", "001000" };
		System.out.println(numberOfBeams(bank));
	}
}
