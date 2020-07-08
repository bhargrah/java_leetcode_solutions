package medium;

/**
 * @author rahulbhargava
 * @category 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * @see https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */

public class Solution_1379 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

		if (original == null)
			return null;

		// termination condition
		if (original == target)
			return cloned;

		// keep going left in subtree
		TreeNode leftNode = getTargetCopy(original.left, cloned.left, target);
		if (leftNode != null)
			return leftNode;

		// done with left tree then start iterating right subtree
		TreeNode rightNode = getTargetCopy(original.right, cloned.right, target);
		return rightNode;

	}

}
