package _SourceCode;

public class Double_a_Number_Represented_as_a_Linked_List_2816 {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
      this.val = val;
    }

    ListNode(int val, ListNode next){
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode doubleIt(ListNode head) {
    int carry = twice(head);
    if(carry > 0){
      head  = new ListNode(carry, head);
    }
    return head;
  }

  public static int twice(ListNode head){
    if(head == null){
      return 0;
    }
    int doubleValue = head.val * 2 + twice(head.next);
    head.val = doubleValue % 10;
    return doubleValue / 10;
  }



  public static void main(String[] args) {
      ListNode n1 = new ListNode(1);
      ListNode n2 = new ListNode(8);
      ListNode n3 = new ListNode(9);
      n1.next = n2;
      n2.next = n3;
    System.out.println(doubleIt(n1));
  }
}
