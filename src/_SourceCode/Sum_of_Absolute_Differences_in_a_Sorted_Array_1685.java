package _SourceCode;

import java.util.Arrays;

public class Sum_of_Absolute_Differences_in_a_Sorted_Array_1685 {
  public static int[] getSumAbsoluteDifferences(int[] nums) {
     int ans[] = new int[nums.length];
     int n = nums.length;
     int A = 0;
     int B = Arrays.stream(nums).sum();
     int i = 0;
     for(int x : nums){
       ans[i] = (2 * i - n) * x + B - A;
       A += x;
       B -= x;
       i++;
     }
    return ans;
  }
  public static void main(String[] args) {
    int nums[] = {4,7};
    System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums)));
  }
}
