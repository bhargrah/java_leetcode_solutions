package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 136. Single Number
 * @see https://leetcode.com/problems/single-number/
 */
public class Solution_136 {

	public static void main(String[] args) {

		int [] input = {4,1,2,1,2};
		System.out.println(singleNumber(input));
	}

	public static int singleNumber(int[] nums) {
		
		int length = nums.length;
		Map<Integer,Integer> dict = new HashMap<>();
		
		for ( int iCnt = 0 ; iCnt < length ; iCnt ++) 
			if(dict.get(nums[iCnt]) == null) 
				dict.put(nums[iCnt], 1); // add when not present
			else 
				dict.remove(nums[iCnt]); // remove if present
		
		// assuming that key set will have only value
		return dict.keySet().iterator().next().intValue();

	}

}
