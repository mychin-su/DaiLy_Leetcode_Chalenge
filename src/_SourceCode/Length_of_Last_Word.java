package _SourceCode;

public class Length_of_Last_Word {
  public static int lengthOfLastWord(String s) {
//      s = s.replaceAll("\\s+", " ");
//      String[] spl = s.split(" ");
//      return spl[spl.length - 1].length();

    String words[] = s.trim().split(" ");
    return words[words.length - 1].length();


  }

  public static void main(String[] args) {
    String s = "Hello World";
    System.out.println(lengthOfLastWord(s));
  }
}
