package _SourceCode;

public class Largest_Local_Values_in_a_Matrix_2373 {
  public static int[][] largestLocal(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    int matrix[][] = new int[n - 2][m - 2];
    for(int i = 0; i < n - 2; ++i) {
      for(int j = 0; j < m - 2; ++j) {
          int temp = Integer.MIN_VALUE;

        for(int k = i; k <= i + 2; ++k) {
          for(int l = j; l <= j + 2; ++l) {
            temp = Math.max(temp, grid[k][l]);
          }
        }
        matrix[i][j] = temp;
      }
    }
    return matrix;
  }

  public static void main(String[] args) {
      int grid[][] = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8 ,2 ,6, 4}, {6, 2, 2, 2}};
    System.out.println(largestLocal(grid));
  }
}
