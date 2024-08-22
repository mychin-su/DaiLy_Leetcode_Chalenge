package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II_40 { // Backtracking
  public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> res = new ArrayList<>();

      dfs(candidates, target, 0, new ArrayList<>(), res);
      return res;
  }

  public static void dfs(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res){
    if(target < 0){
      return;
    }
    if(target == 0){
      res.add(new ArrayList<Integer>(comb));
      return;
    }
    for(int i = start; i < candidates.length; i ++){
      if(i > start && candidates[i] == candidates[i - 1]){
        continue;
      }
      if(candidates[i] > target){
        break;
      }
      comb.add(candidates[i]);
      dfs(candidates, target- candidates[i], i + 1, comb, res);
      System.out.println(comb);
      comb.remove(comb.size() - 1);
    }
  }

  public static void main(String[] args) {
    int candidates[] = {1, 2, 2, 2, 5}; // 1 2 2 2 5
    System.out.println(combinationSum2(candidates, 5));
  }
}
