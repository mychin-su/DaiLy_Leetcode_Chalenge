package _SourceCode;

import java.util.ArrayList;

public class Leaf_Similar_Trees_872 {
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

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		ArrayList<Integer> leaf1 = new ArrayList<Integer>();
		ArrayList<Integer> leaf2 = new ArrayList<Integer>();
		leaf1 = findLeafNodes(root1, leaf1);
		leaf2 = findLeafNodes(root2, leaf2);
		return leaf1.equals(leaf2);
	}

	public static ArrayList<Integer> findLeafNodes(TreeNode root, ArrayList<Integer> leaf) {
		if (root == null) {
			return null;
		}

		if (root.left == null && root.right == null) {
			leaf.add(root.val);
		}

		findLeafNodes(root.left, leaf);
		findLeafNodes(root.right, leaf);
		return leaf;
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(3);
		root2.right = new TreeNode(2);
		System.out.println(leafSimilar(root1, root2));
	}
}
