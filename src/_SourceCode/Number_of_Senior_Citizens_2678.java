package _SourceCode;

public class Number_of_Senior_Citizens_2678 {
  public static int countSeniors(String[] details) {
      int count = 0;
      for(String detail : details){
        int age = Integer.parseInt(detail.substring(11, 13));
        if(age > 60){
          count ++;
        }
      }
      return count;
  }

  public static void main(String[] args) {
    String details[] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
    System.out.println(countSeniors(details));
  }
}
