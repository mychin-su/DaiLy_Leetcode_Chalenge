package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Find_the_Duplicate_Number_287 {
  public static int findDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int num : nums){
        if(set.contains(num)){
          return num;
        }
        set.add(num);
      }
      return -1;
  }

  public static void main(String[] args) {
      int[] nums = {1, 3, 4, 2, 2};
      System.out.println(findDuplicate(nums));

  }
}
