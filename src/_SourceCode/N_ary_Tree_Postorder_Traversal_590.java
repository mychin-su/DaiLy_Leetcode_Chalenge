package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class N_ary_Tree_Postorder_Traversal_590 {
  static class Node {
    public int val;
    public List<Node> children;

    public Node(){

    }

    public Node(int _val){
      this.val = _val;
    }

    public Node(int _val, List<Node> _children){
      val = _val;
      children = _children;
    }
  }
  public static List<Integer> postorder(Node root) {
      //If the root is null, return an empty list
    if(root == null){
      return new ArrayList<>();
    }
    List<Integer> res = new ArrayList<>();
    //Start DFS from the root
    dfs(root, res);

    //Return the result list containing node values in post-order
    return res;
  }

  public static void dfs(Node root, List<Integer> res){
    //Recursively call dfs for each child of the current node
    for(Node child : root.children){
      dfs(child, res);
    }
    res.add(root.val);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    postorder(root);
  }
}
