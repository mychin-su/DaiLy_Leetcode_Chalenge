package _SourceCode;

public class Range_Sum_of_BST_938 {
	public static class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		if (root.val >= low && root.val <= high) {
			sum += root.val;
		}
		if (root.val >= low) {
			sum += rangeSumBST(root.left, low, high);
		}
		if (root.val <= high) {
			sum += rangeSumBST(root.right, low, high);
		}
		return sum;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(10);
		node.left = new TreeNode(5);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(7);
		node.right = new TreeNode(15);
		node.right.right = new TreeNode(18);
		System.out.println(rangeSumBST(node, 7, 15));
	}
}
