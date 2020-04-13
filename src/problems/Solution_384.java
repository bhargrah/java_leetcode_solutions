package problems;

import java.util.Random;

/**
 * @author rahulbhargava
 * @category 384. Shuffle an Array
 * @see https://leetcode.com/problems/shuffle-an-array/
 */

public class Solution_384 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int [] reset;
	public int [] nums;
	Random rand = new Random();
	
	public Solution_384(int[] nums) {
		this.nums = nums;
		this.reset = nums.clone();
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		nums = reset;
        return reset.clone();
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		 int lastIndex=nums.length;
	        for (int i = 0; i < nums.length; i++) {
	            
	        	int r=rand.nextInt(lastIndex);
	            // random swap-ing
	        	int t=nums[r];
	            nums[r]=nums[--lastIndex];
	            nums[lastIndex]=t;
	        }
		
		return nums;
	}

}
