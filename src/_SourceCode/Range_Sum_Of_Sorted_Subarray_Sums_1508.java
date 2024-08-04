package _SourceCode;

import java.util.Arrays;

public class Range_Sum_Of_Sorted_Subarray_Sums_1508 {
  public static int rangeSum(int[] nums, int n, int left, int right) {
    int arr[] = new int[n * (n + 1) / 2];
    int k = 0;
    int sum = 0;
    for(int i = 0; i < n; i ++){
      sum = nums[i];
      arr[k++] = sum;
      for(int j = i + 1; j < n; j ++){
        sum += nums[j];
        arr[k++] = sum;
      }
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int ans = 0;
    int mod = (int)1e9 + 7;
    for(int i = left; i <= right; i ++){
      ans = (ans + arr[i - 1]) % mod;
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4};
    System.out.println(rangeSum(nums, 4, 1, 5));
  }
}
