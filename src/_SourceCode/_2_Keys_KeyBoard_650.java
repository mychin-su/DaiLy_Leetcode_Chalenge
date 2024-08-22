package _SourceCode;

public class _2_Keys_KeyBoard_650 {
  public static int minSteps(int n) {
    if(n == 1){
      return 0;
    }
   int steps = 0;
    int factor = 2;
    while(n > 1){
      if(n % factor == 0){
        steps += factor;
        n /= factor;
      } else{
        factor++;
      }
    }
    return steps;
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(minSteps(n));
  }
}
