package _SourceCode;

public class Evaluate_Boolean_Binary_Tree_2331 {
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

  public boolean evaluateTree(TreeNode root) {
      return helper(root);
  }

  public static boolean helper(TreeNode root){
    if(root.left == null && root.right == null){ // Base case: If the node is a leaf
      return root.val == 1; // so sanh neu root.val == 0 so sanh voi 1 tra ve false nguoc lai tra ve true
    }

    boolean lTree = helper(root.left);
    boolean rTree = helper(root.right);

    if(root.val == 2){
      return lTree || rTree;
    } else if(root.val == 3){
      return lTree && rTree;

    }
    // Default return false, although we shouldn't reach here with valid input
    return false;
  }
}
