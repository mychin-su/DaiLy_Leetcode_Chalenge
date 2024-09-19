package _SourceCode;

import java.util.Arrays;

public class Largest_Number_179 {
  public static String largestNumber(int[] nums) {
      String arr[] = new String[nums.length];
      for(int i = 0; i < nums.length; i ++){
        arr[i] = String.valueOf(nums[i]);
      }

      Arrays.sort(arr, (a, b) -> (a + b).compareTo(b + a));
      if(arr[arr.length - 1].equals("0")){
          return "0";
      }

      StringBuilder sb = new StringBuilder();
      for(int i = arr.length - 1; i >= 0 ; i --){
        sb.append(arr[i]);
      }
      return sb.toString();
  }

  public static void main(String[] args) {
    int num[] = {3, 30, 34, 5, 9};
    System.out.println(largestNumber(num));
  }
}
