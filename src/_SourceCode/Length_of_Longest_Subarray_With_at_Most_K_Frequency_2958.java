package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Length_of_Longest_Subarray_With_at_Most_K_Frequency_2958 {
  public static int maxSubarrayLength(int[] nums, int k) {
    int l = 0, ans = 0;
    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    for(int r = 0; r < nums.length; r ++){
      myMap.put(nums[r], myMap.getOrDefault(nums[r], 0) + 1);
      while(myMap.get(nums[r]) > k){
        myMap.put(nums[l], myMap.get(nums[l]) - 1);
        ++l;
      }
      ans = Math.max(ans, r - l + 1);
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] ={ 1, 2, 3, 3, 3, 4};
    int k = 2;
    System.out.println(maxSubarrayLength(nums, k));
  }
}
