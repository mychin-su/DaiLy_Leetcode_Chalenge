package _SourceCode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class My_Calender_I_729 {
  private ArrayList<int[]> bookings;
  public My_Calender_I_729() {
    bookings = new ArrayList<>();
  }

  public boolean book(int start, int end) {
    for(int[] event : bookings){
        int existingStart = event[0];
        int existingEnd = event[1];

        if(start < existingEnd && end > existingStart){
          return false;
        }
    }
    bookings.add(new int[]{start, end});
    return true;
  }
}
