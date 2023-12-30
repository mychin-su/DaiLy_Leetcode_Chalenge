package _SourceCode;

public class Find_Common_Elements_Between_Two_Arrays_2956 {
	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
//		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
//		List<Integer> list = new LinkedList<Integer>();
//
//		for (Integer num : nums1) {
//			map1.put(num, map1.getOrDefault(num, 0) + 1);
//		}
//
//		for (Integer num : nums2) {
//			map2.put(num, map2.getOrDefault(num, 0) + 1);
//		}
//		int count2 = 0;
//		for (int num : nums1) {
//			if (map2.containsKey(num)) {
//				count2++;
//			}
//		}
//		list.add(count2);
//
//		int count1 = 0;
//		for (int num : nums2) {
//			if (map1.containsKey(num)) {
//				count1++;
//			}
//		}
//		list.add(count1);
//		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
//		return arr;

		int[] s1 = new int[101];
		int[] s2 = new int[101];
		for (int i : nums1) {
			s1[i] = 1;
		}
		for (int i : nums2) {
			s2[i] = 1;
		}

		int[] res = new int[2];
		for (int i : nums1) {
			res[0] += s2[i];
		}
		for (int i : nums2) {
			res[1] += s1[i];
		}
		return res;

	}

	public static void main(String[] args) {
		int nums1[] = { 4, 3, 2, 3, 1 };
		int nums2[] = { 2, 2, 5, 2, 3, 6 };
		System.out.println(findIntersectionValues(nums1, nums2));
	}
}
