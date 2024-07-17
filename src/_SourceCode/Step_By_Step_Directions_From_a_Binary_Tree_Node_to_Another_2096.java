package _SourceCode;

public class Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another_2096 {
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
    }
  }

  private static boolean find(TreeNode n, int val, StringBuilder sb){
    if(n.val == val){
      return true;
    }
    if(n.left != null && find(n.left, val, sb)){
      sb.append("L");
    } else if(n.right != null && find(n.right, val, sb)){
      sb.append("R");
    }
    return sb.length() > 0;
  }
  public static String getDirections(TreeNode root, int startValue, int destValue) {
    StringBuilder s = new StringBuilder(), d = new StringBuilder();
    find(root, startValue, s);
    find(root, destValue, d);
    int i = 0, max_i = Math.min(d.length(), s.length());
    while(i < max_i && s.charAt(s.length() - i -1) == d.charAt(d.length() - i - 1)){ // loai bo diem chung neu cung duong di
      ++i;
    }
    return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(4);
    System.out.println(getDirections(root, 4, 3));
  }
}
