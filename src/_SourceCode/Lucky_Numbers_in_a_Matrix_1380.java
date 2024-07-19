package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix_1380 {
  public static List<Integer> luckyNumbers(int[][] matrix){
      List<Integer>list = new ArrayList<>();
      int n = matrix.length;
      int m = matrix[0].length;
      for(int i = 0 ; i < n ; i ++){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int j = 0; j < m; j ++){
          if(min > matrix[i][j]){
            min = matrix[i][j];
            index = j;
          }
        }
        boolean flag = true;
        for(int k = 0; k <n; k ++){
          if(min< matrix[k][index]){
            flag = false;
            break;
          }
        }
        if(flag == true){
          list.add(min);
        }
      }
      return list;
  }

  public static void main(String[] args) {
    int matrix[][]  = {{3, 7, 8}, {9, 11, 13}, {15,16, 17}};
    System.out.println(luckyNumbers(matrix));
  }

}
