package _SourceCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Boats_to_Save_People {
  public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats  = 0;
        int l =0, r = people.length - 1;
        while( l <= r){
          if(people[l] + people[r] <= limit){
            l++;
            r--;
          } else {
            r--;
          }
          boats++;
        }
        return boats;
  }

  public static void main(String[] args) {
    int people[] = {2,2,2,1};
    int limit = 3;
    System.out.println(numRescueBoats(people, limit));
  }
}
