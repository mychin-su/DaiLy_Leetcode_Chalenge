package _SourceCode;

import java.util.LinkedList;
import java.util.List;

public class Maximum_Depth_of_N_ary_Tree_559 {
  public static class Node {
    public int val;
    public List<Node> children;

    public Node() {
      children = new LinkedList<>();
    }

    public Node(int _val) {
      val = _val;
      children = new LinkedList<>();
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }

  public static int maxDepth(Node root) {
    if (root == null) {
      return 0;
    }

    int maxDepth = 0;
    for (Node child : root.children) {
      maxDepth = Math.max(maxDepth, maxDepth(child));
    }

    return maxDepth + 1; // +1 to include the current node
  }

  public static void main(String[] args) {
    Node node14 = new Node(14);
    Node node13 = new Node(13);
    Node node12 = new Node(12);
    Node node11 = new Node(11, List.of(node14));
    Node node10 = new Node(10);
    Node node9 = new Node(9);
    Node node8 = new Node(8);
    Node node7 = new Node(7);
    Node node6 = new Node(6, List.of(node12, node13));
    Node node5 = new Node(5, List.of(node9, node10));
    Node node4 = new Node(4, List.of(node8));
    Node node3 = new Node(3, List.of(node6, node7));
    Node node2 = new Node(2, List.of(node11));
    Node node1 = new Node(1, List.of(node2, node3, node4, node5));

    int depth = maxDepth(node1);
    System.out.println("Maximum depth of the N-ary tree is: " + depth);
  }
}
