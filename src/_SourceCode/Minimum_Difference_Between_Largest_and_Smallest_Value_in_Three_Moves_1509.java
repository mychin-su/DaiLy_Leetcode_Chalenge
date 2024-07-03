package _SourceCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves_1509 {
  public static int minDifference(int[] nums) {
     if(nums.length <= 4){
       return 0;
     }
     int n = nums.length;
     Arrays.sort(nums);
     return Math.min(Math.min(nums[n - 1]- nums[3], nums[n - 2] - nums[2]), Math.min(nums[n - 3] - nums[1], nums[n - 4] - nums[0]));
  }

  public static void main(String[] args) {
    int nums[] = {1, 5, 0, 10, 14};
    System.out.println(minDifference(nums));
  }
}
