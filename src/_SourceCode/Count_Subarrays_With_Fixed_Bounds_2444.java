package _SourceCode;

public class Count_Subarrays_With_Fixed_Bounds_2444 {
  public static  long countSubarrays(int[] nums, int minK, int maxK) {
       long res = 0;
       boolean minFound = false, maxFound = false;
       int start = 0,minstart = 0, maxStart = 0;
       for(int i = 0; i < nums.length; i ++){
         int num = nums[i];
         if(num < minK || num > maxK){ // if num is outside the given range
           minFound = false;
           maxFound = false;
           start = i + 1; // neu chung ta gap mot diem ma nam ngoai khoang thi cap nhap la diem bat dau
         }
         if(num == minK){
           minFound = true;
           minstart = i; // diem bat dau cua phan tu nho nhat minK
         }

         if(num == maxK){
           maxFound = true;
           maxStart = i; // diem ket thuc cua phan tu lon nhat maxK
         }
         if(minFound && maxFound){
           res += (Math.min(minstart, maxStart) - start + 1);// tru cho start co nghia la so diem truoc min k cung se dc lay and + 1 la mang con tu minK den maxK
         }
       }
       return res;
  }

  public static void main(String[] args) {
      int[] nums = {2, 1, 3, 5, 2, 7, 5};
      int minK = 1;
      int maxK = 5;
    System.out.println(countSubarrays(nums, minK, maxK));
  }
}
