package _SourceCode;

public class Pass_the_Pillow_2582 {
  public static int passThePillow(int n, int time) {
    int d = 1;
    int curr = 1;
    int ela = 0;
    while(ela < time){
      curr += d;
      if(curr == 1 || curr == n){
        d =- d;
      }
      ela++;
    }
    return curr;
  }

  public static void main(String[] args) {
    int n = 4;
    int time = 5;
    System.out.println(passThePillow(n, time));
  }
}
