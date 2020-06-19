package problems;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author rahulbhargava
 * @category 104. Maximum Depth of Binary Tree
 * @see https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

class TreeNode {
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

public class Solution_104 {

	public static void main(String[] args) {

	}

	public int maxDepth(TreeNode root) {

		int depth = 0;
		
		if(root==null) return depth;

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);

		TreeNode NULL = new TreeNode(Integer.MIN_VALUE);
		queue.add(NULL);

		while (!queue.isEmpty()) {

			TreeNode temp = queue.poll();

			if (temp.val == Integer.MIN_VALUE) {
				
				if(!queue.isEmpty()) queue.add(temp);
				
				depth++;
				
			} else {
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}

		}

		return depth;
	}

}
