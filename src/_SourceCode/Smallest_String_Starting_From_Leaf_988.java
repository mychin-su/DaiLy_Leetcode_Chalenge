package _SourceCode;

public class Smallest_String_Starting_From_Leaf_988 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

 private static String smallestString = null;
  public static String smallestFromLeaf(TreeNode root) {
      dfs(root, new StringBuilder());
      return smallestString;
  }

  private static void dfs(TreeNode node, StringBuilder currentString){
      if(node == null){
        return;
      }
      currentString.insert(0, (char)('a' + node.val));
      if(node.left == null && node.right == null){
        updateSmallestString(currentString.toString());
      } else {
        dfs(node.left, currentString);
        dfs(node.right, currentString);
      }
      currentString.deleteCharAt(0); // loai bo node la de cap nhap chuoi hien tai de duyet cay con ben phai
  }

  private static void updateSmallestString(String currentString){
    if(smallestString == null || currentString.compareTo(smallestString) < 0){
      smallestString = currentString;
      System.out.println(smallestString);
    }
  }

  public static void main(String[] args) {
      TreeNode root = new TreeNode(25);
      root.left = new TreeNode(1);
      root.left.left = new TreeNode(1);
      root.right = new TreeNode(3);
      root.right.left = new TreeNode(0);
      root.right.right = new TreeNode(2);
      System.out.println(smallestFromLeaf(root));
  }
}
