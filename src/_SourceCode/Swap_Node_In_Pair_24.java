package _SourceCode;


public class Swap_Node_In_Pair_24 {
	public static class ListNode {
		ListNode next;
		int value;

		ListNode(int value) {
			this.value = value;
		}
	}

	public static void printLinkedList(ListNode head) {
		ListNode tmp = head;
		while (tmp != null) {
			System.out.printf("%d ", tmp.value);
			tmp = tmp.next;
		}
		System.out.println();
	}

	public static ListNode swapPairs(ListNode head) {
		// THCS
		if (head == null)
			return null;
		if (head.next == null)
			return head;

		// THTQ
		ListNode nextNode = head.next;
		// Swap head & nextNode
		head.next = nextNode.next;
		nextNode.next = head;

		// Xu ly bai toan con
		ListNode newHead = swapPairs(head.next);
		// Noi bai toan hien tai, vao bai toan con
		head.next = newHead;

		return nextNode;

	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		printLinkedList(n1);
		n1 = swapPairs(n1);
		printLinkedList(n1);

	}
}
