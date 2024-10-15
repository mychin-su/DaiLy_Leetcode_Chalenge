package _SourceCode;

import java.util.Stack;

public class Minimum_String_Length_After_Removing_Substrings_2996 {
    public static int minLength(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && ((st.peek() == 'A' && s.charAt(i) == 'B') ||(st.peek() == 'C' && s.charAt(i) == 'D'))){
                st.pop();
            }else {
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
}
