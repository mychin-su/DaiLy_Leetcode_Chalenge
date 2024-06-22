package _SourceCode;

import java.util.Arrays;

public class Count_Number_of_Nice_Subarrays_1248 {
  public static int numberOfSubarrays(int[] nums, int k) {
    int count = 0;
    int oddCount = 0;
    int[] prefixCounts = new int[nums.length + 1];
    prefixCounts[0] = 1; // Initialize the prefix count for zero odd numbers.
    for (int num : nums) {
      if (num % 2 != 0) {
        oddCount++;
      }
      if (oddCount >= k) {
        count += prefixCounts[oddCount - k]; // de lay so luong mang co k phan tu le
      }
      prefixCounts[oddCount]++;
    }
    System.out.println(Arrays.toString(prefixCounts));

    return count;
  }

  public static void main(String[] args) {
    int nums[] = {1,1,2,1,1};
    int k = 3;
    System.out.println(numberOfSubarrays(nums, k));
  }
}
