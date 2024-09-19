package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Uncommon_Words_from_Two_Sentences_884 {
  public static String[] uncommonFromSentences(String s1, String s2) {
     String s = s1 + s2;
     Map<String, Integer> map = new HashMap<>();
     String words[] = s.split(" ");

     for(String word : words){
       map.put(word, map.getOrDefault(word, 0) + 1);
     }

    List<String> result = new ArrayList<>();
     for(Map.Entry<String, Integer> entry : map.entrySet()){
       if(entry.getValue() == 1) {
         result.add(entry.getKey());
       }
     }

     String[] ans = new String[result.size()];
     for(int i = 0; i < result.size(); i ++){
       ans[i] = result.get(i);
     }

     return ans;
  }

  public static void main(String[] args) {
      String s1 = "this apple is sweet", s2 = "this apple is sour";
    System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
  }
}
