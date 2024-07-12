package _SourceCode;

import java.util.Stack;

public class Maximum_Score_From_Removing_Substrins_1717 {
  public static int maximumGain(String s, int x, int y) {
    int n = s.length(), ans = 0;
    for(int i = 0; i < n; i ++){
      if(s.charAt(i) != 'a' && s.charAt(i) != 'b') continue;
      int j = i;
      StringBuilder sb = new StringBuilder();
      while(j < n && (s.charAt(j) == 'a' || s.charAt(j) == 'b')){
        sb.append(s.charAt(j));
        j++;
      }
      ans += Math.max(processAB(sb.toString(), x , y), processBA(sb.toString(), x, y));
      i = j - 1;
    }
    return ans;
  }

  private static int processAB(String s, int x, int y){
    Stack<Character> stk = new Stack<>();
    int ans = 0;
    for(char c : s.toCharArray()){
      if(!stk.isEmpty() && stk.peek() == 'b' && c == 'a'){
        stk.pop();
        ans += y;
      } else {
        stk.push(c);
      }
    }
    int a = 0, b = 0;
    for(char c : stk){
      if(c == 'a') a++;
      else{
        b++;
      }
    }
    return Math.min(a, b) * x + ans;
  }

  private static int processBA(String s, int x, int y){
    Stack<Character> stk = new Stack<>();
    int ans = 0;
    for(char c : s.toCharArray()){
      if(!stk.isEmpty() && stk.peek() == 'a' && c == 'b'){
        stk.pop();
        ans += x;
      } else {
        stk.push(c);
      }
    }
    int a = 0, b = 0;
    for(char c : stk){
      if(c == 'a') a++;
      else{
        b++;
      }
    }
    return Math.min(a, b) * y + ans;
  }

  public static void main(String[] args) {
    String s = "aabbaaxybbaabb";
    int x = 4, y = 5;
    System.out.println(maximumGain(s, x ,y));
  }
}
