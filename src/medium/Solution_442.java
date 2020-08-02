package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 442. Find All Duplicates in an Array
 * @see https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

public class Solution_442 {

	public static void main(String[] args) {

		int[] input = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.err.println(findDuplicates(input));

	}

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> result =  new ArrayList<>();
		if(nums.length==0) return result;
		
		
		// problem statement states that actual numbers cannot be out of range
		// if length is 5 all the number will be in range of 0 to 5. > 5 are not allowed
		for (int count = 0; count < nums.length; count++) {

			int num = Math.abs(nums[count]);
			int index = num - 1; //index starts from zero
			
			if(nums[index] < 0)
				result.add(num);
			else 
				nums[index] = -nums[index];
			
		}

		return result;
	}

}
