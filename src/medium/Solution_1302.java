package medium;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author rahulbhargava
 * @category 1302. Deepest Leaves Sum
 * @see https://leetcode.com/problems/deepest-leaves-sum/
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

public class Solution_1302 {
	public int deepestLeavesSum(TreeNode root) {
		
		final int MIN = -1;
		int sum = 0;
		int finalSum = 0;

		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(root);

		TreeNode NULL = new TreeNode(MIN);
		queue.add(NULL);

		while (!queue.isEmpty()) {

			TreeNode temp = queue.poll();

			if (temp.val != MIN) {
				System.out.println(temp.val);
				sum = sum + temp.val;
			}

			if (temp.val == MIN) {

				if (!queue.isEmpty())
					queue.add(NULL);
				finalSum = sum;
				sum = 0; // reset it for next level sum calculation

			} else {

				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
		}

		return finalSum;

	}

}
