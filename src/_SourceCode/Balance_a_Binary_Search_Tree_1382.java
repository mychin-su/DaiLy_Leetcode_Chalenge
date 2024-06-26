package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Balance_a_Binary_Search_Tree_1382 {
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
      this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  private static void inorderTraversal(TreeNode root, List<Integer> lst){
    if(root != null){ // Add vao arrayList tu nho den lon
      inorderTraversal(root.left, lst);
      lst.add(root.val);
      inorderTraversal(root.right, lst);
    }
  }

  private static TreeNode buildTree(List<Integer> lst, int low, int high){
    if(low > high) return null;
    int mid = (low + high) / 2;
    TreeNode root = new TreeNode(lst.get(mid));
    root.left = buildTree(lst, low, mid - 1);
    root.right = buildTree(lst, mid + 1, high);
    return root;
  }

  public static TreeNode balanceBST(TreeNode root) {
    List<Integer> lst = new ArrayList<>();
    inorderTraversal(root, lst);
    return buildTree(lst, 0, lst.size() - 1);
  }

  public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.right = new TreeNode(2);
      root.right.right = new TreeNode(3);
      root.right.right.right = new TreeNode(4);
    balanceBST(root );
  }
}
