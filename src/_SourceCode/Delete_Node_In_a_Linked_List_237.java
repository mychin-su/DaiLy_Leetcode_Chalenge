package _SourceCode;

public class Delete_Node_In_a_Linked_List_237 {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
      val = x;
    }
  }

  public static void printLinkedList(ListNode root){
      ListNode curr = root;
      while(curr != null){
        System.out.print(curr.val);
        if(curr.next != null){
          System.out.print("-->");
        }
        curr = curr.next;
      }
  }


  public static void deleteNode(ListNode node) {
      ListNode current = node.next;
      node.val = current.val;
      node.next = current.next;
  }


  public static void main(String[] args) {
    ListNode n1 = new ListNode(4);
    ListNode n2 = new ListNode(5);
    ListNode n3 = new ListNode(1);
    ListNode n4 = new  ListNode(9);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    printLinkedList(n1);
  }
}
