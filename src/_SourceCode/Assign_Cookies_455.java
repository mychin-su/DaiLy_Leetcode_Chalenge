package _SourceCode;

import java.util.Arrays;

public class Assign_Cookies_455 {
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0, j = 0;
		int n = g.length, m = s.length;
		int count = 0;
		while (i < n && j < m) {
			if (g[i] <= s[j]) {
				count++;
				i++;
				j++;
			} else
				j++;
		}
		return i;
	}

	public static void main(String[] args) {
		int g[] = { 1, 2, 3 };
		int s[] = { 1, 1 };
		System.out.println(findContentChildren(g, s));
	}
}
