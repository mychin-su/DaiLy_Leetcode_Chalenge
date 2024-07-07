package _SourceCode;

public class Water_Bottles_1518 {
  public static int numWaterBottles(int numBottles, int numExchange) {
      int ans = numBottles;
      while(numBottles >= numExchange){
        int newBottles = numBottles / numExchange;
        int remBottles = numBottles % numExchange;
        ans  += newBottles;
        numBottles = newBottles + remBottles;
      }
      return ans;
  }

  public static void main(String[] args) {
    int numBottles = 9;
    int numExchange = 3;
    System.out.println(numWaterBottles(numBottles, numExchange));
  }
}
