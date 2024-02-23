package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Time_Diference_539 {
	public static int findMinDifference(List<String> timePoints) {
		int c[] = new int[timePoints.size()];
		for (int i = 0; i < timePoints.size(); i++) {
			c[i] = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60
					+ Integer.parseInt(timePoints.get(i).substring(3, 5));
		}
		Arrays.sort(c);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < c.length; i++) {
			min = Math.min(min, c[i] - c[i - 1]);
		}
		min = Math.min(min, 24 * 60 - c[c.length - 1]);
		return min;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("23:59");
		list.add("00:00");
		System.out.println(findMinDifference(list));
	}
}
