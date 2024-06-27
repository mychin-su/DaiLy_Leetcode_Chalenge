package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Find_Center_of_Star_Graph_1791 {
  public static int findCenter(int[][] edges) {
    Set<Integer> set = new HashSet<>();
      for(int i = 0; i < edges.length; i ++){
        for(int j = 0; j < edges[i].length; j ++){
          if(set.contains(edges[i][j])){
            return edges[i][j];
          }
          set.add(edges[i][j]);
        }
      }
      return -1;
  }

  public static void main(String[] args) {
      int edges[][]  = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
    System.out.println(findCenter(edges));
  }
}
