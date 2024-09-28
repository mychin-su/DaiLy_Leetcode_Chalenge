package _SourceCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Design_Circular_Deque_641 {

  public Design_Circular_Deque_641(){

  }

  private Deque<Integer> deque;
  private int SIZE;

  public Design_Circular_Deque_641(int k) {
      deque = new ArrayDeque<>(k);
      this.SIZE = k;
  }

  public boolean insertFront(int value) {
      if(deque.size() == SIZE){
        return false;
      }
        deque.offerFirst(value);
        return true;
  }

  public boolean insertLast(int value) {
      if(deque.size() == SIZE){
        return false;
      }
      deque.offerLast(value);
      return true;
  }

  public boolean deleteFront() {
      if(deque.isEmpty() == false){
        deque.pollFirst();
        return true;
      }
      return false;
  }

  public boolean deleteLast() {
      if(deque.isEmpty() == false){
        deque.pollLast();
        return true;
      }
      return false;
  }

  public int getFront() {
      if(deque.isEmpty() == false){
        return deque.peekFirst();
      }
      return -1;
  }

  public int getRear() {
    if(deque.isEmpty() == false){
      return deque.peekLast();
    }
    return -1;
  }

  public boolean isEmpty() {
      if(deque.isEmpty()){
        return true;
      }
      return false;
  }

  public boolean isFull() {
    if(deque.size() == SIZE){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Design_Circular_Deque_641 designCircularDeque641 = new Design_Circular_Deque_641();

  }
}
