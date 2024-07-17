package _SourceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Delete_Nodes_And_Return_Forest_1110 {
  public static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
      this.val =val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  static HashSet<Integer> set = new HashSet<>();
  static List<TreeNode> list = new ArrayList<>();

  public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
      for(int val : to_delete){
        set.add(val);
      }
     helper(root);
      if(!set.contains(root.val)){
        list.add(root);
      }
      return list;
  }

  public static TreeNode helper(TreeNode node){
    if(node == null){
      return null;
    }
    node.left = helper(node.left);
    node.right = helper(node.right);

    if(set.contains(node.val)){
      if(node.left != null){
        list.add(node.left);
      }
      if(node.right != null){
        list.add(node.right);
      }
      return null;
    }
      return node;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    int[] to_delete = {3, 5};
    System.out.println(delNodes(root, to_delete));
  }
}
