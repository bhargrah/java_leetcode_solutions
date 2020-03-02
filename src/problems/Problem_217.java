package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 217. Contains Duplicate
 * @see https://leetcode.com/problems/contains-duplicate/
 */
public class Problem_217 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3 ,2};
		System.out.println(containsDuplicate(input));

	}

	public static boolean containsDuplicate(int[] nums) {
		int lenght = nums.length;
		Map<Integer, Object> dict = new HashMap<>();
		for (int iCnt = 0; iCnt < lenght; iCnt++) {
			int key = nums[iCnt];
			if (dict.get(key) == null)
				dict.put(key,'a'); // storing char with lowest memory footprint
			else
				return true; //  breaking the loop as soon as duplicate detected
		}

		return false;
	}

}
