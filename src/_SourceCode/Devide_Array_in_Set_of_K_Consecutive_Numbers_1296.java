package _SourceCode;


import java.util.Map;
import java.util.TreeMap;

public class Devide_Array_in_Set_of_K_Consecutive_Numbers_1296 {
  public static boolean isPossibleDivide(int[] nums, int k) {
      int n = nums.length;
      if(n % k != 0){
        return false;
      }
    Map<Integer, Integer> map = new TreeMap<>();
      for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
      }

      for(int num : map.keySet()){
        int value = map.get(num);
        if(value > 0){
          for(int i = 0;  i < k; i ++){
            if(map.getOrDefault(num + i, 0) < value){
              return false;
            }
            map.put(num + i, map.get(num + i) - value);
          }
        }
      }
      return true;
  }

  public static void main(String[] args) {
    int nums[] = {1,2,3,3,4,4,5,6};
    int k = 4;
    System.out.println(isPossibleDivide(nums, k));
  }
}
