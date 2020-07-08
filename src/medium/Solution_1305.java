package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author rahulbhargava
 * @category 1305. All Elements in Two Binary Search Trees
 * @see https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
 */

public class Solution_1305 {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

		List<Integer> list = new ArrayList<>();

		list = parseElements(root1, list);
		list = parseElements(root2, list);

		System.out.println(list);
		//Collections.sort(list);

		return list.stream().sorted().collect(Collectors.toList());

	}

	private List<Integer> parseElements(TreeNode root, List<Integer> list) {

		Stack<TreeNode> s = new Stack<>();

		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;
				list.add(root.val);
			}

			if (s.isEmpty())
				break;

			root = s.pop();
			root = root.right;
		}

		return list;
	}

}
