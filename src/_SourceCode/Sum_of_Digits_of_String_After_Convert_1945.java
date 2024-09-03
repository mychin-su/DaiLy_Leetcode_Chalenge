package _SourceCode;

public class Sum_of_Digits_of_String_After_Convert_1945 {
  public static int getLucky(String s, int k) {
    StringBuilder sb = new StringBuilder();
    for(char c : s.toCharArray()){
      sb.append( c - 'a' + 1 );
    }
    String s1 = sb.toString();
    int result = 0;
    for(int i = 0; i < k; i ++){
      result = 0;
      for(char c : s1.toCharArray()){
        result += (c - '0');
        s1 = String.valueOf(result);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String s = "leetcode";
    int k = 2;
    System.out.println(getLucky(s, k));
  }
}
