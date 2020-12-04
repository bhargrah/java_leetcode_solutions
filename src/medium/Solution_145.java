package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 145. Binary Tree Postorder Traversal
 * @see https://leetcode.com/problems/binary-tree-postorder-traversal/
 */

public class Solution_145 {
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
	 List<Integer> list = new ArrayList<>();
	    
	    public List<Integer> postorderTraversal(TreeNode root) {
	        postorder(root);        
	        return list;
	    }
	    
	    public void postorder(TreeNode root) {        
	        if(root!=null){
	            postorder(root.left);
	            postorder(root.right);
	            list.add(root.val);
	        }
	    }	    

}
