package _SourceCode;

import java.util.Arrays;

public class Spiral_Matrix_IV_2326 {
  public static class ListNode{
    int val;
    ListNode next;
    ListNode(){
    }
    ListNode(int val){
      this.val = val;
    }

    ListNode(int val,ListNode next){
      this.val = val;
      this.next = next;
    }
  }

  public static int[][] spiralMatrix(int rows, int columns, ListNode head) {
    int[][] matrix = new int[rows][];
    for(int i = 0; i < rows; i ++){
      matrix[i] = new int[columns];
      Arrays.fill(matrix[i], -1);
    }


    int topRow = 0, bottomRow = rows - 1, leftColumn = 0, rightColumn = columns - 1;
    while(head != null){

      for(int col = leftColumn; col <= rightColumn && head != null; col++){
        matrix[topRow][col] = head.val;
        head = head.next;
      }
      topRow++;

      for(int row = topRow; row <= bottomRow && head != null; row++){
        matrix[row][rightColumn] = head.val;
        head = head.next;
      }
      rightColumn--;


      for(int col = rightColumn; col >= leftColumn && head != null; col--){
        matrix[bottomRow][col] = head.val;
        head = head.next;
      }

      bottomRow--;

      for(int row = bottomRow; row >= topRow && head != null; row--){
        matrix[row][leftColumn] = head.val;
        head = head.next;
      }
      leftColumn++;

    }
    return matrix;
  }

  public static void main(String[] args) {
      int m = 3;
      int n = 5;
      ListNode n1 = new ListNode(3);
      ListNode n2 = new ListNode(0);
      ListNode n3 = new ListNode(2);
      ListNode n4 = new ListNode(6);
      ListNode n5 = new ListNode(8);
      ListNode n6 = new ListNode(1);
      ListNode n7 = new ListNode(7);
      ListNode n8 = new ListNode(9);
      ListNode n9 = new ListNode(4);
      ListNode n10 = new ListNode(2);
      ListNode n11 = new ListNode(5);
      ListNode n12 = new ListNode(5);
      ListNode n13 = new ListNode(0);

      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      n5.next = n6;
      n6.next = n7;
      n7.next = n8;
      n8.next = n9;
      n9.next = n10;
      n10.next = n11;
      n11.next = n12;
      n12.next = n13;

      int[][] ans = spiralMatrix(m, n, n1);
      for(int i = 0 ; i < m; i ++){
        for(int j = 0 ; j < n; j ++){
          System.out.print(ans[i][j]  + "   ");
        }
        System.out.println();
      }
  }
}
