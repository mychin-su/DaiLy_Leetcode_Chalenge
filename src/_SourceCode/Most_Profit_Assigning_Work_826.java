package _SourceCode;

public class Most_Profit_Assigning_Work_826 {
  public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
      int maxDifficulty = 0;
      for(int d : difficulty){
        maxDifficulty = Math.max(maxDifficulty, d);
      }

      int[] maxProfitUpToDifficulty = new int[maxDifficulty + 1];
      for(int i = 0; i < difficulty.length; i ++){
        maxProfitUpToDifficulty[difficulty[i]] = Math.max(maxProfitUpToDifficulty[difficulty[i]], profit[i]);
      }

      for(int i = 1; i <= maxDifficulty; i ++){
        maxProfitUpToDifficulty[i] = Math.max(maxProfitUpToDifficulty[i], maxProfitUpToDifficulty[i - 1]);
      }

      int totalProfit = 0;
      for(int ability : worker){
        if(ability > maxDifficulty){
          totalProfit += maxProfitUpToDifficulty[maxDifficulty];
        } else {
          totalProfit += maxProfitUpToDifficulty[ability];
        }
      }
      return totalProfit;
  }

  public static void main(String[] args) {
    int difficulty[] = {2, 4, 6, 8, 10};
    int profit[] = {10, 20, 30, 40, 50};
    int worker[] = {4, 5, 6, 7};
    System.out.println(maxProfitAssignment(difficulty, profit, worker));
  }
}
