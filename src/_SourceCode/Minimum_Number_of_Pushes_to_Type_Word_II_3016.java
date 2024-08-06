package _SourceCode;

import java.util.Arrays;

public class Minimum_Number_of_Pushes_to_Type_Word_II_3016 {
  public static int minimumPushes(String word) {
    int[] count = new int[26];
    for(int i = 0; i < word.length(); i ++){
      count[word.charAt(i) - 'a']++;
    }
    Arrays.sort(count);
    int cnt = 0;
    int ans = 0;
    for(int i = 25; i >= 0; i--){
      if(cnt >= 8 && count[i] > 0){
        cnt++;
        if(cnt % 8 == 0){
          ans+= count[i] * (cnt / 8);
        } else {
          ans+= count[i] * (cnt / 8 + 1);
        }
      } else {
        if(count[i] > 0){
          cnt++;
          ans += count[i] * 1;

        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String word = "abcde";
    System.out.println(minimumPushes(word));
  }
}
