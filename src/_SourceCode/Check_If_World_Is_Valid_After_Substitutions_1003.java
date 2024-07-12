package _SourceCode;

import java.util.Stack;

public class Check_If_World_Is_Valid_After_Substitutions_1003 {
  public static boolean isValid(String s) {
      int n = s.length();
      Stack<Character> stk = new Stack<>();
      for(int i = 0; i < n; i ++){
        stk.push(s.charAt(i));
        if(s.charAt(i) == 'c' && stk.size() >= 3){
          char c, b, a;
          c = stk.pop();
          b = stk.pop();
          a = stk.pop();
          if(a == 'a' && b == 'b' && c == 'c'){
            //Ignore
          } else {
            stk.push(a);
            stk.push(b);
            stk.push(c);
          }
        }else if(s.charAt(i) == 'c'){
          return false;
        }
      }
      return stk.empty();
  }

  public static void main(String[] args) {
    String s = "aabcbc";
    System.out.println(isValid(s));
  }
}
