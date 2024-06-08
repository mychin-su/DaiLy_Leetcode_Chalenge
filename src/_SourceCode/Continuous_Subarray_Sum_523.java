package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Continuous_Subarray_Sum_523 {
  public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> remainMap = new HashMap<>();
        int cumulativeSum = 0;

        /*
          we need a subarray between i and j such that
          (sum_j - sum_i) % k = 0
          then
          sum_j % k - sum_i % k = 0
          there for
          sum_j % k == sum_i % k
         */

        //Step 1: Initialize Remainder Map
        remainMap.put(0, -1);

        //Step 2: Iterate Through the List
        for(int i = 0; i < n; i ++){
          //Step 3: Calculate Cumulative Sum
          cumulativeSum += nums[i];

          //Step 4: Calculate Remainder
          int remainder = k == 0 ? cumulativeSum : cumulativeSum % k;
          System.out.println(remainder);

          //Step 5: Update Remainder Map
          if(remainMap.containsKey(remainder)){
            //Check if segment length is at least two
            if(i - remainMap.get(remainder) > 1){
              return true;
            }
          }else {
            remainMap.put(remainder, i);
          }
        }
        return true;
  }

  public static void main(String[] args) {
    int nums[] = {23, 2, 4, 5, 7};
    int k = 6;
    System.out.println(checkSubarraySum(nums, k));
  }
}
