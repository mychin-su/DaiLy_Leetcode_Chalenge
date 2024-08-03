package _SourceCode;

import java.util.Arrays;

public class Minimum_Swaps_to_Group_All_1s_Together_II_2134 {
  public static int minSwaps(int[] nums) {
      int k = Arrays.stream(nums).sum(); // total nums = 3
      int n = nums.length; // n = 7
      int cnt = 0;
      for(int i = 0; i < k; i ++){
        cnt += nums[i];
      }
      // cnt = 1
      // tinh tong k phan tu dau tien trong mang
      int mx = cnt; // mx = 1
      for(int i = k; i < n + k; i ++){
        cnt += nums[i % n] - nums[(i - k + n) % n];
        mx = Math.max(mx, cnt);
      }
      return k - mx;
  }


  public static void main(String[] args) {
    int nums[] = {0, 1, 0, 1, 1, 0, 0};
    System.out.println(minSwaps(nums));
  }
}
