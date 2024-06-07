package _SourceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Replace_Words_648 {
  public static String replaceWords(List<String> dictionary, String sentence) {
     String[] arr = sentence.split(" ");
     Set<String> set = new HashSet<>();
     for(String dic : dictionary){
       set.add(dic);
     }

     StringBuilder sb = new StringBuilder();
     for(String dic : arr){
       for(int i = 0; i < dic.length(); i++){
         String prefix = dic.substring(0, i + 1);
         if(set.contains(prefix)){
           dic = prefix;
           break;
         }
       }
       if(sb.length() == 0){
         sb.append(dic);
       } else {
         sb.append(" ");
         sb.append(dic);
       }

     }
      return sb.toString();
  }

  public static void main(String[] args) {
    List<String> dictionary = new ArrayList<>();
    dictionary.add("cat");
    dictionary.add("bat");
    dictionary.add("rat");
    String sentences = "the cattle was rattled by the battery";
    System.out.println(replaceWords(dictionary, sentences));
  }
}
