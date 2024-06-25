package _SourceCode;

public class Deepest_Leaves_Sum_1302 {
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

  static int maxHeight = Integer.MIN_VALUE;
  static int maxSum = 0;
  public static int deepestLeavesSum(TreeNode root) {
    inorderDFS(root, 0);
    return maxSum;
  }

  public static void inorderDFS(TreeNode root, int height){
    if(root == null){
      return;
    }
    height++;
    inorderDFS(root.right, height);
    if(root.left == null && root.right == null){ // Node is leaf
        if(maxHeight < height){
          maxHeight = height;
          maxSum = root.val;
        }else if(maxHeight == height){
          maxSum = maxSum + root.val;
        }
    }
    inorderDFS(root.left, height);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(7);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(6);
    root.right.right.right = new TreeNode(8);
    System.out.println(deepestLeavesSum(root));
  }
}
