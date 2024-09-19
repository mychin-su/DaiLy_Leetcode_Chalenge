package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parentheses_241 {
  public static List<Integer> diffWaysToCompute(String expression) {
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < expression.length(); ++i) {
      char oper = expression.charAt(i);
      if (oper == '+' || oper == '-' || oper == '*') {
        List<Integer> s1 = diffWaysToCompute(expression.substring(0, i));
        List<Integer> s2 = diffWaysToCompute(expression.substring(i + 1));
        for (int a : s1) {
          for (int b : s2) {
            if (oper == '+') res.add(a + b);
            else if (oper == '-') res.add(a - b);
            else if (oper == '*') res.add(a * b);
          }
        }
      }
    }
    if (res.isEmpty()) res.add(Integer.parseInt(expression));
    return res;
  }

  public static void main(String[] args) {
      String expression = "2-1-1";
    System.out.println(diffWaysToCompute(expression));
  }
}
