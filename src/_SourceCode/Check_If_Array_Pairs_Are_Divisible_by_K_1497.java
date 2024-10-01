package _SourceCode;

public class Check_If_Array_Pairs_Are_Divisible_by_K_1497 {
  public static boolean canArrange(int[] arr, int k) {
    int[] freq = new int[k];
    for(int num : arr){
      int rem = num % k;
      if(rem < 0){
        rem = rem + k;
      }
      freq[rem]++;
    }
    if(freq[0] % 2 != 0){
      return false;
    }
    for(int i = 1; i <= k; i ++){
      if(freq[i] != freq[k - i]){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
    int k = 5;
    System.out.println(canArrange(arr, k));
  }
}
