package _SourceCode;

public class Container_With_Most_Water_11 {
	public static int maxArea(int[] height) {
		if (height.length == 2) {
			return Math.min(height[0], height[1]);
		}
		int max = Integer.MIN_VALUE;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int w = right - left;
			int h = Math.min(height[left], height[right]);
			int area = h * w;
			max = Math.max(max, area);
			while (left < right && height[left] <= h) {
				left++;
			}
			while (left < right && height[right] <= h) {
				right--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] height = { 1, 3, 2, 5, 25, 24, 5 };
		System.out.println(maxArea(height));
	}
}
