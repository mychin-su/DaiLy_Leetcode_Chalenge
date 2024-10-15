package _SourceCode;

public class Separate_Black_and_White_Balls_2938 {
    public static long minimumSteps(String s) {
        int swap= 0;
        int black = 0;
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '0'){
                swap += black;
            } else{
                black++;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        String s = "101";
        System.out.println(minimumSteps(s));
    }
}
