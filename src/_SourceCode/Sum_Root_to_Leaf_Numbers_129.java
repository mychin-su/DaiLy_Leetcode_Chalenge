package _SourceCode;

public class Sum_Root_to_Leaf_Numbers_129 {

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
  public static int sumNumbers(TreeNode root) {
      return dfs(root, 0);
  }

  public static int dfs(TreeNode root, int pathSum){
    if(root == null){
      return 0;
    }
    pathSum = pathSum * 10 + root.val;
    if(root.left == null && root.right == null){
      return pathSum;
    }
    return dfs(root.left, pathSum) + dfs(root.right, pathSum);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    System.out.println(sumNumbers(root));
  }
}
