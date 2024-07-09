package _SourceCode;

public class Average_Waiting_Time_1701 {
  public static double averageWaitingTime(int[][] customers) {
    double totalTime = customers[0][0];
    double waitingTime = 0;
    for(int i = 0; i < customers.length; i ++){
      if(customers[i][0] > totalTime){
        totalTime = customers[i][0] + customers[i][1];
      }else {
        totalTime += customers[i][1];
      }
      waitingTime += totalTime - customers[i][0];
    }
    return waitingTime / customers.length;
  }

  public static void main(String[] args) {
    int[][] customers = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
    System.out.println(averageWaitingTime(customers));
  }
}
