package _SourceCode;

import java.util.Arrays;
import java.util.List;

public class Maximum_Distance_in_Arrays_624 {
  public static int maxDistance(List<List<Integer>> arrays) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

      for(List list : arrays){
        for(int i = 0; i < list.size(); i ++){
          min = Math.min(min, (int)list.get(i));
          max = Math.max(max, (int)list.get(i));
        }
      }
      return Math.abs(min - max);
  }

  public static void main(String[] args) {
    List<List<Integer>> arrays = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5),
        Arrays.asList(1, 2, 3)
    );

    System.out.println(maxDistance(arrays));
  }
}
