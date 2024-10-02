package _SourceCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rank_Transformf_of_an_Array_1331 {
  public static int[] arrayRankTransform(int[] arr) {
    int clone[] = arr.clone();
    Arrays.sort(arr);
    Map<Integer, Integer> map = new HashMap<>();
    int rank = 1;
    map.put(arr[0], rank);
    for(int i = 1; i < arr.length; i ++){
      if(arr[i] == arr[i - 1]){
        map.put(arr[i], rank);
      }
      rank++;
      map.put(arr[i], rank);
    }

    int[] ans = new int[clone.length];
    for(int i = 0; i < clone.length; i++) {
      ans[i] = map.get(clone[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = {40, 10, 20, 30};
    System.out.println(Arrays.toString(arrayRankTransform(arr)));
  }
}
