package _SourceCode;

public class Add_One_Row_to_Tree_623 {
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

  public static TreeNode add(TreeNode root, int val, int depth,int curr){
      if(root== null){
        return null;
      }
      if(curr == depth - 1){
        TreeNode lTemp = root.left;
        TreeNode rTemp = root.right;

        root.left = new TreeNode(val);
        root.right = new TreeNode(val);
        root.left.left = lTemp;
        root.right.right = rTemp;
        return root;
      }

      root.left = add(root.left, val, depth, curr + 1);
      root.right = add(root.right, val, depth, curr + 1);
      return root;
  }

  public static TreeNode addOneRow(TreeNode root, int val, int depth) {
      if(depth == 1){
        TreeNode newRoot = new TreeNode(val);
        newRoot.left = root;
        return newRoot;
      }
      return add(root, val, depth, 1);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(9);
    root.left.right = new TreeNode(1);
    root.left.right.right = new TreeNode(7);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(10);
    System.out.println(addOneRow(root, 11, 4));
  }
}
