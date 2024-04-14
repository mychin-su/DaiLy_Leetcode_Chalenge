package _SourceCode;

public class Sum_of_Left_Leaves_404 {
  public static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val){
      this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static int sumOfLeftLeaves(TreeNode root) {
   return dfs(root, false);
  }

  private static int dfs(TreeNode node, boolean isLeft){
    if(node == null){
      return 0;
    }
    if(node.left == null && node.right == null){
      return isLeft ? node.val : 0;
    }

    int leftSum = dfs(node.left, true);  // Traverse left child
    int rightSum =  dfs(node.right, false); // Traverse right child
    return leftSum + rightSum;
  }



  public static void main(String[] args) {
      TreeNode root = new TreeNode(3);
      root.left = new TreeNode(9);
      root.right = new TreeNode(20);
      root.right.left = new TreeNode(15);
      root.right.right = new TreeNode(7);
     System.out.println(sumOfLeftLeaves(root));
  }
}
