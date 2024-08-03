package _SourceCode;

import java.util.Arrays;

public class Make_Two_Arrays_Equal_by_Reversing_Subarrays_1460 {
	public static boolean canBeEqual(int[] target, int[] arr) {
		// use sorting: O(nlogn);
//		Arrays.sort(arr);
//		Arrays.sort(target);
//		if (Arrays.equals(target, arr))
//			return true;
//		return false;

		// Use map
//		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
//		for (int i = 0; i < target.length; i++) {
//			myMap.put(target[i], myMap.getOrDefault(target[i], 0) + 1);
//			myMap.put(target[i], myMap.getOrDefault(arr[i], 0) - 1);
//		}
//		for(int num : myMap.keySet()) {
//			if(myMap.get(num) != 0) {
//				return false;
//			}
//		}
//		return true;

		int n = target.length;
		int m = arr.length;
		if(n != m){
			return false;
		}
		int[] map = new int[n];
		for(int i = 0 ; i < n ; i ++){
			map[target[i]]++;
			map[arr[i]]--;
		}
		for(int i = 0; i < n; i ++){
			if(map[target[i]] != 0 ){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int target[] = { 1, 2, 2, 3 };
		int arr[] = { 1, 1, 2, 3 };
		System.out.println(canBeEqual(target, arr));
	}
}
