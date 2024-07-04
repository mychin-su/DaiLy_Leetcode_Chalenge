package _SourceCode;

public class Merge_Nodes_in_Between_Zeros {
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

  public static ListNode mergeNodes(ListNode head) {
    ListNode modify = head.next;
    ListNode nextSum =modify ;
    while(nextSum != null) {
      int sum = 0;
      while (nextSum.val != 0) {
        sum += nextSum.val;
        nextSum = nextSum.next;
      }

      modify.val = sum;
      nextSum = nextSum.next;
      modify.next = nextSum;
      modify = modify.next;

    }
      return head;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(0);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(1);
    ListNode n4 = new ListNode(0);
    ListNode n5 = new ListNode(4);
    ListNode n6 = new ListNode(5);
    ListNode n7 = new ListNode(2);
    ListNode n8 = new ListNode(0);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n8;
    System.out.println(mergeNodes(n1));

  }
}
