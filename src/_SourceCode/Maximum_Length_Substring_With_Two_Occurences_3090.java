package _SourceCode;

public class Maximum_Length_Substring_With_Two_Occurences_3090 {
  public static int maximumLengthSubstring(String s) {
        int ans = 0;
        int[] freq = new int[26];
        for(int i = 0, ii = 0; i < s.length(); i ++){
          ++freq[s.charAt(i) - 97];
          while(freq[s.charAt(i) - 97] == 3) {
            --freq[s.charAt(ii++) - 97]; // Lap tu chi so ii den chi so i de giam bot ki tu ma ma no = 3
          }
          ans = Math.max(ans, i - ii + 1);
        }
        return ans;
  }

  public static void main(String[] args) {
    String s = "ccbbacbbb";
    System.out.println(maximumLengthSubstring(s));
  }
}
