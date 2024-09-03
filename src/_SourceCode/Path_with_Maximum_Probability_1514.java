package _SourceCode;

public class Path_with_Maximum_Probability_1514 {
  public static double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
    double[] maxProp = new double[n];
    maxProp[start_node] = 1.0;
    for(int i = 0; i < n - 1; i ++){
      boolean updated = false;
      for(int j = 0; j < edges.length; j ++){
        int u = edges[j][0];
        int v = edges[j][1];
        double prob = succProb[j];

        if(maxProp[u] * prob > maxProp[v]){
          maxProp[v] = maxProp[u] * prob;
          updated = true;
        }
        if(maxProp[v] * prob > maxProp[u]){
          maxProp[u] = maxProp[v] * prob;
          updated = true;
        }
      }
      if(!updated) {
        break;
      }
    }
    return maxProp[end_node];
  }


  public static void main(String[] args) {
    int n = 3;
    int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
    double  succProb [] = {0.5, 0.5,0,2};
    int start = 1;
    int end = 0;
    System.out.println(maxProbability(n, edges, succProb, start, end));
  }

}
