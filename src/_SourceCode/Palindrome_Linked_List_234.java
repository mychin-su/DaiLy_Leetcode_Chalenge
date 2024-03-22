package _SourceCode;

import java.util.Stack;

public class Palindrome_Linked_List_234 {

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

  public static ListNode reverseLinkedList(ListNode head){
    ListNode currNode = head;
    while(currNode != null && currNode.next != null){
      ListNode nextNode = currNode.next;
      currNode.next = nextNode.next;
      nextNode.next = head;
      head = nextNode;
    }
    return head;
  }
  public static boolean isPalindrome(ListNode head){
      if(head == null || head.next == null){
        return true;
      }

      ListNode slow = head;
      ListNode fast = head;

      //Tim phan tu o giua list
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode left = head;
    ListNode right = reverseLinkedList(slow);
    while(right != null){
      if(right.val != left.val){
        return false;
      }
      right = right.next;
      left = left.next;
    }
    return true;
  }

  public static void main(String[] args) {
      ListNode n1 = new ListNode(1);
      ListNode n2 = new ListNode(2);
      ListNode n3 = new ListNode(1);
//      ListNode n4 = new ListNode(1);
      n1.next = n2;
      n2.next = n3;
//      n3.next = n4;
    System.out.println(isPalindrome(n1));
  }
}
