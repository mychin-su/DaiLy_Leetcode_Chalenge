package _SourceCode;

import java.util.Arrays;

public class Minimum_Increment_to_Make_Array_Unique_945 {
  public static int minIncrementForUnique(int[] nums) {
    Arrays.sort(nums);
    int count = 0;
    for(int i = 1; i < nums.length; i++){
      if(nums[i] == nums[i - 1]){
        nums[i] = nums[i - 1] + 1;
        count += 1;
      } else if(nums[i] < nums[i - 1]){
        int tmp = nums[i];
        nums[i] = nums[i - 1] + 1;
        count += nums[i] - tmp;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int nums[] = {3,2,1,2,1,7};
    System.out.println(minIncrementForUnique(nums));
  }
}
