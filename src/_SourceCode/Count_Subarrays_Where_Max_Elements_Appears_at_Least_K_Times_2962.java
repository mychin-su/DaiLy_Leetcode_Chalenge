package _SourceCode;
public class Count_Subarrays_Where_Max_Elements_Appears_at_Least_K_Times_2962 {
  public static long countSubarrays(int[] nums, int k) {
      int max = Integer.MIN_VALUE;
      for(int num : nums){
        max = Math.max(num, max);
      }
      int i = 0, j = 0, count = 0, n = nums.length;
      long ans = 0;
      while(j < n){
        if(nums[j] == max){
          count++;
       }
        if(count >= k){
          while(count >= k){
            ans += n - j;
            if(nums[i] == max){
              count--;
            }
            i++;
          }
        }
        j++;
      }
      return ans;
  }

  public static void main(String[] args) {
    int nums[] = {1, 2, 7, 2, 7, 7, 2, 6, 3};
    int k = 3;
    System.out.println(countSubarrays(nums, k));
  }
}
