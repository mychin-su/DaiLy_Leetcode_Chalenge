package _SourceCode;

import java.util.Stack;

public class Maximum_Nesting_of_the_Parentheses_1614 {
  public static int maxDepth(String s) {
    //C1
//    int count = 0; // current dept
//    int max = 0; // depth max
//    for(int i = 0; i < s.length(); i ++){
//      if(s.charAt(i) == '('){
//        count++;
//      } else if(s.charAt(i) == ')'){
//        count--;
//      }
//      max = Math.max(count, max);
//    }
//    return max;


    //C2
    Stack<Character> stack = new Stack<>();
    int max = 0;
    for(int i = 0; i < s.length(); i ++){
      char c = s.charAt(i);
      if(c == '('){
        stack.push(c);
      } else if(c == ')'){
        stack.pop();
      }
      max = Math.max(stack.size(), max);
    }
    return max;
  }

  public static void main(String[] args) {
    String s = "(1 + (2 * 3) + ((8) /4 )) + 1";
    System.out.println(maxDepth(s));
  }
}
