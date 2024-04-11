package _SourceCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Reveal_Cards_In_Increasing_Order_950 {
  public static int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck); // sap xep bo bai theo thu tu tang dan. Dieu nay se giup chung ta bat dau voi the nho nhat.

    int n = deck.length;
    int[] result = new int[n]; // tao mot mang ket qua de luu tru cac the duoc tiet lo theo thu tu mong muon.
    Deque<Integer> indices = new LinkedList<>();
    //Su dung deque(hang doi hai dau) de theo doi cac chi so cua mang ket qua. Deque nay
    //se giup duy tri thu tu cua cac the trong qua trinh mo phong.

    for(int i = 0; i < n; i ++){
      indices.add(i);
    }
    for(int card : deck){
      int idx = indices.poll();
      System.out.println(idx);
      result[idx] = card;
      System.out.println(Arrays.toString(result));
      if(!indices.isEmpty()){
        indices.add(indices.poll());
        System.out.println(indices);
      }
    }
       return result;
  }

  public static void main(String[] args) {
//    int[] deck = {17, 13, 11, 2, 3, 5, 7};
//    System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));

    String s = "123455";
    if(s.length() < 3 ){
      System.out.println("123");
    }
  }
}
