package _SourceCode;

public class Number_Complement_476 {
  public static int findComplement(int num) {
      String str = Integer.toBinaryString(num);
      String res = "";
      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == '0'){
          res += '1';
        } else {
          res += '0';
        }
      }
      return Integer.parseInt(res, 2); // Convert the Result Binary String Back to Integer
  }

  public static void main(String[] args) {
    int num = 5;
    System.out.println(findComplement(num));
  }
}
