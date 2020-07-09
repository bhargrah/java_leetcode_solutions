package medium;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * @author rahulbhargava
 * @category 1325. Delete Leaves With a Given Value
 * @see https://leetcode.com/problems/delete-leaves-with-a-given-value/
 */


public class Solution_1161 {

	public class TreeNode {
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

	public int maxLevelSum(TreeNode root) {
		final int MIN = Integer.MIN_VALUE;

		int maxLevel = 0;
		int level = 0;
		int sum = 0;
		int maxSum = 0;

		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(root);

		TreeNode NULL = new TreeNode(MIN);
		queue.add(NULL);

		while (!queue.isEmpty()) {

			TreeNode temp = queue.poll();

			if (temp.val != MIN) {
				sum = sum + temp.val;
			}

			if (temp.val == MIN) {

				if (!queue.isEmpty())
					queue.add(NULL);

				level++;

				if (sum >= maxSum) {
					maxSum = sum;
					maxLevel = level;
				}

				sum = 0; // reset it for next level sum calculation

			} else {

				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
		}

		return maxLevel;
	}

}
