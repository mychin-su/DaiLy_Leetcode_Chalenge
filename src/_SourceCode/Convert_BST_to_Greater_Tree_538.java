package _SourceCode;

import java.awt.desktop.PreferencesEvent;

public class Convert_BST_to_Greater_Tree_538 {
  public static class TreeNode {
    int val;
    TreeNode(int val){
      this.val = val;
    }
    TreeNode left;
    TreeNode right;
    TreeNode(int val, TreeNode left, TreeNode right){
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static TreeNode convertBST(TreeNode root) {
      int sum = 0;
      if(root == null){
        return root;
      }
      reverseInorder(root);
      return root;
  }

  private static int sum = 0;
  private static void reverseInorder(TreeNode root){
    if(root==null){
      return;
    }
    reverseInorder(root.right);
    root.val = root.val + sum;
    sum = root.val;
    reverseInorder(root.left);
    return;
  }

  public static void main(String[] args) {
      TreeNode root = new TreeNode(4);
      root.left= new TreeNode(1);
      root.left.left= new TreeNode(0);
      root.left.right = new TreeNode(2);
      root.left.right.right = new TreeNode(3);
      root.right = new TreeNode(6);
      root.right.left = new TreeNode(5);
      root.right.right = new TreeNode(7);
      root.right.right.right = new TreeNode(8);
    convertBST(root);
  }
}
