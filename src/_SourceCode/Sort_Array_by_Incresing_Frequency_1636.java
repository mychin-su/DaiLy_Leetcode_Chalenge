package _SourceCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort_Array_by_Incresing_Frequency_1636 {
  public static int[] frequencySort(int[] nums) {
      int[] freq = new int[201];
      List<Integer> list = new ArrayList<>();
      for(int num : nums){
        freq[num + 100]++;
        list.add(num);
      }
    Collections.sort(list, (a, b) -> {
      return freq[a + 100] == freq[b + 100] ? b - a : freq[a + 100] - freq[b + 100];
    });
    for(int i = 0; i < nums.length; i ++){
      nums[i] = list.get(i);
    }
    return nums;
  }

  public static void main(String[] args) {
    int nums[] = {1, 1, 2, 2, 2, 3};
    System.out.println(frequencySort(nums));
  }
}
