package _SourceCode;

public class Remove_K_Digits_402 {
  public static String removeKdigits(String num, int k) {
    if(num.length() == k){
      return "0";
    }

    StringBuilder stack = new StringBuilder();
    for(char digit : num.toCharArray()){
      while(stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1)  > digit){
          stack.setLength(stack.length() - 1);
          k--;
      }
      stack.append(digit);
    }

    //Remove any remaining digits from the end (neu k van con lon hon 0 thi xoa di cac so con lai o cuoi)
    while(k > 0){
      stack.setLength(stack.length() - 1);
      k--;
    }

    //Remove leading zero ("Xoa cac so o dau")
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
      String num = "1432219";
      int k = 3;
    System.out.println(removeKdigits(num, k));
  }
}
