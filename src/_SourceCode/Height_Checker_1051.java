package _SourceCode;

import java.util.Arrays;

public class Height_Checker_1051 {
  public static int heightChecker(int[] heights) {
      int n = heights.length;
      int[] newArray = new int[n];
      for(int i = 0; i < n; i ++){
        newArray[i] = heights[i];
      }

      Arrays.sort(newArray);
      int count = 0;
      for(int i = 0 ; i < n ; i ++){
        if(heights[i] != newArray[i]){
          count++;
        }
      }
      return count;
  }


  public static void main(String[] args) {
    int heights[] = {1,2,3,4,5};
    System.out.println(heightChecker(heights));
  }
}
