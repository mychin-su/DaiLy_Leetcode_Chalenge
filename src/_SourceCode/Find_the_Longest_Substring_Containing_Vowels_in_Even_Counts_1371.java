package _SourceCode;

import java.util.Arrays;

public class Find_the_Longest_Substring_Containing_Vowels_in_Even_Counts_1371 {
  public static int findTheLongestSubstring(String s) {

    int[] mapy = new int[32];
    Arrays.fill(mapy, -2);
    mapy[0] = -1;

    int maxLen = 0;
    int mask = 0;
    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      switch (c){
        case 'a':
          mask ^= 1;
          break;
        case 'e':
          mask ^= 2;
          break;
        case 'i':
          mask ^= 4;
          break;
        case 'o':
          mask ^= 8;
        case 'u':
          mask  ^= 16;
          break;
      }
      int prev= mapy[mask];
      if(prev == -2){
        mapy[mask] = i;
      } else {
        maxLen = Math.max(maxLen, i - prev);
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    String s = "eleetminicoworoep";
    System.out.println(findTheLongestSubstring(s));
  }
}
