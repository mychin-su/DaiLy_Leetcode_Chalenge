package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersectio_of_Two_Arrays_II_350 {
  public static int[] intersect(int[] nums1, int[] nums2) {
    int[] count1 = new int[1001];
    for(int num : nums1){
      count1[num]++;
    }

    List<Integer> resultList = new ArrayList<>();
    for(int num : nums2){
      if(count1[num] > 0){
        resultList.add(num);
        count1[num]--;
      }
    }
    int[] result = new int[resultList.size()];
    for(int i = 0; i < resultList.size(); i ++){
      result[i] = resultList.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    int nums1[] = {4, 9, 5};
    int nums2[] = {9, 4, 9, 8, 4};
    System.out.println(Arrays.toString(intersect(nums1, nums2)));
  }
}
