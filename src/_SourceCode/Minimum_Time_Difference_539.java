package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Time_Difference_539 {
  public static int findMinDifference(List<String> timePoints) {
     int N = timePoints.size();
      int[] timeMinutes = new int[N];
      for(int i = 0; i < N; i ++){
        String s = timePoints.get(i);
        timeMinutes[i] = (Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5)));
      }

      Arrays.sort(timeMinutes);
      int min = Integer.MAX_VALUE;
      for(int i = 1; i <N; i ++) {
        min = Math.min(min, timeMinutes[i] - timeMinutes[i - 1]);
      }

      min = Math.min(min, timeMinutes[0] + (24*60 - timeMinutes[N - 1]));
      return min;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("23:59");
    list.add("00:00");
    System.out.println(findMinDifference(list));
  }
}
