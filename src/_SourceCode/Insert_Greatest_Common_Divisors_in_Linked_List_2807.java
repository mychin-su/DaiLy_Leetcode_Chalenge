package _SourceCode;

public class Insert_Greatest_Common_Divisors_in_Linked_List_2807 {
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

    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void printLinkesList(ListNode head){
        while(head != null){
            System.out.print(head.val);
            System.out.print("-->");
            head = head.next;
        }
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode currentNode = head;
        ListNode nextNode  = currentNode.next;
        while(currentNode.next != null){
            ListNode betweenNode = new ListNode( gcd(currentNode.val, nextNode.val));
            currentNode.next = betweenNode;
            betweenNode.next = nextNode;
            currentNode = nextNode;
            nextNode = currentNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(18);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(10);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode ans = insertGreatestCommonDivisors(n1);
        printLinkesList(ans);
    }
}
