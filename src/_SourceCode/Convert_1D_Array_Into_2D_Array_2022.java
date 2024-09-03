package _SourceCode;

import java.util.Arrays;

public class Convert_1D_Array_Into_2D_Array_2022 {
  public static int[][] construct2DArray(int[] original, int m, int n) {
      int len = original.length;
      if(m * n > len || m * n < len){
        return new int[0][0];
      }

      int[][] ans = new int[m][n];
      int i = 0;
      int j = 0;
    for(int num : original){
        ans[i][j] = num;
        j++;
        if(j == n){
          i++;
          j = 0;
        }
      }
    return ans;
  }

  public static void main(String[] args) {
    int original[] = {1, 2};
    int ans[][]  = construct2DArray(original, 1, 1);
    for(int[] a : ans){
      System.out.println(Arrays.toString(a));
    }
  }
}
