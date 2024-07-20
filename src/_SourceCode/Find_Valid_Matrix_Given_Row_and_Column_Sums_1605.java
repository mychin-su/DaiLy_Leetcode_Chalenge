package _SourceCode;

public class Find_Valid_Matrix_Given_Row_and_Column_Sums_1605 {
  public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
      int p = rowSum.length, q = colSum.length;
      int i = 0, j = 0;
      int[][] ans = new int[p][q];
      while(i < p && j < q){
        ans[i][j] = Math.min(rowSum[i], colSum[j]);
        rowSum[i] -= ans[i][j];
        colSum[j] -= ans[i][j];
        if(rowSum[i] == 0) { // neu rowSum[i] = 0 nghia la da san lap day hang do, chuyen sang hang tiep theo
          i++;
        }
        if(colSum[j] == 0){ // neu colSum[j] = 0 nghia la da san lap day cot do, chuyen sang cot tiep theo
          j++;
        }
      }
      return ans;
  }

  public static void main(String[] args) {
    int[] rowSum = {3, 8};
    int colSum[] = {4, 7};
    System.out.println(restoreMatrix(rowSum, colSum));
  }
}
