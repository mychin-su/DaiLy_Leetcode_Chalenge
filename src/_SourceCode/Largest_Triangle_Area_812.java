package _SourceCode;

public class Largest_Triangle_Area_812 {
	public static double largestTriangleArea(int[][] p) {
		double maxArea = 0.0;
		// Iterate over all possible combinations of three points
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				for (int k = j + 1; k < p.length; k++) {
					// Calculate area using selected three points
					double area = calculateArea(p[i], p[j], p[k]);
					// Update maxArea if necessary
					maxArea = Math.max(maxArea, area);
				}
			}
		}
		return maxArea;
	}

	// Calculate area of triangle formed by three points
	private static double calculateArea(int[] A, int[] B, int[] C) {
		return Math.abs(A[0] * (B[1] - C[1]) + B[0] * (C[1] - A[1]) + C[0] * (A[1] - B[1])) / 2.0;
	}

	public static void main(String[] args) {
		int points[][] = { { 0, 0 }, { 0, 1 }, { 1, 0 } };
		System.out.println(largestTriangleArea(points));
	}
}
