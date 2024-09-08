package _SourceCode;

public class Split_Linked_List_in_Parts_725 {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
      this.val = val;
    }

    ListNode(int val, ListNode next){
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode[] splitListToParts(ListNode head, int k) {
    ListNode[] ans = new ListNode[k];

      //get total size of linked list
    int size = 0;
    ListNode current = head;
    while(current != null){
      size++;
      current = current.next;
    }

    //minimum for the k parts
    int splitSize = size / k;

    //remaining nodes after spitting the k parts evenly.
    //Theses will be distributed to the first (size % k) nodes
    int numRemainingParts = size % k;

    current = head;

    ListNode prev = current;
    for(int i = 0; i < k; i ++){
      //create the i-th part
      ListNode newPart = current;
      //calculate size of -th part
      int currentSize = splitSize;
      if(numRemainingParts > 0){
        numRemainingParts--;
        currentSize++;
      }

      int j =0;
      while(j < currentSize){
        prev = current;
        current = current.next;
        j++;
        System.out.println("prev: " + prev.val);
        System.out.println("current: " +current.val);
      }
      if(prev != null){
        prev.next = null;
      }

      ans[i] = newPart;
    }
    return ans;
  }

  public static void main(String[] args) {
      ListNode n1 = new ListNode(1);
      ListNode n2 = new ListNode(2);
      ListNode n3 = new ListNode(3);
      ListNode n4 = new ListNode(4);
      ListNode n5 = new ListNode(5);
      ListNode n6 = new ListNode(6);
      ListNode n7 = new ListNode(7);
      ListNode n8 = new ListNode(8);
      ListNode n9 = new ListNode(9);
      ListNode n10 = new ListNode(10);

      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      n5.next = n6;
      n6.next = n7;
      n7.next = n8;
      n8.next = n9;
      n9.next = n10;


      int k = 3;
    System.out.println(splitListToParts(n1, k));
  }
}
