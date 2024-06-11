package _SourceCode;

public class Relative_Sort_Array_11222 {
  public static int[] relativeSortArray(int[] arr1, int[] arr2) {
      int[] count = new int[1001];
      for(int num : arr1){
        count[num]++;
      }
      int i = 0;
      for(int num : arr2){
        while(count[num]-- > 0){
          arr1[i++] = num;
        }
      }

      for(int n = 0; n < count.length; n ++){
        while(count[n]-- > 0){
          arr1[i++] = n;
        }
      }
      return arr1;
  }

  public static void main(String[] args) {
    int arr1[] = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int arr2[] = {2, 1, 4, 3, 9, 6};
    System.out.println(relativeSortArray(arr1, arr2));
  }
}
