package _SourceCode;

public class Distribute_Coin_in_Binary_Tree_979 {
  public static class TreeNode {
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

  public static int ans;
  public static int countSteps(TreeNode root){
    if(root == null){
      return 0;
    }
    int leftCoins = countSteps(root.left);
    int rightCoins = countSteps(root.right);
    ans += Math.abs(leftCoins) + Math.abs(rightCoins);
    return (root.val - 1) + leftCoins + rightCoins;
  }

  public static int distributeCoins(TreeNode root) {
    ans = 0;
    countSteps(root);
    return ans;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    System.out.println(distributeCoins(root));
  }
}
