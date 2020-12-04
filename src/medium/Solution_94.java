package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 94. Binary Tree Inorder Traversal
 * @see https://leetcode.com/problems/binary-tree-inorder-traversal/
 */

public class Solution_94 {

	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		if (root == null)
			return result;

		while (true) {

			while (root != null) {
				stack.push(root);
				root = root.left;
			}

			if (stack.isEmpty())
				break;

			root = stack.pop();
			result.add(root.val);
			root = root.right;
		}

		return result;
	}

}
