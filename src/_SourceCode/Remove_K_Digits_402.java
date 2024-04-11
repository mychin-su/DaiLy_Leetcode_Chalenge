package _SourceCode;

public class Remove_K_Digits_402 {
  public static String removeKdigits(String num, int k) {
    if(num.length() == k){
      return "0";
    }
    StringBuilder stack = new StringBuilder();
    for(char c : num.toCharArray()){
      while(stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1) > c){
        stack.setLength(stack.length() - 1);
        k--;
      }
      stack.append(c);
    }
    while(k > 0){
      stack.setLength(stack.length() - 1);
      k--;
    }
    int start = 0;
    while(start < stack.length() && stack.charAt(start) == '0'){
      start++;
    }
    if(start == stack.length()){
      return "0";
    }
    return stack.substring(start);
  }

  public static void main(String[] args) {
      String num = "10200";
      int k = 1;
    System.out.println(removeKdigits(num, k));
  }
}
