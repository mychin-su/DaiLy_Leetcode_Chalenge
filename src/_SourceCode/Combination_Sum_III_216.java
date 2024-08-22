package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III_216 {
  public static List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> ans = new ArrayList<>();
      combination(ans, new ArrayList<>(), k, 1, n);
      return ans;
  }

  private static void combination( List<List<Integer>> ans, List<Integer> comb, int k, int start, int n){
    if(comb.size() == k && n == 0){
        ans.add(comb);
        return;
    }
    for(int i = start; i <= 9; i ++){
      comb.add(i);
      combination(ans, comb, k, i + 1, n - i);
      System.out.println(comb);
      comb.remove(comb.size() - 1);
    }
  }

  public static void main(String[] args) {
    int n = 3;
    int k = 9;
    System.out.println(combinationSum3(n , k));
  }

}
