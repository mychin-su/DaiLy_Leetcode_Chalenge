package _SourceCode;

import java.util.Arrays;

public class Largest_Positive_Integer_That_Exits_With_Its_Negative_2441 {
  public static int findMaxK(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    int j = nums.length - 1;
    if(nums[i] > 0) {
      return -1;
    }
    while(i <= j && i < nums.length && j >= 0){
      if(-nums[i] == nums[j]){
        return nums[j];
      } else if(nums[i] < 0 && Math.abs(nums[i]) < nums[j]){
        j--;
      } else {
        i++;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = {-1, 2, -3 , 3}; // -7 -1  1  6  7  10
    System.out.println(findMaxK(nums));
  }
}
