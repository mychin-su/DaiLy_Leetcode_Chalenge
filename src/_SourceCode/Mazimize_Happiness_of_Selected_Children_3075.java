package _SourceCode;

import java.util.Arrays;

public class Mazimize_Happiness_of_Selected_Children_3075 {
  public static long maximumHappinessSum(int[] happiness, int k) {
    //Sort the array in ascending order
    Arrays.sort(happiness);

    //Reverse the array to get descending order
  //  reverseArray(happiness);

    int selected = 0;
    long happinessScore = 0;
    int n = happiness.length;

    //Iterate over the sorted happiness values
    for(int i = n - 1; i > 0; i --){
      if(selected == k){
        break; // Stop if 'k' elements have been selected
      }
      //Calculate and add the adjust happiness value if it's positive
      happinessScore += Math.max(0, happiness[i] - selected);
      selected++;
    }
    return happinessScore;

  }

  private static void reverseArray(int[] array){
    for(int i  = 0, j = array.length - 1; i < j; i ++, j--){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  }

  public static void main(String[] args) {
      int happiness[] = {7, 50, 3};
      int k = 3;
      System.out.println(maximumHappinessSum(happiness, k));
  }
}
