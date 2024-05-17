package _SourceCode;

public class Delete_Leaves_With_a_Given_Value_1325 {
    public static class TreeNode {

      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }

    }

      public static TreeNode removeLeafNodes(TreeNode root, int target) {
          if(root == null){
            return null; // If the current node is null, return null
          }

          //Recursively process the left subtree
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.left == null && root.right == null && root.val == target){
          //If true, return null to remove this node
          return null;
        }
        //If the current node is not a target leaf node, return the current node
        return root;

    }
}
