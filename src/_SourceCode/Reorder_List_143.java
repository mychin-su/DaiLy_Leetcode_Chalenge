package _SourceCode;

public class Reorder_List_143 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(){}

      ListNode(int val){
        this.val = val;
      }

      ListNode(int val, ListNode next){
          this.val = val;
          this.next = next;
      }
    }


    public static ListNode reverseLinkesList(ListNode head){
        ListNode currNode = head;
        while(currNode != null && currNode.next != null){
          ListNode nextNode = currNode.next;
          currNode.next = nextNode.next;
          nextNode.next = head;
          head = nextNode;
        }
        return head;
    }

  public static void reorderList(ListNode head) {

      if(head == null || head.next == null) {
        return;
      }

      ListNode slow = head;
      ListNode fast = head;

      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
    System.out.println("Slow: " + slow.val);

      ListNode midNode = slow.next;
      System.out.println(midNode.val);
      slow.next = null;
      midNode = reverseLinkesList(midNode);
      System.out.println(midNode.val);

      while(midNode != null){
          ListNode tmp1 = head.next;
          ListNode tmp2 = midNode.next;
        System.out.println(tmp1.val);

          head.next = midNode;
          midNode.next = tmp1;

          head = tmp1;
          midNode = tmp2;
        System.out.println(midNode.val);
      }

  }
  public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
        reorderList(n1);
  }
}
