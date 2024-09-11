package _SourceCode;

public class Minimum_Bit_Flips_to_Convert_Number_2220 {

  public static int minBitFlips(int start, int goal) {
    String s1 = Integer.toBinaryString(start);
    String s2 = Integer.toBinaryString(goal);
      while (s1.length() < s2.length()) {
        s1 = "0" + s1;
      }

      while(s1.length() > s2.length()){
        s2 = "0" + s2;
      }

      int ans = 0;
      for(int i = 0; i < s1.length(); i ++){
        if(s1.charAt(i) != s2.charAt(i)){
          ans ++;
        }
    }
    return ans;
  }

  public static void main(String[] args) {
    int start = 3;
    int goal = 4;
    System.out.println(minBitFlips(start, goal));
  }
}
