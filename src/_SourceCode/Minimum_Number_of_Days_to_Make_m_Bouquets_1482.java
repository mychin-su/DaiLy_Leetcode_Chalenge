package _SourceCode;

public class Minimum_Number_of_Days_to_Make_m_Bouquets_1482 {
  public static int minDays(int[] bloomDay, int m, int k) {
      int n = bloomDay.length;
      if(m * k > n){
        return -1;
      }
      int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
      for(int i : bloomDay){
        max = Math.max(max, i);
        min = Math.min(min, i);
      }

      //Take the boundary starting from 1 to the max day in the bloomDay
    while(min < max){
      int mid = min + (max - min) / 2;
      int possibleBookies = getPossibleBookies(bloomDay, mid, k);

      if(possibleBookies < m){
        min = mid + 1;
      } else {
        max = mid;
      }
    }
    return min;
  }


  private static int getPossibleBookies(int[] bloomDay, int day, int k){
    //This method is to find the number of bouquets that can be formed
    int bouquets = 0, flowerCollected = 0;
    for(int value : bloomDay){
      if(value <= day){
        //If the current flower can be taken with in days them increase the flower flowersCollected
        flowerCollected++;
      } else {
        //If there is a flower in between that takes more number of days then the given day, then resent the counter
        flowerCollected = 0;
      }

      //If the flowersCollected is same as the required flower per bookie, then increase the bouquets count;
      if(flowerCollected == k){
        bouquets++;
        flowerCollected = 0;
      }
    }
    return bouquets;
  }

  public static void main(String[] args) {
    int bloomDay[] = {1, 10, 3, 10 ,2};
    int m = 3, k = 1;
    System.out.println(minDays(bloomDay, m, k));
  }
}
