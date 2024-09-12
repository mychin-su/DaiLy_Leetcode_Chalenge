package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Count_the_Number_of_Consistent_Strings_1684 {
  public static int countConsistentStrings(String allowed, String[] words) {
    Set<Character> mySet = new HashSet<>();
    for (char c : allowed.toCharArray()) {
      mySet.add(c);
    }

    int count = 0;
    for(String word : words){
      if(isContained(word, mySet)){
        count++;
      }
    }
    return count;
  }

  public static boolean isContained(String word, Set<Character> mySet){
    for(char c : word.toCharArray()){
      if(!mySet.contains(c)){
        return false;
      }
    }
    return true;
  }



  public static void main(String[] args) {
    String allowed = "abc";
    String words[] =  {"a","b","c","ab","ac","bc","abc"};

    System.out.println(countConsistentStrings(allowed, words));
  }
}
