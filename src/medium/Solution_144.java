package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 144. Binary Tree Preorder Traversal
 * @see https://leetcode.com/problems/binary-tree-preorder-traversal/
 */

public class Solution_144 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> preOrderList = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		while (true) {

			while (root != null) {
				stack.push(root);
				preOrderList.add(root.val);
				root = root.left;
			}

			if (stack.isEmpty())
				break;

			root = stack.pop();
			root = root.right;
		}

		return preOrderList;
	}
}
