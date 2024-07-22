package _SourceCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort_the_People_2418 {
  public static String[] sortPeople(String[] names, int[] heights) {
    int l = heights.length;
    Map<Integer, String> map = new HashMap<>();
    for(int i = 0; i < l; i ++){
      map.put(heights[i], names[i]);
    }
    Arrays.sort(heights);
    String[] ans = new String[l];
    int j = 0;
    for(int i = l - 1; i >= 0; i--){
      ans[j++] = map.get(heights[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    String[] names = {"Mary", "John", "Emma"};
    int[] heights = {180, 165, 170};
    System.out.println(Arrays.toString(sortPeople(names, heights)));
  }
}
