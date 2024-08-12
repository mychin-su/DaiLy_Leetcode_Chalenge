package _SourceCode;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_a_Stream_703 {
  static class KthLargest {
    private int k;
    private PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
      this.k = k;
      minHeap = new PriorityQueue<>(k);
      for(int num : nums){
        add(num);
      }
    }

    public int add(int val) {
      if(minHeap.size() < k){
        minHeap.offer(val);
      } else if(val > minHeap.peek()){
        minHeap.poll(); // loai bo phan tu khoi hang doi
        minHeap.offer(val);
      }
      System.out.println("minHeap: " + minHeap);
      return minHeap.peek(); // lay phan tu dau hang doi nhung khong loai bo
    }

    public static void main(String[] args) {
      int k = 3;
      int nums[] = {4, 5, 8, 10};
      KthLargest kthLargest = new KthLargest(k, nums);
      kthLargest.add(3);
      kthLargest.add(5);
      kthLargest.add(10);
      kthLargest.add(9);
      kthLargest.add(4);
    }
  }
}
