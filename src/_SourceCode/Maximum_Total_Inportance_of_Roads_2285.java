package _SourceCode;

public class Maximum_Total_Inportance_of_Roads_2285 {
  public static long maximumImportance(int n, int[][] roads) {
      int[] degree = new int[n];
      for(int road[] : roads){
        degree[road[0]]++;
        degree[road[1]]++;
      }

      int[] frequency = new int[n];
      for(int d : degree){
        frequency[d]++;
      }

      long totalImportance = 0;
      long value = 1;
      //Assign values to cities starting from the highest degree
    for(long i = 0; i < n; i ++){
      for(int j = 0; j < frequency[(int)i]; j ++){
        totalImportance += i * value++;
      }
    }
    return totalImportance;
  }

  public static void main(String[] args) {
    int n = 5;
    int roads[][] = {{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}};
    System.out.println(maximumImportance(n, roads));
  }
}
