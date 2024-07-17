package _SourceCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Create_Binary_Tree_From_Descriptions_2196 {
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
  public static TreeNode createBinaryTree(int[][] descriptions) {
      Map<Integer, TreeNode> mp = new HashMap<>();
      Set<Integer> hashParent = new HashSet<>();

      for(int i = 0; i < descriptions.length; i ++){
        if(!mp.containsKey(descriptions[i][0])){
          mp.put(descriptions[i][0], new TreeNode(descriptions[i][0]));
        }
        if(!mp.containsKey(descriptions[i][1])) {
          mp.put(descriptions[i][1], new TreeNode(descriptions[i][1]));
        }
        hashParent.add(descriptions[i][1]);
      }

      TreeNode root = null;
      for(int i = 0; i < descriptions.length; i++){
        if(descriptions[i][2] == 1){ // left
          mp.get(descriptions[i][0]).left = mp.get(descriptions[i][1]);
        } else {
          mp.get(descriptions[i][0]).right = mp.get(descriptions[i][1]);
        }
        if(!hashParent.contains(descriptions[i][0])){
          root = mp.get(descriptions[i][0]);
        }
      }
      return root;
  }

  public static void main(String[] args) {
      int description[][] = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
    System.out.println(createBinaryTree(description));
  }
}
