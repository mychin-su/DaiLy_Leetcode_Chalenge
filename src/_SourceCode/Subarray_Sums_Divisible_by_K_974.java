package _SourceCode;

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K_974 {
  public static int subarraysDivByK(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    /*
        sum_j % k - sum_i % k = 0
        => sum_j % k = sum_i % k
     */
    int count = 0;
    int prefixSum = 0;
    map.put(0, 1);
    for(int num : nums){
      prefixSum += num;
      int mod = prefixSum % k;

      //Adjust negative remainders to be positive
      if(mod < 0){
        mod += k;
      }

     // If this remainder has been seen before,
      //it means there are subarrays ending here that are divisible by k
      if(map.containsKey(mod)){
        count += map.get(mod);
        map.put(mod, map.get(mod) + 1);
      } else {
        map.put(mod, 1);
      }
    }
return count;
  }

  public static void main(String[] args) {
    int nums[] = {4, 5, 0, -2, -3, 1};
    int k = 5;
    System.out.println();
  }
}
