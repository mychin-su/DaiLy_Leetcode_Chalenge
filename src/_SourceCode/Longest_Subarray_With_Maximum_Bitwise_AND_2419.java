package _SourceCode;

public class Longest_Subarray_With_Maximum_Bitwise_AND_2419 {
  public static int longestSubarray(int[] nums) {
        int len = 1;

        //Step 1: Find the maximum element in the array
        int mx = Integer.MIN_VALUE;
        for(int num : nums){
            mx = Math.max(mx, num);
        }
    // Step 2: Find the longest subarray consisting of the maximum element
        int tmp_len = 0;
        for(int num : nums){
          if(num == mx){
            tmp_len++;
          } else {
            len = Math.max(len, tmp_len);
            tmp_len = 0;
          }
        }

    // Update len in case the longest subarray is at the end
        len = Math.max(len, tmp_len);
        return len;
  }

  public static void main(String[] args) {
    int nums[] = {1,2,5,3,4, 4, 4,5};
    System.out.println(longestSubarray(nums));
  }
}
