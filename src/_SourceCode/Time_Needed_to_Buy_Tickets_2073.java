package _SourceCode;

import java.util.LinkedList;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets_2073 {
  public static int timeRequiredToBuy(int[] tickets, int k) {
   int res = 0;
   for(int i = 0; i < tickets.length; i ++){
     if(i <= k){
       res += Math.min(tickets[k],tickets[i]);
     } else {
       res += Math.min(tickets[k] - 1, tickets[i]); // tru 1 vi no lap qua k truoc khi i > k nen thang k no se het truoc khi nhung thanh i > k
     }
   }
   return res;
  }

  public static void main(String[] args) {
    int tickets[] = {1, 1, 5, 1};
    int k = 2;
    System.out.println(timeRequiredToBuy(tickets, k));
  }
}
