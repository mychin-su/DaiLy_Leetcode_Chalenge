package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class My_Calender_II {
  private List<int[]> bookings;
  public My_Calender_II() {
    bookings = new ArrayList<>();
  }

  public boolean book(int start, int end) {
      //Check for overlaps with existing bookings
      for(int[] interval : bookings){
        int a = interval[0], b = interval[1];

        //Check if the new booking overlaps with existing interval
        if(start < b && end > a){
          int newStart = Math.max(a, start);
          int newEnd = Math.min(b, end);

          //Check if the sub-interval overlaps more than once
          if(check(newStart, newEnd)){
            return false;
          }
        }
      }
    bookings.add(new int[]{start, end});
    return true; // Booking successfully
  }

  private boolean check(int start, int end){
    int overlapCount = 0;
    for(int[] interval : bookings){
      int a = interval[0], b = interval[1];

      //Check for strict overlap
      if(start < b && end > a){
          overlapCount++;
          if(overlapCount  == 2){
            return true;
          }
      }
    }
    return false;
  }


}
