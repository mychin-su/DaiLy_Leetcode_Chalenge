package _SourceCode;

import java.util.HashSet;
import java.util.TreeSet;

public class Longest_Continous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_Limit_1438 {
  public static int longestSubarray(int[] nums, int limit) {
    int left = 0;
    TreeSet<Integer> set = new TreeSet<>((a, b) -> nums[a] == nums[b] ? a - b : nums[a] - nums[b]);
    set.add(0);
    int res = 1;
    for(int right = 1; right < nums.length; right++){
      set.add(right);
      while(nums[set.last()] - nums[set.first()] > limit){
        set.remove(left++);
      }
      res = Math.max(res, right - left + 1);
    }
    return res;
  }

  public static void main(String[] args) {
    int nums[] = {8, 2, 4, 7}; // 2 -> 4 -> 7 -> 8
    int limit = 4;
    System.out.println(longestSubarray(nums, limit));
  }
}
