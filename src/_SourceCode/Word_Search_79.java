package _SourceCode;

public class Word_Search_79 {
  public static boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;

    boolean[][] visited = new boolean[m][n];
    boolean result = false;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == word.charAt(0)) {
          result =backtract(board, word, visited, i, j , 0);
            if(result){
              return true;
          }
        }
      }
    }
    return false;
  }

  private static boolean backtract(char[][] board, String word, boolean[][] visited, int i, int j, int index){
    if(index == word.length()){
      return true;
    }

    if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]|| board[i][j] != word.charAt(index)){
      return false;
    }
    visited[i][j] = true;

    if(backtract(board, word, visited, i + 1, j , index + 1) || backtract(board, word, visited, i - 1, j , index + 1) || backtract(board, word, visited, i, j + 1, index + 1) || backtract(board, word, visited, i , j - 1 , index + 1)){
      return true;
    }
    visited[i][j] = false;
    return false;
}

  public static void main(String[] args) {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'S', 'F', 'C', 'S'},
        {'A', 'D', 'E', 'E'},
    };
    String word = "ABCCED";
    System.out.println(exist(board, word));
  }
}
