package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rahulbhargava
 * @category 287. Find the Duplicate Number
 * @see hhttps://leetcode.com/problems/find-the-duplicate-number/
 */

public class Solution_287 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 2, 2 };
		System.out.println(findDuplicate(nums));

	}

	public static int findDuplicate(int[] nums) {

		int duplicate = 0;
		int n = nums.length;
		Set<Integer> dict = new HashSet<>();

		for (int iCnt = 0; iCnt < n; iCnt++) {

			if (!dict.add(nums[iCnt]))
				duplicate = nums[iCnt];

		}

		return duplicate;
	}

}
