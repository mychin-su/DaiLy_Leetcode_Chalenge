package _SourceCode;

public class Find_Bottom_Left_Tree_Value_513 {

      public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode() {}TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
        this.left = left;
         this.right = right;
      }
  }
    public int findBottomLeftValue(TreeNode root) {
        int[] result = new int[]{0, 0};
        help(root, 1, result);
        return result[1];
    }

    public void help(TreeNode root, int currD, int[] result){
        if(root == null){
            return;
        }

        if(currD  > result[0]){
            result[0] = currD;
            result[1] = root.val;
        }

        help(root.left, currD + 1, result);
        help(root.right, currD + 1, result);
    }
}
