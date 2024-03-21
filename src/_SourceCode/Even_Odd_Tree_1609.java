package _SourceCode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Even_Odd_Tree_1609 {
      public static class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
     }
    public static boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        boolean even = true; // maintain check for levels
        while (qu.size() > 0) {
            int size = qu.size();
            int prev = (even) ? 0 : Integer.MAX_VALUE; // start prev with 0 to check strictly increasing and Integer_Max_Value to check strictly decreasing
            while (size-- > 0) {
                TreeNode rem = qu.remove();
                if(even) {
                    if (rem.val % 2 == 0 || rem.val <= prev) { // false if value at even level is even or not strictly increasing
                        return false;
                    }
                }
                else {
                        if(rem.val % 2 != 0 || rem.val >= prev){  // false if value at odd level is odd or strictly decreasing
                            return false;
                        }
                    }
                if(rem.left != null){ // add value o level next if it not null
                        qu.add(rem.left);
                 }
                if(rem.right != null){
                        qu.add(rem.right);
                }
                    prev = rem.val; // update previous
                }
            even = !even;
            }
            return true;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);

        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(12);
        root.left.left.right = new TreeNode(8);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.left.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(2);
        System.out.print(isEvenOddTree(root));
    }
}
