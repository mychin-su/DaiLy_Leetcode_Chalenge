package _SourceCode;

import java.util.Arrays;

public class XR_Queries_of_a_Subarray_1310 {
  public static int[] xorQueries(int[] arr, int[][] queries) {
      int ans[] = new int[arr.length];
      for(int i = 0; i < queries.length; i ++){
        int num = 0;
        for(int j = queries[i][0]; j <= queries[i][1]; j ++){

          num = num ^ arr[j];
        }
        ans[i] = num;
      }
      return ans;
  }

  public static void main(String[] args) {
    int arr[] = {16};
    int[][] queries = {{0, 0}, {0, 0}, {0, 0}};
    System.out.println(Arrays.toString(xorQueries(arr, queries)));
  }
}
