package _SourceCode;

public class Find_the_Winner_of_the_Circular_Game_1823 {
  public static class Node{
    int num;
    Node prev;
    Node next;
    public Node(int num){
      this.num = num;
    }
    public void kill(){ // xoa node dang dung
      prev.next = next;
      next.prev = prev;
    }

  }
  public static int findTheWinner(int n, int k) {
      Node firstNode = new Node(1);
      Node prevNode = firstNode;
      for(int i = 2; i <= n; i++){
        Node currNode = new Node(i);
        currNode.prev = prevNode;
        prevNode.next = currNode;
        prevNode = currNode;
      }
      firstNode.prev = prevNode; // tao vong tron cho linkedList
      prevNode.next = firstNode;

      Node currentNode = prevNode;
      for(int i = 0; i < n; i ++){
        for(int j = 0; j < k; j ++){
          currentNode = currentNode.next;
        }
        currentNode.kill();
      }
      return currentNode.next.num;
  }

  public static void main(String[] args) {
    int n = 5;
    int k = 2;
    System.out.println(findTheWinner(n, k));
  }
}
