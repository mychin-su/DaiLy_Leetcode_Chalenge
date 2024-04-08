package _SourceCode;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Students_Unable_to_Eat_Lunch_1700 {
  public static int countStudents(int[] students, int[] sandwiches){
        Queue<Integer> q = new LinkedList<>();
        int top = 0, count = 0;
        for(int e : students){
          q.add(e);
        }
        while(!q.isEmpty() && count != q.size()){
          if(q.peek() == sandwiches[top]){
            count = 0;
            top++;
             q.poll();
          } else {
            q.add(q.poll());
            count++;
          }
        }
        return q.size();
  }

  public static void main(String[] args) {
    int students[] = {1, 1, 1, 0, 0, 1};
    int sandwiches[] = {1, 0, 0, 0, 1, 1};
    System.out.println(countStudents(students, sandwiches));
  }
}
