package _SourceCode;

import java.util.Stack;

public class Crawler_Log_Folder_1598 {
  public static int minOperations(String[] logs) {
    Stack<String> stack = new Stack<>();
    for(int i = 0; i < logs.length; i ++){
      if(logs[i].length() >= 3 && logs[i].charAt(0) != '.'){
        stack.push(logs[i]);
      } else if(stack.size() > 0 &&logs[i].length() == 3){
        stack.pop();
      }
    }
    return stack.size();
  }

  public static void main(String[] args) {
    String logs[] = {"./","ho3/","tl8/"};
    System.out.println(minOperations(logs));

  }
}
