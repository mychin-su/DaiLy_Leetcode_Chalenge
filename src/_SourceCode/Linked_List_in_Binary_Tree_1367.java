package _SourceCode;

public class Linked_List_in_Binary_Tree_1367 {
  public static class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
      this.val = val;
    }

    ListNode(int val,ListNode next){
      this.val = val;
      this.next = next;
    }
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
      this.val = val;
    }
    TreeNode( int val,TreeNode left, TreeNode right){
      this.val = val;
      this.left= left;
      this.right = right;
    }
  }

  public static boolean isSubPath(ListNode head, TreeNode root) {
      return dfs(head, head, root);
  }

  public static boolean dfs(ListNode head, ListNode cur, TreeNode root) {
    if(cur == null){
      return true;
    }

    //If we reach the end of a path in the tree without fully matching the list, return false.
    if(root == null){
      return false;
    }

    //Math the current tree node with the current linked list node
    if(cur.val  == root.val){
      cur  = cur.next;
      //If no match, but the tree node matches the head of the linked list, start a new match
    } else if(head.val == root.val){
      head = head.next;
      //Otherwise, reset 'cur' to 'head' to attempt matching the linked list from scratch.
    } else{
      cur  = head;
    }

    // Continue DFS down both left and right children
    return dfs(head, cur, root.left) || dfs(head, cur, root.right);
  }

  public static void main(String[] args) {
     ListNode n1 = new ListNode(4);
     ListNode n2 = new ListNode(2);
     ListNode n3 = new ListNode(8);
     n1.next = n2;
     n2.next = n3;

      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(4);
      root.left.right = new TreeNode(2);
      root.left.right.left = new TreeNode(1);
      root.right = new TreeNode(4);
      root.right.left = new TreeNode(2);
      root.right.left.right = new TreeNode(8);
      root.right.left.left = new TreeNode(6);
      root.right.left.right.left = new TreeNode(1);
       root.right.left.right.right = new TreeNode(3);

    System.out.println(isSubPath(n1, root));
  }
}
