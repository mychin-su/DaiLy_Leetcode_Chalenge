package _SourceCode;

public class Subarray_Product_Less_Than_K_713 {
  public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;
        if( k <= 1){
          return 0;
        }
        while(right < n){
          product *= nums[right];
          while(product >= k) {
            product /= nums[left++];
          }
          count += 1 + (right - left);
          right++;
        }
        return count;
  }

  public static void main(String[] args) {
    int nums[] = {10, 5, 2, 6};
    int k = 100;
    System.out.println(numSubarrayProductLessThanK(nums, k));
  }
}
