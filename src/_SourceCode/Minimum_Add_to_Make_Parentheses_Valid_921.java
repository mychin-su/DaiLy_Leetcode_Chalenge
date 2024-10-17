package _SourceCode;

public class Minimum_Add_to_Make_Parentheses_Valid_921 {
    public static int minAddToMakeValid(String s) {
        int open = 0;
        int misMatch = 0;
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '('){
                open++;
            } else {
                if(open > 0){
                    open--;
                } else {
                    misMatch++;
                }
            }
        }
        return misMatch + open;
    }

    public static void main(String[] args) {
        String s = "()))";
        System.out.println(minAddToMakeValid(s));
    }
}
