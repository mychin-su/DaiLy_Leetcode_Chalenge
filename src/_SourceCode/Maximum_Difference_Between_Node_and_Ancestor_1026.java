package _SourceCode;

public class Maximum_Difference_Between_Node_and_Ancestor_1026 {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static int solve(TreeNode root, int min, int max) {
		if (root == null) {
			return max - min;
		}
		if (root.val < min) {
			min = root.val;
		}
		if (root.val > max) {
			max = root.val;
		}
		return Math.max(solve(root.left, min, max), solve(root.right, min, max));
	}

	public static int maxAncestorDiff(TreeNode root) {
		return solve(root, root.val, root.val);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(0);
		root.right.right.left = new TreeNode(3);
		System.out.println(maxAncestorDiff(root));
	}
}
