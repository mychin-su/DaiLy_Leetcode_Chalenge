package _SourceCode;

public class Sum_of_Square_Numbers_633 {
  public static boolean judgeSquareSum(int c) {
    for(long a = 0; a * a <= c; a++){
      double b = Math.sqrt(c - a * a);
      if (b == (int)b) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int c = 5;
    System.out.println(judgeSquareSum(c));
  }
}
