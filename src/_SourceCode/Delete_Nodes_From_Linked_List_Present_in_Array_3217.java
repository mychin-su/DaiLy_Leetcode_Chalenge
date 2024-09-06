package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Delete_Nodes_From_Linked_List_Present_in_Array_3217 {
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

  public static ListNode modifiedList(int[] nums, ListNode head) {
    Set<Integer> set = new HashSet<>();
    for(int num : nums){
      set.add(num);
    }
    ListNode res = new ListNode();
    ListNode resRur = res;
    ListNode current = head;
    while(current != null){
      if(!set.contains(current.val)){
          resRur.next = new ListNode(current.val);
          resRur = resRur.next;
      }
      current = current.next;
    }
    return res.next;
  }

  public static void main(String[] args) {
    int nums[] = {1, 2, 3};

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(3);
    ListNode n5 = new ListNode(3);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    System.out.println(modifiedList(nums, n1));
  }
}
