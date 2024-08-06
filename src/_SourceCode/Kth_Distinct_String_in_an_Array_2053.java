package _SourceCode;

import java.util.HashMap;
import java.util.Hashtable;

public class Kth_Distinct_String_in_an_Array_2053 {
  public static String kthDistinct(String[] arr, int k) {
    HashMap<String, Integer> count = new HashMap<>();
    for(String s : arr){
      count.put(s, count.getOrDefault(s, 0) + 1);
    }

    int ans = 0;
    for(String s : arr){
      if(count.get(s) == 1){
        ans++;
      }
      if(ans == k){
        return s;
      }
    }
    return "";
  }

  public static void main(String[] args) {
    String arr[] = {"a","b","a"};
    int k = 3;
    System.out.println(kthDistinct(arr, k));
  }
}
