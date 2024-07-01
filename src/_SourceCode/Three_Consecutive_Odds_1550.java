package _SourceCode;

public class Three_Consecutive_Odds_1550 {
  public static boolean threeConsecutiveOdds(int[] arr) {
      int count = 0;
      for(int num : arr){
        if(num % 2 == 1){
          count++;
        } else {
          count = 0;
        }
        if(count == 3){
          return true;
        }

      }
      return false;
  }

  public static void main(String[] args) {
    int arr[] = {2, 6, 4, 1};
    System.out.println(threeConsecutiveOdds(arr));
  }
}
