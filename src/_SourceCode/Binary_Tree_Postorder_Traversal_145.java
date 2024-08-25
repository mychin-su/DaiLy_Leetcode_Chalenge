package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal_145 {
  public static class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(){};
      TreeNode(int val){
        this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right){
        this.left = left;
        this.right = right;
        this.val = val;
      }
  }

  static List<Integer> duyetOrder = new ArrayList<>();

  public static List<Integer> postorderTraversal(TreeNode root) {
      if(root == null){
        return duyetOrder;
      }
      postorderTraversal(root.left);
      postorderTraversal(root.right);
      duyetOrder.add(root.val);
      return duyetOrder;
  }

  public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.right = new TreeNode(2);
      root.right.left = new TreeNode(3);
    System.out.println(postorderTraversal(root));
  }



}
