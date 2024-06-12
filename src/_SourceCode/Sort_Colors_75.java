package _SourceCode;

public class Sort_Colors_75 {
  public static void sortColors(int[] nums) {
    int count[] = new int[3];
    for(int num : nums){
      count[num]++;
    }

    int j = 0;
    for(int i = 0; i < count.length; i ++){
      while(count[i]-- > 0){
        nums[j++] = i;
      }
    }

  }


  public static void main(String[] args) {
    int nums[] = {2, 0, 2, 1, 1, 0};
    sortColors(nums);
  }
}
