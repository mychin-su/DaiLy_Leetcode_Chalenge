package _SourceCode;

import java.util.Arrays;

public class Minimum_Number_of_Moves_to_Seat_Everyone_2037 {
  public static int minMovesToSeat(int[] seats, int[] students) {
    Arrays.sort(seats);
    Arrays.sort(students);
    int count = 0;
    for(int i = 0; i < seats.length; i ++){
      count += Math.abs(students[i] - seats[i]);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] seats = {3, 1, 5};
    int[] students = {2, 7, 4};
    System.out.println(minMovesToSeat(seats, students));
  }
}
